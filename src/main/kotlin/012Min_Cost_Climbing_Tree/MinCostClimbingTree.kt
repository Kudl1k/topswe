package `012Min_Cost_Climbing_Tree`

import kotlin.math.min


fun minCostClimbingStairs(cost: IntArray): Int {
    for (i in cost.lastIndex-2 downTo 0){
        cost[i] += min(cost[i+1],cost[i+2])
    }
    return min(cost[0],cost[1])
}



fun main(){
    println(minCostClimbingStairs(intArrayOf(10,15,20)))
}