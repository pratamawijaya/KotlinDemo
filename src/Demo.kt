/**
 * Created by pratama on 6/12/17.
 */


fun main(args: Array<String>) {

    // print hello
    println("Hello")

    val user = User(1, "Pratama", "me@mail.com")

    // print User(id=1, name=Pratama, email=me@mail.com)
    println(user)

    // print user name Pratama
    println("user name ${user.name}")

    val users = listOf(
            User(1, "Jay", "jay@mail.com"),
            User(2, "Thomas", "thom@mail.com")
    )

    /** print
    User(id=1, name=Jay, email=jay@mail.com)
    User(id=2, name=Thomas, email=thom@mail.com)
     **/
    for (user in users) {
        println(user)
    }

    // example high order function
    users.map {
        println(it)
    }

    // print 1 until 100
    for (i in 1..100) {
        println(i)
    }

    // print 1 until 3
    (1..3).forEach { println(it) }

}