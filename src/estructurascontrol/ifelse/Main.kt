package estructurascontrol

fun main() {
    val isLoggedIn = false
    val hasAddress = true

    if (isLoggedIn) {
        println("User is logged in")

        if (hasAddress) println("aquí la lista")
        else println("user no tiene direcciones")
    } else {
        println("user no logeado")
    }


    val userLoggedInStatus = if(isLoggedIn) "*** Logged ***" else "*** Not logged ***"
    println("User: $userLoggedInStatus")
}