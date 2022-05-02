package arrays

fun main() {

    val myArray = arrayOf(1, "hello", 2.5F, 1000L, 'c', true)
    println(myArray[1])

    myArray[0] = "bye"
    println(myArray[0])

    val emptyArray = emptyArray<Int>()

    // Arrays tipados

    // Array restringido para almacenar bytes
    val myByteArray = byteArrayOf(1,2,3)

    val myIntArray = intArrayOf(4, 5, 6, 7, 8)

    // Declarar un array con un número determinado de elementos
    val arrayInt = IntArray(5)

    // El segundo parámetro es una lambda expression,
    // se inicializa cada espacio en memoria con el valor del índice
    val arrayInt2 = IntArray(5, {index: Int -> index })
    arrayInt2.forEach {
        println(it)
    }

    // ahora incremento el valor de cada elemento en 1
    println("ARRAY => arrayInt3")
    val arrayInt3 = IntArray(5) { i: Int -> i.inc() }
    arrayInt3.forEach {
        println(it)
    }

    // Array de booleanos
    println("ARRAY de booleanos")

    val arrayBoolean = BooleanArray(size = 3){
        println(it) // eso es el índice
        true // aquí estoy inicializando el valor en true
    }

    arrayBoolean.forEach {
        println(it)
    }


}