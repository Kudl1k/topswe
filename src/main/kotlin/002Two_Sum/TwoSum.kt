package `002Two_Sum`

fun twoSum(nums: List<Int>,target: Int): List<Int>{
    val result = mutableListOf<Int>()
    for (i in nums.indices){
        for (j in nums.indices){
            if (i != j && nums[i] + nums[j] == target){
                result.add(i)
                result.add(j)
                return result
            }
        }
    }
    return result
}


fun main(){
    println(twoSum(listOf(2,7,11,15),9))
}