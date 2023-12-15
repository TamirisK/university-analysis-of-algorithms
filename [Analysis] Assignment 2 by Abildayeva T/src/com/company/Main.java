package com.company;

public class Main {
    public static int countLevels(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        if (treeNode.left == null && treeNode.right == null) {
            return 1;
        }
        int leftLevels = countLevels(treeNode.left);
        int rightLevels = countLevels(treeNode.right);

        return Math.max(leftLevels, rightLevels) + 1;
    }


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);

        int levels = countLevels(treeNode);
        System.out.println("Number of levels in the binary tree: " + levels);
        System.out.println("The time complexity of the algorithm is: Big 0 = O(n)");
    }
}
