package com.example.proyectokotlinfundamentos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 08/08/2024
// Descripción: Solución del Problema 13 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema13()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema13() {
    // Desarrolle aquí la lógica
    println("Dame un numero:")
    val num = readln().toInt()

    val n1 = num/100
    val n2 = (num%100) / 10
    val n3 = num % 10

    if (n1 < n2 && n2 < n3) {
        println("SÍ")
    } else {
        println("NO")
    }
}