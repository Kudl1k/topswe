package `007Power_of_Three`


fun isPowerOfThree(n: Int): Boolean{
    var number = n.toDouble()
    while (number > 1){
        number /= 3
    }
    return number == 1.0
}

fun main(){
    println(isPowerOfThree(27))
}