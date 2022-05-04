package estructurascontrol.`when`

import kotlin.math.roundToInt

fun main() {

    println("***** when demo ***** ")

    val isLoggedIn = true

    when (isLoggedIn) {
        true -> println("User logged")
        false -> println("User not logged")
    }

    println("\n***** User Status *****")

    // status 1 -> Logged in
    // status 0 -> Logged out
    // status -1 -> Down
    // status 10 - 20 -> Inactive time

    val userStatus = 17
    val userStatusString = when (userStatus) {
        0 -> "Logged out"
        1 -> "Logged int"
        -1 -> "Down"
        in 10..20 -> "Inactive for $userStatus min"
        else -> "Not found"
    }

    println(userStatusString)

    // Any es la clase padre de todos los objetos
    val productPrices: Any = doubleArrayOf(15.99, 11.10, 45.99)
    val total = when (productPrices) {
        is DoubleArray -> productPrices.sum().roundToInt().toString()
        is Double -> productPrices.roundToInt().toString()
        is Int -> productPrices.toString()
        else -> productPrices.toString()
    }

    println("Totals: $total")

    println("\n***** Other WHEN use *****")
    val hasAddress = false
    val user = "elenadev"
    val message = when {
        isLoggedIn and hasAddress -> "Lista direcciones de: $user"
        isLoggedIn and !hasAddress -> "$user No tiene lista de direcciones"
        else -> " bla"
    }

    println("Message: $message")


}