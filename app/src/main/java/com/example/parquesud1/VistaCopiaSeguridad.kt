package com.example.parquesud1

import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout






class VistaCopiaSeguridad(mainActivity: MainActivity) {
    fun miniColumna1_1(layout: LinearLayout) {//cuadrante 1 columna 1
        layout.visibility = View.VISIBLE

        layout.findViewById<ImageView>(R.id.jugador1_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador1_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador1_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador1_2_2).visibility = View.INVISIBLE
    }

    fun miniColumna1_2(layout: LinearLayout) {//cuadrante 1 columna 2
        layout.visibility = View.VISIBLE
        layout.findViewById<ImageView>(R.id.jugador2_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador2_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador2_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador2_2_2).visibility = View.INVISIBLE
    }
    fun miniColumna1_3(layout: LinearLayout) {//cuadrante 1 columna 3
        layout.visibility = View.VISIBLE
        layout.findViewById<ImageView>(R.id.jugador3_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador3_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador3_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador3_2_2).visibility = View.INVISIBLE
    }
    fun miniColumna1_4(layout: LinearLayout) {//cuadrante 1 columna 4
        layout.visibility = View.VISIBLE
        layout.findViewById<ImageView>(R.id.jugador4_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador4_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador4_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador4_2_2).visibility = View.INVISIBLE
    }
    fun miniColumna1_5(layout: LinearLayout) {//cuadrante 1 columna 5
        layout.visibility = View.VISIBLE
        layout.findViewById<ImageView>(R.id.jugador5_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador5_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador5_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador5_2_2).visibility = View.INVISIBLE
    }
    fun miniColumna1_6(layout: LinearLayout) {//cuadrante 1 columna 6
        layout.visibility = View.VISIBLE
        layout.findViewById<ImageView>(R.id.jugador6_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador6_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador6_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador6_2_2).visibility = View.INVISIBLE

    }
    fun miniColumna1_7(layout: LinearLayout) {//cuadrante 1 fichas 7
        layout.visibility = View.VISIBLE
        layout.findViewById<ImageView>(R.id.jugador7_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador7_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador7_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador7_2_2).visibility = View.INVISIBLE
    }
    fun miniColumna1_8(layout: LinearLayout) {
        layout.visibility = View.VISIBLE
        layout.findViewById<ImageView>(R.id.jugador8_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador8_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador8_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador8_2_2).visibility = View.INVISIBLE
    }

    fun miniColumna1_9(layout: LinearLayout) {
        layout.visibility = View.VISIBLE
        layout.findViewById<ImageView>(R.id.jugador9_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador9_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador9_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador9_2_2).visibility = View.INVISIBLE
    }
    fun miniColumna1_10(layout: LinearLayout) {
        layout.visibility = View.VISIBLE
        //pendiente: necesito aplicar el aqui.Tambien necesito implementar lo del main
        //y esto del visible va apenas llamen a casilla.
        //falta implementar mini finla
        //corregir los include de minifila
        //falta Casa Cuadrante 1
        layout.findViewById<ImageView>(R.id.jugador10_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador10_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador10_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador10_2_2).visibility = View.INVISIBLE
    }


