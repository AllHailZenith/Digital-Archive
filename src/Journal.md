I created the BSTNode and BinarySearchTree classes and implemented insertion. The add method compares each accession ID with the current node and moves left when the value is less than or equal to it, or right when it is greater. Comparable allows Java to compare values and determine where they belong.

Phase 2
I added a height method that checks both subtrees and returns the larger height plus one. The method continues until it reaches an empty node, which returns -1. This makes the sample tree's height 2 and a single-node tree's height 0.

Phase 3
I added inorder and preorder traversal methods to display the accession IDs. Inorder visits the left subtree, the current node, and then the right subtree, which prints the IDs in sorted order. Preorder visits the current node before its left and right subtrees.

Phase 4
Testing confirmed that the empty tree has a height of -1 and the single-node tree has a height of 0. Inserting sorted IDs created a right-skewed tree with a height of 3, while the original sample tree had a height of 2. This showed me that inserting sorted values can make a binary search tree less balanced.