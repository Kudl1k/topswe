package `008Number_of_1_Bits`



fun hammingWeight(n:Int): Int{
    var cur = n
    var bits = 0
    while (cur != 0){
        if (cur and 1 == 1){
            bits++
        }
        cur = cur ushr 1
    }
    return bits
}


fun main(){
    println(hammingWeight(15))
}