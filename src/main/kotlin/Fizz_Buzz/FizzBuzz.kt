package org.example.Fizz_Buzz



fun fizzBuzz(n: Int): List<String>{
    val result = mutableListOf<String>()

    repeat(n+1){
        if (it % 3 == 0 && it % 5 == 0){
            result.add("FizzBuzz")
        } else if(it % 3 == 0){
            result.add("Fizz")
        } else if (it % 5 == 0){
            result.add("Buzz")
        } else {
            result.add(it.toString())
        }
    }
    return result.drop(1)
}


fun main(){
    println(fizzBuzz(15))
}