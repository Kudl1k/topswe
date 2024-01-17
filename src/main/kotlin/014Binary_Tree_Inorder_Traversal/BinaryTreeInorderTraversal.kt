package `014Binary_Tree_Inorder_Traversal`

import com.sun.source.tree.Tree

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun TreeNode.helper(list: MutableList<Int>){
    left?.helper(list)
    list += `val`
    right?.helper(list)
}


fun inorderTraversal(root: TreeNode?): List<Int> {
    val result = mutableListOf<Int>()
    root?.helper(result)
    return result
}





fun main(){
    var ti = TreeNode(1)
    ti.right = TreeNode(2)
    ti.right!!.left = TreeNode(3)

    println(inorderTraversal(ti))
}