    fun miniColumnaAdministradorDeVisivilidad(layout: LinearLayout, jugador: Int ?, casilla: Int ?, ficha: Int ?,aparecer : Int ?) {
        //miniColumna1_1
        when (casilla) {
            1 -> {
                when (jugador) {
                    1 -> {
                        // Lógica para casilla 1, jugador 1
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador1_1_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador1_1_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador1_1_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador1_1_2).visibility = View.INVISIBLE
                            }
                        }


                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador1_2_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador1_2_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador1_2_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador1_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }
            //miniColumna1_2
            2 -> {
                when (jugador) {
                    1 -> {
                        layout.visibility = View.VISIBLE
                        // Lógica para casilla 1, jugador 1
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador2_1_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador2_1_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador2_1_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador2_1_2).visibility = View.INVISIBLE
                            }
                        }


                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador2_2_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador2_2_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador2_2_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador2_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }
            //miniColumna1_3
            3 -> {
                when (jugador) {
                    1 -> {
                        layout.visibility = View.VISIBLE
                        // Lógica para casilla 1, jugador 1
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador3_1_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador3_1_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador3_1_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador3_1_2).visibility = View.INVISIBLE
                            }
                        }


                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador3_2_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador3_2_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador3_2_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador3_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }
            //miniColumna1_4
            4 -> {
                when (jugador) {
                    1 -> {
                        layout.visibility = View.VISIBLE
                        // Lógica para casilla 1, jugador 1
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador4_1_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador4_1_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador4_1_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador4_1_2).visibility = View.INVISIBLE
                            }
                        }


                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador4_2_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador4_2_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador4_2_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador4_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }
            //miniColumna1_5
            5 -> {
                when (jugador) {
                    1 -> {
                        layout.visibility = View.VISIBLE
                        // Lógica para casilla 1, jugador 1
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador5_1_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador5_1_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador5_1_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador5_1_2).visibility = View.INVISIBLE
                            }
                        }


                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador5_2_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador5_2_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador5_2_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador5_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }
            //miniColumna1_6
            6 -> {
                when (jugador) {
                    1 -> {
                        layout.visibility = View.VISIBLE
                        // Lógica para casilla 1, jugador 1
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador6_1_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador6_1_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador6_1_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador6_1_2).visibility = View.INVISIBLE
                            }
                        }


                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador6_2_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador6_2_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador6_2_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador6_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }
            // Agregar más casos según sea necesario
        }
    }

    /*
    if(aux==0){


                  // Paso 1: Recupera los datos actuales de Firebase para Jugador1
                  val jugador1Ref = jugadoresRef.child("Jugador1")

                  jugador1Ref.addListenerForSingleValueEvent(object : ValueEventListener {
                      override fun onDataChange(dataSnapshot: DataSnapshot) {
                          val jugador1 = dataSnapshot.getValue(Jugador::class.java)

                          // Paso 2: Modifica los datos y actualiza en Firebase
                          jugador1?.let {

                              it.posicionAvanzar = 30

                              // Actualiza los datos en Firebase para Jugador1
                              if(it.turnoActual==true){
                                  it.turnoActual=false
                                  btnJugador.isEnabled=false
                                  aux++
                              }else if(it.turnoActual==false && aux==0){
                                 it.turnoActual==true
                                  btnJugador.isEnabled=true
                                }
                              jugador1Ref.setValue(it)
                          }
                      }
                      override fun onCancelled(databaseError: DatabaseError) {
                          println("Error al leer los datos: ${databaseError.toException()}")
                      }
                  })

              }else if(aux==1){
                  if(btnJugador.isEnabled==false)btnJugador.isEnabled=true
                  // Paso 1: Recupera los datos actuales de Firebase para Jugador2
                  val jugador2Ref = jugadoresRef.child("Jugador2")

                  jugador2Ref.addListenerForSingleValueEvent(object : ValueEventListener {
                      override fun onDataChange(dataSnapshot: DataSnapshot) {
                          val jugador2 = dataSnapshot.getValue(Jugador::class.java)

                          // Paso 2: Modifica los datos y actualiza en Firebase
                          jugador2?.let {

                              it.posicionAvanzar = 20

                              // Actualiza los datos en Firebase para Jugador2
                              if(it.turnoActual==true){
                                  it.turnoActual=false
                                  btnJugador.isEnabled=false
                                  aux++
                              }else if(it.turnoActual==false && aux==1){
                                  it.turnoActual==true
                                  btnJugador.isEnabled=true
                              }
                              jugador2Ref.setValue(it)
                          }
                      }

                      override fun onCancelled(databaseError: DatabaseError) {
                          println("Error al leer los datos: ${databaseError.toException()}")
                      }
                  })
                  btnJugador.isEnabled=false
                  aux++;
              }else{
                  aux=0
              }
     */


}

