package com.example.proyectokotlinfundamentos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 08/08/2024
// Descripción: Solución del Problema 10 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema10()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema10() {
    // Desarrolle aquí la lógica
    println("Dame num:")
    val num = readln().toInt()
    val oper = (num%10)

    if (oper == 0) {
        println("Divisible.")
    } else {
        println("No divisible.")
    }
}