package Lec_37;

import Diameter_Of_Binary_Tree.lec_36.Diameter_of_Binary_Tree.TreeNode;

public class Validate_Binary_Search_Tree {
		public class TreeNode {
			int val;
			TreeNode left;
			TreeNode right;

			TreeNode() {
			}

			TreeNode(int val) {
				this.val = val;
			}

			TreeNode(int val, TreeNode left, TreeNode right) {
				this.val = val;
				this.left = left;
				this.right = right;
			}
		}
		class Solution {
			public boolean isValidBST(TreeNode root) {
				return false;
				
			}
			public BstPair validBst(TreeNode root) {
				if (root == null) {
					return new BstPair();
				}
				BstPair lbstp = validBst(root.left);
				BstPair rbstp = validBst(root.right);
				BstPair sbstp = new BstPair();
				sbstp.max=Math.max(root.val,Math.max(lbstp.max,rbstp.max));
				sbstp.min=Math.min(root.val,Math.min(lbstp.min,rbstp.min));
				if (lbstp.isbst && rbstp.isbst && lbstp.max < root.val && rbstp.min>root.val) {
					sbstp.isbst = true;
				}else {
					sbstp.isbst = false ;
				}
				return sbstp;
				
			}
			class BstPair{
				boolean isbst = true;
				long min = Long.MAX_VALUE;
				long max = Long.MIN_VALUE;
			}
		}
	}

