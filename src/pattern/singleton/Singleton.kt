package pattern.singleton

/**
 * Created by pratama on 6/12/17.
 */
fun main(args: Array<String>) {

    DbManager.addName("pratama")
    DbManager.addName("Wijaya")

    val names = DbManager.getSavedNames()

    names.map {
        println(it)
    }

}