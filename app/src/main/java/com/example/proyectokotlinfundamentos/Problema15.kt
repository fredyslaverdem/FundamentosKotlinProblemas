package com.example.proyectokotlinfundamentos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 08/08/2024
// Descripción: Solución del Problema 15 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema15()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema15() {
    // Desarrolle aquí la lógica
    println("Dame un numero de 4 cifras:")
    val num = readln().toInt()
    var numeroOriginal = num
    var numeroInvertido = 0

    while (numeroOriginal > 0) {
        numeroInvertido = numeroInvertido * 10 + numeroOriginal % 10
        numeroOriginal /= 10
    }

    if (num == numeroInvertido) {
        println("SÍ")
    } else {
        println("NO")
    }

}