package com.example.proyectokotlinfundamentos

import kotlin.math.pow // Se impporta ya que el operador ** no funciona (Puede ser problemas de instalación)

// Nombre: Fredy Santiago Laverde Mora
// Fecha: 08/08/2024
// Descripción: Solución del Problema 8 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema8()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema8() {
    // Desarrolle aquí la lógica
    println("Dame la base:")
    val base = readln().toDouble()
    println("Dame el exponente:")
    val exponente = readln().toInt()
    val oper = base.pow(exponente)

    if (oper > 5000) {
        println("Muy grande.")
    } else {
        println("Números óptimos.")
    }

}