package com.example.proyectokotlinfundamentos

// Nombre:Fredy Santiago Laverde Mora
// Fecha:08/08/2024
// Descripción: Solución del Problema 3 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema3()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema3() {
    // Desarrolle aquí la lógica
    println("Ingresa la asignatura:")
    var materia:String = readln()
    println("Ingresa nota primer corte:")
    var np = readln().toFloat()
    println("Ingresa nota segundo corte:")
    var ns = readln().toFloat()
    println("Ingresa nota tercer corte:")
    var nt = readln().toFloat()
    var total:Float = ((np*0.33) + (ns*0.33) + (nt*0.34)).toFloat()
    println("Asignatura: $materia")
    println("Definitiva: $total")
}