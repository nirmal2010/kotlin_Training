import kotlin.random.Random

fun main()
{
    println("Enter the number of elements to be created")
    var newInputList = readln().toIntOrNull() ?: 0
    val listValue: MutableList<Int> = mutableListOf()
    val randomList: MutableList<Int> = mutableListOf()

    println("Enter ${newInputList} elements")
    repeat(newInputList)
    {
        val number = readln().toIntOrNull()?:0
        listValue.add(number)
    }
    println("User entered list ${listValue}")

    // Creating Random Numbers from 1 to 50 in a list
    repeat(50) {
        randomList.add(Random.nextInt(1, 50))
    }

    println("Enter a number to delete in the list")
    val deleteValue = readln().toIntOrNull()?:0

    // If the random list contains the user input value, then it deletes the input value from listValue list.
    if(randomList.contains(deleteValue))
    {
        listValue.removeAll{it == deleteValue}
    }
    println("The removing random number list is ${randomList}")
    println("After Deletion, the final list of numbers are ${listValue}")
}