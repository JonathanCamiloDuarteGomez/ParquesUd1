package com.example.parquesud1
import Jugador
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*

class MainActivity : AppCompatActivity() {
    // Declaración de variables
    private lateinit var btnJugador: ImageButton
    private lateinit var jugadoresRef: DatabaseReference
    private lateinit var auxRef: DatabaseReference

    private lateinit var jugador: Jugador


    private val currentUserID = FirebaseAuth.getInstance().currentUser?.uid

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicialización de vistas y referencias a la base de datos
        btnJugador = findViewById(R.id.playBtn)
        jugadoresRef = FirebaseDatabase.getInstance().getReference("Jugadores")
        auxRef = FirebaseDatabase.getInstance().getReference("aux")

        // Configuración de listeners y vistas
        setupListeners()
        initializeViews()

        // Creación del objeto Jugador y simulación de movimiento de ficha
        jugador = Jugador(
            id = "ID_Jugador1",
            nombre = "Jugador 1",
            color = "Rojo",
            turnoActual = true,
            avanzarFicha1 = false,
            avanzarFicha2 = false,
            dado1 = null,//estos son los resulatados de los dados
            dado2 = null
        )

            //vistaDados(1)
            //vistaDados(2)


    }
    private fun vistaDados(nDado: Int) {
        val drawableIds = mapOf(
            1 to R.drawable.dado,
            2 to R.drawable.dado2,
            3 to R.drawable.dado3,
            4 to R.drawable.dado4,
            5 to R.drawable.dado5,
            6 to R.drawable.dado6
        )
        //Log.d("TAG", "Numero de dado: ${nDado} ")
        val resultadoDado = when (nDado) {
            1 -> jugador.lanzarDado1()
            2 -> jugador.lanzarDado2()
            else -> 1 // Si nDado no es ni 1 ni 2, se lanza el primer dado
        }
        //Log.d("TAG", "vistaDados Entro: dado 1 ${jugador.dado1} dado 2 ${jugador.dado2} ")
        val imageViewId = when (nDado) {
            1 -> R.id.dado1
            2 -> R.id.dado2
            else -> R.id.dado1
        }

        val imageView = findViewById<ImageView>(imageViewId)
        imageView.setImageResource(drawableIds[resultadoDado] ?: R.drawable.play)
    }




    // Configura el listener para el botón del jugador
    private fun setupListeners() {
        btnJugador.setOnClickListener {
            // Agrega un listener para leer el valor de 'aux' desde Firebase
            auxRef.addListenerForSingleValueEvent(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    var aux: Int = dataSnapshot.getValue(Int::class.java) ?: 0

                    // Realiza operaciones según el valor de 'aux'
                    when (aux) {
                        1 -> handlePlayerTurn("Jugador1")
                        2 -> handlePlayerTurn("Jugador2")
                    }
                }

                override fun onCancelled(databaseError: DatabaseError) {
                    Log.e("TAG", "Error al leer el valor de aux: ${databaseError.toException()}")
                }
            })
        }
    }
    // Función para manejar el turno del jugador
    private fun handlePlayerTurn(playerRef: String) {
        val currentPlayerRef = jugadoresRef.child(playerRef)

        currentPlayerRef.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val playerData = dataSnapshot.getValue(Jugador::class.java)
                playerData?.let { player ->
                    if (currentUserID == player.id) {
                        vistaDados(1)
                        vistaDados(2)

                        // Actualizar datos en la base de datos
                        currentPlayerRef.apply {
                            child("dado1").setValue(jugador.dado1)
                            child("dado2").setValue(jugador.dado2)
                            child("turnoActual").setValue(!player.turnoActual)
                        }

                        // Actualizar el turno y 'aux' en la base de datos
                        updateTurnAndAux(auxRef, currentPlayerRef, player)
                    }
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.e("TAG", "Error al leer los datos: ${databaseError.toException()}")
            }
        })
    }
    private fun updateTurnAndAux(auxRef: DatabaseReference, currentPlayerRef: DatabaseReference, player: Jugador) {
        auxRef.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val currentValue = snapshot.getValue(Int::class.java) ?: 0
                val txtVerJugador = findViewById<TextView>(R.id.txtVerJugador)

                if (currentValue == 2) {
                    movePiece(jugador, player, 2, jugador.dado1!!, 1)
                    movePiece(jugador, player, 2, jugador.dado2!!, 2)
                    txtVerJugador.text = getString(R.string.txtverJugador2)
                    auxRef.setValue(1)
                } else if (currentValue != 2) {
                    movePiece(jugador, player, 1, jugador.dado1!!, 1)
                    movePiece(jugador, player, 1, jugador.dado2!!, 2)
                    txtVerJugador.text = getString(R.string.txtverJugador1)
                    auxRef.setValue(currentValue + 1)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("TAG", "Error al leer el valor de aux: ${error.toException()}")
            }
        })
    }





    private fun getPlayerReferenceBasedOnName(playerName: String): String {
        return when (playerName) {
            "camilo" -> "Jugador1" // Aquí retorna la referencia correspondiente en la base de datos para el jugador "camilo"
            "Jonathan" -> "Jugador2" // Aquí retorna la referencia correspondiente en la base de datos para el jugador "Jonathan"
            else -> "" // En caso de otro nombre de jugador, debes manejarlo según tu estructura de datos
        }
    }




    // Inicializa las vistas (ImageViews) y las referencias a los LinearLayouts
    private fun initializeViews() {
        //dado1 = findViewById(R.id.dado1)
        //dado2 = findViewById(R.id.dado2)

        val vista = Vista(this)
        val miniColumna1Layout = findViewById<LinearLayout>(R.id.minicolumna1)
        val miniColumna2Layout = findViewById<LinearLayout>(R.id.minicolumna2)
        val miniColumna3Layout = findViewById<LinearLayout>(R.id.minicolumna3)
        val miniColumna4Layout = findViewById<LinearLayout>(R.id.minicolumna4)
        val miniColumna5Layout = findViewById<LinearLayout>(R.id.minicolumna5)
        val miniColumna6Layout = findViewById<LinearLayout>(R.id.minicolumna6)
        val miniColumna7Layout = findViewById<LinearLayout>(R.id.minicolumna7)
        val miniColumna8Layout = findViewById<LinearLayout>(R.id.minicolumna8)
        val miniColumna9Layout = findViewById<LinearLayout>(R.id.minicolumna9)
        val miniColumna10Layout = findViewById<LinearLayout>(R.id.minicolumna10)
        val miniFila11Layout = findViewById<LinearLayout>(R.id.minifila11)
        val miniFila12Layout = findViewById<LinearLayout>(R.id.minifila12)
        val miniFila13Layout = findViewById<LinearLayout>(R.id.minifila13)
        val miniFila14Layout = findViewById<LinearLayout>(R.id.minifila14)
        val miniFila15Layout = findViewById<LinearLayout>(R.id.minifila15)
        val miniFila16Layout = findViewById<LinearLayout>(R.id.minifila16)


        vista.miniColumna1_1(miniColumna1Layout)
        vista.miniColumna1_2(miniColumna2Layout)
        vista.miniColumna1_3(miniColumna3Layout)
        vista.miniColumna1_4(miniColumna4Layout)
        vista.miniColumna1_5(miniColumna5Layout)
        vista.miniColumna1_6(miniColumna6Layout)
        vista.miniColumna1_7(miniColumna7Layout)
        vista.miniColumna1_8(miniColumna8Layout)
        vista.miniColumna1_9(miniColumna9Layout)
        vista.miniColumna1_10(miniColumna10Layout)
        vista.miniFila1_11(miniFila11Layout)
        vista.miniFila1_12(miniFila12Layout)
        vista.miniFila1_13(miniFila13Layout)
        vista.miniFila1_14(miniFila14Layout)
        vista.miniFila1_15(miniFila15Layout)
        vista.miniFila1_16(miniFila16Layout)

    }

    // Simula el movimiento de la ficha del jugador en el tablero
    private fun movePiece(jugador: Jugador,player:Jugador, jugadorTurno: Int, casilla: Int, ficha: Int) {
        var casillaAnterior = jugador.arrayFichas[ficha - 1]?.posicionActualFicha!!
        val vista = Vista(this)
        var posicionAvanzar = 0

        vista.miniColumnaAdministradorDeVisivilidad(findViewById(getCasillaLayoutId(casillaAnterior)), jugadorTurno, casillaAnterior, ficha, 2)

        posicionAvanzar += casilla + casillaAnterior
        jugador.arrayFichas[ficha - 1]?.posicionActualFicha = posicionAvanzar

        // Aquí se actualiza la casilla anterior y la posición avanzada en la base de datos
        val currentPlayerRef = jugadoresRef.child(getPlayerReferenceBasedOnName(player.nombre))
        currentPlayerRef.child("arrayFichas").child((ficha ).toString()).child("posicionActual").setValue(casillaAnterior)
        currentPlayerRef.child("arrayFichas").child((ficha ).toString()).child("posicionAvanzar").setValue(posicionAvanzar)

        vista.miniColumnaAdministradorDeVisivilidad(findViewById(getCasillaLayoutId(posicionAvanzar)), jugadorTurno, posicionAvanzar, ficha, 1)
    }

    // Devuelve el ID del LinearLayout correspondiente a una casilla específica
    private fun getCasillaLayoutId(casilla: Int): Int {
        return when (casilla) {
            1 -> R.id.minicolumna1
            2 -> R.id.minicolumna2
            3 -> R.id.minicolumna3
            4 -> R.id.minicolumna4
            5 -> R.id.minicolumna5
            6 -> R.id.minicolumna6
            7 -> R.id.minicolumna7
            8 -> R.id.minicolumna8
            9 -> R.id.minicolumna9
            10 -> R.id.minicolumna10
            11 -> R.id.minifila11
            12 -> R.id.minifila12
            13 -> R.id.minifila13
            14 -> R.id.minifila14
            15 -> R.id.minifila15
            16 -> R.id.minifila16
            else -> R.id.minicolumna1
        }

    }
}
