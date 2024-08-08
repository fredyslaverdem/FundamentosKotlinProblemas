package com.example.proyectokotlinfundamentos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 08/08/2024
// Descripción: Solución del Problema 7 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema7()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema7() {
    // Desarrolle aquí la lógica
    println("¿Cuántos sonidos del grillo escuchaste por minuto?")
    val n = readln().toFloat()
    if (n >= 0) {
        val t = ((n/4.0) + 40.0).toFloat()
        println("Dados los sonidos del grillo, la temperatura es de $t °F.")
    } else {
        println("Seguro investigador, ¿un grillo puede hacer ese número de sonidos?")
    }

}