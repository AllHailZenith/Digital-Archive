
public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> archive = new BinarySearchTree<>();

        int[] sampleIds = {50, 25, 75, 10, 30, 60, 85};

        for (int id : sampleIds) {
            archive.add(id);
        }

        System.out.println("Sample tree height: " + archive.height());

        System.out.print("Sample inorder: ");
        archive.inOrderTraversal();

        System.out.print("Sample preorder: ");
        archive.preOrderTraversal();

        BinarySearchTree<Integer> emptyTree = new BinarySearchTree<>();

        System.out.println("Empty tree height: " + emptyTree.height());

        System.out.print("Empty tree inorder: ");
        emptyTree.inOrderTraversal();

        System.out.print("Empty tree preorder: ");
        emptyTree.preOrderTraversal();

        BinarySearchTree<Integer> singleTree = new BinarySearchTree<>();
        singleTree.add(10);

        System.out.println("Single-node tree height: " + singleTree.height());

        BinarySearchTree<Integer> skewedTree = new BinarySearchTree<>();
        int[] sortedIds = {10, 20, 30, 40};

        for (int id : sortedIds) {
            skewedTree.add(id);
        }

        System.out.println("Skewed tree height: " + skewedTree.height());

        System.out.print("Skewed inorder: ");
        skewedTree.inOrderTraversal();

        System.out.print("Skewed preorder: ");
        skewedTree.preOrderTraversal();
    }
}
