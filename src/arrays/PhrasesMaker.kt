package arrays

fun main() {
    //saludo + introducción
    // Saludo : hola, hi, welcome, guten moren, hallo
    // Introducción: Mi nombre es, puedes lamarme, usualmente me llaman, Yo soy

    // Todas las formas en las que la gente te pueden llamar: Elena, Cocoa

    val greetings = arrayOf("Hola", "Hi", "Te doy la bienvenida", "Buenos días", "Hallo")
    val introductions = arrayOf("mi nombre es", "usualmente me llaman", "puedes llamarme", "yo soy")
    val names = arrayOf("Elena", "Nena", "Sohia", "Cocoa")

    // Generar valores random
    val randIndexGreetings = (Math.random() * greetings.size).toInt()
    val randIndexIntroductions = (Math.random() * introductions.size).toInt()
    val randIndexNames = (Math.random() * names.size).toInt()

    val phrase = "${greetings[randIndexGreetings]} ${introductions[randIndexIntroductions]} ${names[randIndexNames]}"
    println(phrase)

}