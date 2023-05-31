package tech.strengthen.learn.leetcode.algorithm.tree;

/**
 * 二叉查找树
 * 在树中的任意一个节点
 * 其左子树中的每个节点的值，都要小于这个节点的值
 * 其右子树中的每个节点的值，都要大于这个节点的值
 */
public class BinarySearchTree {

    private Node tree;

    public static void main(String[] args) {

    }

    private Node found(Integer value) {
        Node node = tree;
        while (node != null) {
            if (value < node.data) node = tree.left;
            else if (value > node.data) node = tree.right;
            else return node;
        }
        return null;
    }

    private void insert(Integer value) {
        Node node = tree;
        if (null == tree) {
            tree = new Node(value);
        }
        while (node != null) {
            if (value > node.data) {
                if (node.right == null) {
                    node.right = new Node(value);
                    return;
                }
                node = node.right;
            } else {
                if (node.left == null) {
                    node.left = new Node(value);
                    return;
                }
                node = node.left;
            }
        }
    }

    /**
     * 第一种情况是，如果要删除的节点没有子节点，我们只需要直接将父节点中，指向要删除节点的指针置为 null。
     * 第二种情况是，如果要删除的节点只有一个子节点（只有左子节点或者右子节点），我们只需要更新父节点中，指向要删除节点的指针，让它指向要删除节点的子节点就可以了。
     * 第三种情况是，如果要删除的节点有两个子节点，这就比较复杂了。我们需要找到这个节点的右子树中的最小节点，把它替换到要删除的节点上。然后再删除掉这个最小节点，因为最小节点肯定没有左子节点
     * 还有个非常简单、取巧的方法，就是单纯将要删除的节点标记为“已删除”，但是并不真正从树中将这个节点去掉（空间换时间
     *
     * @param value 待删除的值
     */
    public void delete(Integer value) {
        Node node = tree; // p指向要删除的节点，初始化指向根节点
        Node nodeParent = null; // pp记录的是p的父节点
        while (node != null && node.data != value) {
            nodeParent = node;
            if (value > node.data) node = node.right;
            else node = node.left;
        }
        if (node == null) return; // 没有找到
        // 要删除的节点有两个子节点
        if (node.left != null && node.right != null) { // 查找右子树中最小节点
            Node minNode = node.right;
            Node minNodeParent = node; // minPP表示minP的父节点
            while (minNode.left != null) {
                minNodeParent = minNode;
                minNode = minNode.left;
            }
            node.data = minNode.data; // 将minP的数据替换到p中
            node = minNode; // 下面就变成了删除minP了
            nodeParent = minNodeParent;
        }
        // 删除节点是叶子节点或者仅有一个子节点
        Node child; // p的子节点
        if (node.left != null) child = node.left;
        else if (node.right != null) child = node.right;
        else child = null;
        if (nodeParent == null) tree = child;
            // 删除的是根节点
        else if (nodeParent.left == node) nodeParent.left = child;
        else nodeParent.right = child;
    }

    public static class Node {
        Node left;

        Node right;

        Integer data;

        public Node(Integer data) {
            this.data = data;
        }
    }
}
