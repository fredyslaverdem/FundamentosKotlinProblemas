package com.example.proyectokotlinfundamentos

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 08/08/2024
// Descripción: Solución del Problema 6 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema6()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema6() {
    // Desarrolle aquí la lógica
    println("Dame un número entero:")
    val numero = readln().toInt()

    val digito1:Int = numero/100
    val digito2:Int = (numero%100) / 10
    val digito3:Int = numero % 10

    val suma = digito1 + digito2 + digito3
    println("La suma de los dígitos del número $numero es igual a $suma.")
}