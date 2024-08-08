package com.example.proyectokotlinfundamentos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 08/08/2024
// Descripción: Solución del Problema 5 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema5()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema5() {
    // Desarrolle aquí la lógica
    println("e:")
    val e = readln().toInt()
    println("m:")
    val m = readln().toInt()
    val salida:Int = (m/e)
    val canasta = (m%e)
    println("Cada estudiante recibirá: $salida manzanas.")
    println("Quedarán en la canasta: $canasta manzanas.")

}