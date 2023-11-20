import android.widget.ImageView
import com.example.parquesud1.Ficha
import com.example.parquesud1.R

class Jugador() {
    var id: String = ""
    var nombre: String = ""
    var color: String = ""
    var turnoActual: Boolean = false
    var avanzarFicha1: Boolean = false
    var avanzarFicha2: Boolean = false
    var dado1: Int? = 0
    var dado2: Int? = 0

    var arrayFichas: MutableList<Ficha> = mutableListOf()

    constructor(
        id: String,
        nombre: String,
        color: String,
        turnoActual: Boolean,
        avanzarFicha1: Boolean,
        avanzarFicha2: Boolean,
        dado1: Int?,
        dado2: Int?
    ) : this() {
        this.id = id
        this.nombre = nombre
        this.color = color
        this.turnoActual = turnoActual
        this.avanzarFicha1 = avanzarFicha1
        this.avanzarFicha2 = avanzarFicha2
        this.dado1 = dado1
        this.dado2 = dado2

        val ficha1 = Ficha(1, 0, 0, avanzarFicha1)
        val ficha2 = Ficha(2, 0, 0, avanzarFicha2)

        arrayFichas.add(ficha1)
        arrayFichas.add(ficha2)
    }
    fun lanzarDado1(): Int {
        dado1 = (1..6).random()
        return dado1 as Int
    }
    fun lanzarDado2(): Int {
        dado2 = (1..6).random()
        return dado2 as Int
    }


}
