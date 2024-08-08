package com.example.proyectokotlinfundamentos

import java.math.BigDecimal

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
    val articulo1 = readln().toFloat()
    println("Ingresa valor artículo 2:")
    val articulo2 = readln().toFloat()
    println("Ingresa valor artículo 3:")
    val articulo3 = readln().toFloat()
    val neto = (articulo3+articulo2+articulo1).toDouble()
    val total = (neto * 18/100) + neto
    println("Valor neto: $neto")
    println("Valor total: $total")
}