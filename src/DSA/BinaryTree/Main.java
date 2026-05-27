package DSA.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int [] nums = {5,3,8,1,9,13,2,6,10};
        int [] numsSorted = {1,2,3,4,5,6,7};
        tree.populate(nums);
//        tree.display();
        tree.populateSorted(numsSorted);
        tree.display();
    }
}
