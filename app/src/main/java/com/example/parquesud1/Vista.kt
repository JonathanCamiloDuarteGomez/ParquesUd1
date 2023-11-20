package com.example.parquesud1

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout


class Vista(mainActivity: MainActivity) {


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

    fun miniFila1_11(layout: LinearLayout) {
        layout.visibility = View.VISIBLE

        layout.findViewById<ImageView>(R.id.jugador11_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador11_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador11_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador11_2_2).visibility = View.INVISIBLE
    }

    fun miniFila1_12(layout: LinearLayout) {
        layout.visibility = View.VISIBLE

        layout.findViewById<ImageView>(R.id.jugador12_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador12_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador12_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador12_2_2).visibility = View.INVISIBLE
    }
    fun miniFila1_13(layout: LinearLayout) {
        layout.visibility = View.VISIBLE

        layout.findViewById<ImageView>(R.id.jugador13_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador13_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador13_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador13_2_2).visibility = View.INVISIBLE
    }
    fun miniFila1_14(layout: LinearLayout) {
        layout.visibility = View.VISIBLE

        layout.findViewById<ImageView>(R.id.jugador14_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador14_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador14_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador14_2_2).visibility = View.INVISIBLE
    }
    fun miniFila1_15(layout: LinearLayout) {
        layout.visibility = View.VISIBLE

        layout.findViewById<ImageView>(R.id.jugador15_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador15_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador15_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador15_2_2).visibility = View.INVISIBLE
    }
    fun miniFila1_16(layout: LinearLayout) {
        layout.visibility = View.VISIBLE

        layout.findViewById<ImageView>(R.id.jugador16_1_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador16_1_2).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador16_2_1).visibility = View.INVISIBLE
        layout.findViewById<ImageView>(R.id.jugador16_2_2).visibility = View.INVISIBLE
    }


    fun miniColumnaAdministradorDeVisivilidad(layout: LinearLayout, jugador: Int ?, casilla: Int ?, ficha: Int ?,aparecer : Int ?) {
        //miniColumna1_1
        Log.d("TAG", "movePiece: No muestra 2 ${casilla}")
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
            //miniColumna1_7
            7 -> {
                when (jugador) {
                    1 -> {
                        layout.visibility = View.VISIBLE
                        // Lógica para casilla 1, jugador 1
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador7_1_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador7_1_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador7_1_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador7_1_2).visibility = View.INVISIBLE
                            }
                        }


                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador7_2_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador7_2_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador7_2_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador7_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }
            //miniColumna1_8
            8 -> {
                when (jugador) {
                    1 -> {
                        layout.visibility = View.VISIBLE
                        // Lógica para casilla 1, jugador 1
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador8_1_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador8_1_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador8_1_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador8_1_2).visibility = View.INVISIBLE
                            }
                        }


                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador8_2_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador8_2_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador8_2_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador8_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }
            //miniColumna1_9
            9 -> {
                when (jugador) {
                    1 -> {
                        layout.visibility = View.VISIBLE
                        // Lógica para casilla 1, jugador 1
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador9_1_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador9_1_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador9_1_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador9_1_2).visibility = View.INVISIBLE
                            }
                        }


                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador9_2_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador9_2_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador9_2_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador9_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }
            //miniColumna1_10
            10 -> {
                when (jugador) {
                    1 -> {
                        layout.visibility = View.VISIBLE
                        // Lógica para casilla 1, jugador 1
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador10_1_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador10_1_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador10_1_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador10_1_2).visibility = View.INVISIBLE
                            }
                        }


                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador10_2_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador10_2_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador10_2_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador10_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }
            //miniFila1_11
            11 -> {
                when (jugador) {
                    1 -> {
                        layout.visibility = View.VISIBLE
                        // Lógica para casilla 1, jugador 1
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador11_1_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador11_1_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador11_1_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador11_1_2).visibility = View.INVISIBLE
                            }
                        }


                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when(ficha){
                            1 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador11_2_1).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador11_2_1).visibility = View.INVISIBLE
                            }
                            2 ->when(aparecer){
                                1->layout.findViewById<ImageView>(R.id.jugador11_2_2).visibility = View.VISIBLE
                                2->layout.findViewById<ImageView>(R.id.jugador11_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }
            //miniFila1_12
            12 -> {
                when (jugador) {
                    1 -> {
                        layout.visibility = View.VISIBLE
                        // Lógica para casilla 1, jugador 1
                        when (ficha) {
                            1 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador12_1_1).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador12_1_1).visibility = View.INVISIBLE
                            }
                            2 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador12_1_2).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador12_1_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when (ficha) {
                            1 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador12_2_1).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador12_2_1).visibility = View.INVISIBLE
                            }
                            2 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador12_2_2).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador12_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }

//miniFila1_13
            13 -> {
                when (jugador) {
                    1 -> {
                        layout.visibility = View.VISIBLE
                        // Lógica para casilla 1, jugador 1
                        when (ficha) {
                            1 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador13_1_1).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador13_1_1).visibility = View.INVISIBLE
                            }
                            2 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador13_1_2).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador13_1_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when (ficha) {
                            1 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador13_2_1).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador13_2_1).visibility = View.INVISIBLE
                            }
                            2 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador13_2_2).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador13_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }

//miniFila1_14
            14 -> {
                when (jugador) {
                    1 -> {
                        layout.visibility = View.VISIBLE
                        // Lógica para casilla 1, jugador 1
                        when (ficha) {
                            1 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador14_1_1).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador14_1_1).visibility = View.INVISIBLE
                            }
                            2 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador14_1_2).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador14_1_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when (ficha) {
                            1 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador14_2_1).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador14_2_1).visibility = View.INVISIBLE
                            }
                            2 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador14_2_2).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador14_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }

//miniFila1_15
            15 -> {
                when (jugador) {
                    1 -> {
                        layout.visibility = View.VISIBLE
                        // Lógica para casilla 1, jugador 1
                        when (ficha) {
                            1 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador15_1_1).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador15_1_1).visibility = View.INVISIBLE
                            }
                            2 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador15_1_2).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador15_1_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when (ficha) {
                            1 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador15_2_1).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador15_2_1).visibility = View.INVISIBLE
                            }
                            2 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador15_2_2).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador15_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }

//miniFila1_16
            16 -> {
                when (jugador) {
                    1 -> {
                        layout.visibility = View.VISIBLE
                        // Lógica para casilla 1, jugador 1
                        when (ficha) {
                            1 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador16_1_1).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador16_1_1).visibility = View.INVISIBLE
                            }
                            2 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador16_1_2).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador16_1_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                    2 -> {
                        // Lógica para casilla 1, jugador 2
                        when (ficha) {
                            1 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador16_2_1).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador16_2_1).visibility = View.INVISIBLE
                            }
                            2 -> when (aparecer) {
                                1 -> layout.findViewById<ImageView>(R.id.jugador16_2_2).visibility = View.VISIBLE
                                2 -> layout.findViewById<ImageView>(R.id.jugador16_2_2).visibility = View.INVISIBLE
                            }
                        }
                    }
                }
            }

            // Agregar más casos según sea necesario
        }
    }


}