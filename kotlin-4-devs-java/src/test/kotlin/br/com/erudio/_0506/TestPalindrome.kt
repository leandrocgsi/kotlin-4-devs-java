package br.com.erudio._0506

import br.com.erudio.section05._0507.isPalindrome
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

/*
private fun isPalindrome(str: String): Boolean {
    TODO("not implemented")
}
*/

class Test {

    @Test
    fun `"civic" is a palindrome`() {
        isPalindrome("civic") shouldBeEqualTo true
    }

    @Test
    fun `" civic" is not a palindrome`() {
        isPalindrome(" civic") shouldBeEqualTo false
    }

    @Test
    fun `"civic " is not a palindrome`() {
        isPalindrome("civic ") shouldBeEqualTo false
    }

    @Test
    fun `"greetings" is not a palindrome`() {
        isPalindrome("greetings") shouldBeEqualTo false
    }

    @Test
    fun `"1000000001" a palindrome`() {
        isPalindrome("1000000001") shouldBeEqualTo true
    }

    @Test
    fun `"Fish hsif" is not a palindrome`() {
        isPalindrome("Fish hsif") shouldBeEqualTo false
    }

    @Test
    fun `"pennep" a palindrome`() {
        isPalindrome("pennep") shouldBeEqualTo true
    }
}