import kotlin.random.Random

// Code removes the each elements one by one from the list
fun main()
{
    val first_list: MutableList<Int> = mutableListOf()
    val second_list: MutableList<Int> = mutableListOf()

    // Capturing the index numbers which we are supposed to delete
    val del_index_list: MutableList<Int> = mutableListOf()

    //Generating the random numbers to append in the list
    for (i in 1..50)
    {
        //random numbers are generated and the saved in the rand_value variable
        val rand_value: Int = Random.nextInt(1,1000)
        first_list.add(rand_value)
        second_list.add(rand_value)
    }

    println("Final value without removing ${second_list}")

    // Deleting the index from the list using random function from 0 to 24
    for (i in 0..24)
    {
        val remove_val:Int = Random.nextInt(1,50)

        //capturing the index that we are suppose to delete
        del_index_list.add(remove_val)
        if (remove_val < first_list.size)
        first_list.removeAt(remove_val)
    }
    println("Removing Index List ${del_index_list}")
    println("The final list after deleting is ${first_list} and it's length is ${first_list.size}")

    println("\n")

    for (traversing in del_index_list){
            second_list[traversing] = 1008
    }

    for (i in 0..second_list.size)
    {
        second_list.remove(1008)
    }
    println("Altered list after bulk deletion ${second_list}")
}