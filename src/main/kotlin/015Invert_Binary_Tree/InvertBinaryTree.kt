package `015Invert_Binary_Tree`


class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}




fun invertTree(root: TreeNode?): TreeNode? {
    root?.let {
        val temp = it.left
        it.left = invertTree(it.right)
        it.right = invertTree(temp)
    }
    return root
}


fun main(){
    println("main")
}