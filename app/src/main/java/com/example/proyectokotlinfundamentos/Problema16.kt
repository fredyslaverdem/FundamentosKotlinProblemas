package com.example.proyectokotlinfundamentos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 08/08/2024
// Descripción: Solución del Problema 16 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema16()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema16() {
    // Desarrolle aquí la lógica
    println("n:")
    val n = readln().toInt()
    println("m:")
    val m = readln().toInt()
    println("k:")
    val k = readln().toInt()

    if (k > n * m) {
        println("NO")
        return
    }

    if (k % n == 0 || k % m == 0 || (k <= n && k <= m)) {
        println("SÍ")
    } else {
        println("NO")
    }
}