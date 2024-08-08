package com.example.proyectokotlinfundamentos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 08/08/2024
// Descripción: Solución del Problema 12 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema12()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema12() {
    // Desarrolle aquí la lógica
    println("Dame num1:")
    val num1 = readln().toInt()
    println("Dame num2:")
    val num2 = readln().toInt()
    println("Dame num3:")
    val num3 = readln().toInt()

    var igualdad = 0

    if (num1 == num2) {
        igualdad++
    }
    if (num1 == num3) {
        igualdad++
    }
    if (num2 == num3) {
        igualdad++
    }

    if (igualdad == 3) {
        println("3")
    } else if (igualdad == 2 || igualdad == 1) {
        println("2")
    } else {
        println("0")
    }

}