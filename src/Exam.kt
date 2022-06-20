import java.util.*

class Exam {

    fun gcd() {
        val number1 = Integer.valueOf(readLine())
        val number2 = Integer.valueOf(readLine())
        var gcd = 1

        var i = 1
        while (i <= number1 && i <= number2) {
            if (number1 % 1 == 0 && number2 % i == 0)
                gcd = i
            ++i
        }
        println("G.C.D of $number1 and $number2 is $gcd")
    }

    fun lcm() {

        val number1 = Integer.valueOf(readLine())
        val number2 = Integer.valueOf(readLine())
        var gcd = 1

        var i = 1
        while (i <= number1 && i <= number2) {
            if (number1 % 1 == 0 && number2 % i == 0)
                gcd = i
            ++i
        }
        val lcm = number1 * number2 / gcd
        println("The LCM of $number1 and $number2 is $lcm")
    }

    fun contains() {
        val inputString = readLine()

        if (inputString != null) {
            if (inputString.contains("$")) {
                println("$inputString contains $ symbol")
            } else {
                println("$inputString not contains $ symbol")
            }
        }

        fun sum() {
            val num = 100
            var sum = 0

            for (i in 0 until num step 2) {
                sum += i
            }

            println("sum is $sum")
        }

        fun reverse() {
            var number = Integer.valueOf(readLine())
            var reversed = 0

            while (number != 0) {
                val digit = number % 10
                reversed = reversed * 10 + digit
                number /= 10
            }
            println("Reversed number is $reversed")
        }

        fun isPalindrome() {

            fun isPalindrome(inputString: String): Boolean {
                val stringBuilder = StringBuilder(inputString)

                val reverseString = stringBuilder.reverse().toString()

                return inputString.equals(reverseString, ignoreCase = true)
            }

            fun main() {
                val scanner = Scanner(System.`in`)
                println("input string: ")
                val inString = scanner.nextLine()

                if (isPalindrome(inString)) {
                    println("$inString is a Palindrome")
                } else {
                    println("$inString is not a Palindrome")
                }
            }

        }
    }
}