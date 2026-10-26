I created the BSTNode and BinarySearchTree classes and implemented insertion. The add method compares each accession ID with the current node and moves left when the value is less than or equal to it, or right when it is greater. Comparable allows Java to compare values and determine where they belong.

Phase 2
I added a height method that checks both subtrees and returns the larger height plus one. The method continues until it reaches an empty node, which returns -1. This makes the sample tree's height 2 and a single-node tree's height 0.