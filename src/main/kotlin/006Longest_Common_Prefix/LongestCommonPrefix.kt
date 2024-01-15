package `006Longest_Common_Prefix`

fun longestCommonPrefix(strs: Array<String>): String{
    if (strs.isEmpty()){
        return ""
    }
    strs.sort()
    val firstPrefix = strs[0]
    val lastPrefix = strs[strs.size-1]
    var prefix = ""
    for (i in firstPrefix.indices){
        if (i < lastPrefix.length && firstPrefix[i] == lastPrefix[i]){
            prefix += firstPrefix[i]
        } else {
            break
        }
    }
    return prefix
}

fun main(){
    println(longestCommonPrefix(arrayOf("flower","flow","flight")))
}