package com.example.proyectokotlinfundamentos


// Nombre: Fredy Santiago Laverde Mora
// Fecha: 08/08/2024
// Descripción: Solución del Problema 9 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema9()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema9() {
    // Desarrolle aquí la lógica
    println("Dame num1:")
    val num1 = readln().toInt()
    println("Dame num2:")
    val num2 = readln().toInt()
    val doble = (2*num2)

    if (num1 > doble) {
        println("Wow!")
    } else {
        println("Aburrido!")
    }
}