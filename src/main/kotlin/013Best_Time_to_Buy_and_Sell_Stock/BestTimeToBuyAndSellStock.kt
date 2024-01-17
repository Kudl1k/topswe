package `013Best_Time_to_Buy_and_Sell_Stock`

import kotlin.math.max


fun maxProfit(prices: IntArray): Int {
    var buy = prices[0]
    var sell = 0
    for (i in 1 until prices.size){
        if (prices[i] > buy) {
            sell = max(sell,prices[i]-buy)
        } else {
            buy = prices[i]
        }
    }
    if (sell == 0) return 0
    return sell
}


fun main(){
    println(maxProfit(intArrayOf(7,1,5,3,6,4)))
}