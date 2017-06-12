package pattern.builder

/**
 * Created by pratama on 6/12/17.
 */

fun main(args: Array<String>) {
    val ferrari = Car().apply {
        color = "Red"
        name = "Ferrari"
        doors = 2
    }

    println(ferrari)

    ferrari.apply {
        doors = 4
    }

    println(ferrari)

    val lambo = Car()
    println(lambo)
}