package `005Valid_Palindrome`



fun isPalindrome(s: String): Boolean{
    val t = s.filter { it.isLetterOrDigit() }.lowercase()
    return t == t.reversed()
}


fun main(){
    println(isPalindrome("0P"))
}