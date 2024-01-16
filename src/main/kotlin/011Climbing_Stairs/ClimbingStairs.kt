package `011Climbing_Stairs`



fun climbStairs(n: Int): Int {
    if (n == 1 || n == 2 || n == 3) return n
    return (climbStairs(n-2)+ climbStairs(n-1))
}


fun main(){
    println(climbStairs(4))
}