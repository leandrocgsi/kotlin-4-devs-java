package br.com.erudio.section05._0507

fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}

// Other ways to solve this challenge
// Iterative, double pointer solution
private fun isPalindromeSolution2(str: String): Boolean {
    var leftIndex = 0
    var rightIndex = str.lastIndex

    while (leftIndex <= rightIndex) {
        val leftValue = str[leftIndex]
        val rightValue = str[rightIndex]

        if (leftValue != rightValue) {
            return false
        }

        leftIndex++
        rightIndex--
    }

    return true
}

// Iterative, double pointer solution
private fun isPalindromeSolution3(str: String): Boolean {
    str.forEachIndexed { index, char ->
        val rightIndex = str.lastIndex - index

        if (char != str[rightIndex])
            return false

        if (index > rightIndex)
            return true
    }

    return true
}

// Recursive solution
private fun isPalindromeSolution4(str: String): Boolean {
    return if (str.isEmpty() || str.length == 1) {
        true
    } else {
        if (str.first() == str.last()) {
            isPalindromeSolution4(str.substring(1 until str.lastIndex))
        } else {
            false
        }
    }
}