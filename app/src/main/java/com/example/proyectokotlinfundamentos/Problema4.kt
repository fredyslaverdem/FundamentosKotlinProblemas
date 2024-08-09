package com.example.proyectokotlinfundamentos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 08/08/2024
// Descripción: Solución del Problema 4 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema4()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema4() {
    // Desarrolle aquí la lógica
    println("Ingresa valor artículo 1:")
    val articulo1 = readln().toDouble()
    println("Ingresa valor artículo 2:")
    val articulo2 = readln().toDouble()
    println("Ingresa valor artículo 3:")
    val articulo3 = readln().toDouble()
    val neto = (articulo3+articulo2+articulo1).toDouble()
    val total:Double = (neto * 1.18)
    println("Valor neto: $neto")
    println("Valor total: $total")
}