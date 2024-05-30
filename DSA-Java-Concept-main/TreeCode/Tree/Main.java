public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("Root = " + bst.root);

        bst.insert(5);
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        bst.insert(4);

        System.out.println("root left: " + bst.root.value);
        System.out.println("root left right: " + bst.root.left.right.value);

        System.out.println("BST Contains");
        System.out.println("Value present in Tree: " + bst.contains(4));
        System.out.println("Value not present in Tree: " + bst.contains(9));
    }
}
