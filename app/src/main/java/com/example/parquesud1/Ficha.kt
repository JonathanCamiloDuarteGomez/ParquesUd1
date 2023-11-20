package com.example.parquesud1

import android.annotation.SuppressLint

class Ficha(
    private var numeroDeLaFicha: Int? = null,
    private var posicionActual: Int? = null,
    private var posicionAvanzar: Int? = null,
    private var avanzar: Boolean? = null
) {
    constructor() : this(null, null, null, null) {
        // Constructor vacío requerido por Firebase para deserialización
    }
    companion object {
        const val CASILLA_FINAL = 10
    }

    // Getters y setters para las propiedades
    var numeroFicha: Int?
        get() = numeroDeLaFicha
        set(value) {
            numeroDeLaFicha = value
        }

    var posicionActualFicha: Int?
        get() = posicionActual
        set(value) {
            posicionActual = value
        }

    var posicionAvanzarFicha: Int?
        get() = posicionAvanzar
        set(value) {
            posicionAvanzar = value
        }

    var avanzarFicha: Boolean?
        get() = avanzar
        set(value) {
            avanzar = value
        }
    fun avanzarCasillas(casillas: Int): Int {
        posicionActual = (posicionActual ?: 0) + casillas
        return posicionActual ?: 0
    }

    fun haAlcanzadoCasillaFinal(): Boolean {
        return posicionActual ?: 0 >= CASILLA_FINAL
    }
}
