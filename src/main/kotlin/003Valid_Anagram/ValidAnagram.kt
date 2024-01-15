package `003Valid_Anagram`


fun isAnagram(s: String, t: String): Boolean{
    if (s.length != t.length) return false
    return s.toCharArray().sorted() == t.toCharArray().sorted()
}

fun main(){
    println(isAnagram("ac","bb"))
}