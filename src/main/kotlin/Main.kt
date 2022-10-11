import  kotlin.random.Random
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {

    // Задание 1
    val  myAge: Int = 18
    val isTeenager: Boolean = myAge <= 13 && myAge <= 19
    println(isTeenager)

    // Задание 2
    val theirAge:Int = 30
    val bothTeenagers:Boolean = theirAge in 13..19 && 13 <= theirAge && theirAge <= 19
    println(bothTeenagers)

    // Задание 3
    val reader: String = "Evgeniy"
    val author: String = "Richard Lucas"
    val authorIsReader = reader == author
    println(authorIsReader)

    // Задание 4
    val readerBeforeAuthor = author > reader
    println(readerBeforeAuthor)

    // Задача 5
    val myAge2: Int = 18
    if (myAge2 in 13..19)
    {
        println("Подросток")
    }
    else
        println("Не подросток")

    //Задача 6
    val myAge1: Int = 18
    val answer =  (myAge1 in 13..19)

    // Задача 7
    var counter  = 0
    while (counter<10)
    {
        val x=counter
        counter ++
        println(x)
    }

    // Задача 8
    var roll:Int = 0
    do {
        roll = Random.nextInt(6)
        var y = roll
        println("После $counter бросков, roll равен $y")
    } while (counter < 0)

    // Задача 9
    val range = 1
    var square   = 10

    for (range in range..10) {
        square =range * range
        println( square)

    }

    // Задача 10
    var brinqOut =  0
    for (range in range..10) {
        brinqOut = sqrt(range.toDouble()).toInt()
        println(brinqOut)
    }

    // Задача 11
     var sum: Int = 0
    for (row in 1 until 8 step 2) {
        for (column in 0 until 8) {
            sum += row * column
        }
    }
        println(sum)

}