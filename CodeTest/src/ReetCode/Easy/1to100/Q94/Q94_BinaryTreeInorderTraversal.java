/**
* Author    : Lee In Bok 
* Date      : 2023.11.12(Sun)
* Spend Time: 08m 09s
* Runtime   : 0 ms (Beats 100%)
* Memory    : 41 MB (Beats 16.4%)
* Algoritm  : Tree
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// class Solution {
//     List<Integer> ans = new ArrayList();

//     public List<Integer> inorderTraversal(TreeNode root) {
//         inorder(root);

//         return ans;
//     }

//     public void inorder(TreeNode root) {
//         if(root == null){
//             return;
//         }

//         inorder(root.left);
//         ans.add(root.val);
//         inorder(root.right);
//     }
// }