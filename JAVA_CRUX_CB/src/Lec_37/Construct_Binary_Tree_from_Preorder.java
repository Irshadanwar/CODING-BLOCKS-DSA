package Lec_37;

import Lec_37.Validate_Binary_Search_Tree.TreeNode;

public class Construct_Binary_Tree_from_Preorder {
	
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
		public TreeNode buidTree(int [] preorder, int [] inorder) {
			return Build (preorder, inorder ,0 , preorder.length - 1 ,0 , inorder.length - 1 );
		}
		public TreeNode Build (int [] pre, int[] in , int plo , int phi , int ilo , int ihi ) {
			if (plo>phi || ilo>ihi) {
				return null;
			}
			
			TreeNode node = new TreeNode (pre[plo]);
			int idx = Search (in,ilo,ihi,pre[plo]);
			int net = idx-ilo;
			node.left=Build(pre,in,plo+1,plo + net ,ilo,idx-1);
			node.right=Build(pre,in,plo+net+1,phi,idx+1,ihi);
			return node;
		}
		public int Search (int[] in , int ilo, int ihi , int item) {
			for (int i=ilo;i<=ihi;i++) {
				if (in[i] == item) {
					return i ;
				}
			}
			return 0;
		}
	}

}
