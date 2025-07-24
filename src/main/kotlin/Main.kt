import kotlin.random.Random

fun main() {
    val first_array = IntArray(50)
    for (i in 1..50) {
        val value: Int = Random.nextInt(50)
        first_array[i-1] = value
    }
    val size: Int = first_array.size
    for (i in 0..size-1)
        println("The value of Array's index ${i} is ${first_array[i]}")

}