/*
// Configura un oyente de clic para el botón
        btnJugador.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                // Recupera el valor actual de aux desde Firebase
                auxRef.addListenerForSingleValueEvent(object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        var aux: Int = dataSnapshot.getValue(Int::class.java) ?: 0

                        Log.d("TAG", "Valor actual de aux: $aux")
                        btnJugador.isEnabled = !btnJugador.isEnabled
                        // Realiza las operaciones según el valor de aux
                        when (aux) {
                            1 -> {
                                // Código para el primer jugador (Jugador1)
                                val jugador1Ref = jugadoresRef.child("Jugador1")

                                jugador1Ref.addListenerForSingleValueEvent(object : ValueEventListener {
                                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                                        val jugador1 = dataSnapshot.getValue(Jugador::class.java)

                                        jugador1?.let {
                                            it.posicionAvanzar = 30

                                            if (it.turnoActual == true) {
                                                it.turnoActual = false

                                                Log.d("TAG", "Jugador1 - Turno Cambio a FALSE - Cambio a Jugador2 111111111")
                                                // Incrementa el valor de aux y guárdalo de nuevo en Firebase
                                                aux++
                                                auxRef.setValue(aux)

                                                btnJugador.isEnabled = !btnJugador.isEnabled
                                                Log.d("TAG", "Valor actual de aux: $aux")
                                            } else if (it.turnoActual == false && aux == 1) {
                                                it.turnoActual = true

                                                Log.d("TAG", "Jugador1 - Turno Cambio a TRUE 222222222")
                                                // Incrementa el valor de aux y guárdalo de nuevo en Firebase
                                                aux++
                                                auxRef.setValue(aux)

                                                Log.d("TAG", "Valor actual de aux: $aux")
                                                btnJugador.isEnabled = !btnJugador.isEnabled
                                            }else{
                                                Log.d("ERROR", "onDataChange: ERrorrr 1")
                                            }
                                            jugador1Ref.setValue(it)
                                        }
                                    }

                                    override fun onCancelled(databaseError: DatabaseError) {
                                        println("Error al leer los datos: ${databaseError.toException()}")
                                    }
                                })
                            }
                            2 -> {
                                // Código para el segundo jugador (Jugador2)
                                //if (!btnJugador.isEnabled) btnJugador.isEnabled = true
                                val jugador2Ref = jugadoresRef.child("Jugador2")

                                jugador2Ref.addListenerForSingleValueEvent(object : ValueEventListener {
                                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                                        val jugador2 = dataSnapshot.getValue(Jugador::class.java)

                                        jugador2?.let {

                                            if (it.turnoActual == true) {
                                                it.posicionAvanzar = 20
                                                it.turnoActual = false
                                                //btnJugador.isEnabled = !btnJugador.isEnabled

                                                Log.d("TAG", "Jugador2 - Turno cambio a FALSE - Cambio a aux=1")
                                                // No incrementes aux aquí; ya lo incrementarás después de reiniciar

                                                Log.d("TAG", "Valor actual de aux: $aux")
                                                btnJugador.isEnabled = !btnJugador.isEnabled

                                            } else if (it.turnoActual == false && aux == 2) {
                                                it.turnoActual = true
                                                //btnJugador.isEnabled = !btnJugador.isEnabled

                                                Log.d("TAG", "Jugador2 - Turno TRUE")
                                                // Incrementa el valor de aux y guárdalo de nuevo en Firebase

                                                Log.d("TAG", "Valor actual de aux: $aux")

                                                btnJugador.isEnabled = !btnJugador.isEnabled
                                            } else {
                                                Log.d("ERROR", "onDataChange: Error en Jugador2")
                                            }

                                            jugador2Ref.setValue(it)
                                        }
                                    }

                                    override fun onCancelled(databaseError: DatabaseError) {
                                        println("Error al leer los datos: ${databaseError.toException()}")
                                    }
                                })

                                Log.d("TAG", "Reiniciando aux a 1")

                                // Reinicia el turno de Jugador1 a true
                                val jugador1Ref = jugadoresRef.child("Jugador1")
                                jugador1Ref.child("turnoActual").setValue(true)
                                auxRef.setValue(1)
                                //jugador2Ref.child("turnoActual").setValue(true)

                                // Cuando aux es 3, actualiza aux en Firebase nuevamente a 1 y reinicia jugador1


                            }

                        }

                    }

                    override fun onCancelled(databaseError: DatabaseError) {
                        println("Error al leer el valor de aux: ${databaseError.toException()}")
                    }
                })
            }
        })
*/