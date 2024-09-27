package bot

import java.util.Scanner

// Initialize Scanner Tool
val scanner = Scanner(System.`in`)

fun main() {
    greet("Aid", "2020")
    remindName()
    guessAge()
    count()
    test()
    // ...
    end()
}

// Greet User
fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
}

// GetUser Name
fun remindName() {
    println("Please, remind me your name.")
    val name = scanner.nextLine()
    println("What a great name you have, ${name}!")
}

// Guess User Age
fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

// Count Numbers
fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

// Programming Quiz - Multiple Choice
fun test() {
    println("Let's test your programming knowledge.")

    println(
        """
        Why do we use methods?
        1. To repeat a statement multiple times.
        2. To decompose a program into several small subroutines.
        3. To determine the execution time of a program.
        4. To interrupt the execution of a program
        """.trimIndent() // remove spaces
    )
    // Check answer
    var answer = scanner.nextInt()
    while (answer != 2) {
        println("Please, try again.")
        answer = scanner.nextInt()

    }
}
// End of programme
fun end() {
    println("Congratulations, have a nice day!")
}