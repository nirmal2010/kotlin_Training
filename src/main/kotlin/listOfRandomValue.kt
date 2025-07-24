import kotlin.random.Random

fun main()
{
    val first_list: MutableList<Int> = mutableListOf()
    for (i in 0..49)
    {
        val rand_value: Int = Random.nextInt(1,50)
        first_list.add(rand_value)
    }
}