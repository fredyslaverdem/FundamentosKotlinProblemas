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
    val digito1 = num / 1000
    val digito2 = (num % 1000) / 100
    val digito3 = (num % 100) / 10
    val digito4 = num % 10

    if (digito1 == digito4 && digito2 == digito3) {
        println("SÍ")
    } else {
        println("NO")
    }

}