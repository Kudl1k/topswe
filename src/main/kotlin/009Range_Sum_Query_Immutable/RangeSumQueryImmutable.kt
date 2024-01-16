package `009Range_Sum_Query_Immutable`




class NumArray(val nums: IntArray) {

    fun sumRange(left: Int, right: Int): Int {
        var range = right+1-left
        var i = left
        var result = 0
        while (range>0){
            result += nums[i++]
            range--
        }
        return result
    }

}

fun main(){
    var obj = NumArray(intArrayOf(-2,0,3,-5,2,-1))
    println(obj.sumRange(0,5))
}