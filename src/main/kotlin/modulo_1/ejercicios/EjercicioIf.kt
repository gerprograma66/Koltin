package modulo_1.ejercicios


import java.util.Scanner

//Descuentos A Aplicar
const val REGULAR = 0.05F
const val PREMIUM = 0.15F
const val VIP = 0.25F
const val COMPRA_MINIMA = 200

fun main() {

    val s = Scanner(System.`in`)

    println("Comprador de nuevo".uppercase())
    println("Ingrese nombre de comprador:")
    val nombre = s.next()

    println("Ingrese el tipo de memebresia:")
    val membresia = s.next().uppercase()

    println("Ingrese el total de la compra:")
    val totalOriginal = s.nextFloat()

    var totalAPagar: Float = 0.0f
    var descuentoAplicado = "-"

    if (totalOriginal < COMPRA_MINIMA) {
        totalAPagar = totalOriginal
        descuentoAplicado = "No aplica ningun descuento: Compra minima es de 200"
    } else {

        val descuento = if (membresia == "REGULAR") {
            val d = totalOriginal * REGULAR
            descuentoAplicado = "05% -> $d"
            d
        } else if (membresia == "PREMIUM") {

            val d = totalOriginal * PREMIUM
            descuentoAplicado = "15% -> $d"
            d
        } else if (membresia == "VIP") {
            val d = totalOriginal * VIP
            descuentoAplicado = "25% -> $d"
            d
        } else {
            descuentoAplicado = "Error tipo membresia no reconocido"
            0f
        }

        totalAPagar = totalOriginal - descuento

    }

    println()
    println("Datos de compra")
    println("Cliente: $nombre")
    println("Membresia: $membresia")
    println("Total Original: $totalOriginal")
    println("Descuento: $descuentoAplicado")
    println("Total a pagar: $totalAPagar")


}


