package DSA.BinaryTree;

public class BinarySearchTree {

//    Defininf Node
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;      // root Node
     public BinarySearchTree(){

     }
     public int height(Node node){
         if(node == null){
             return -1;
         }
         return node.height;
     }

     public boolean isEmpty(){
         return root == null;
     }

     // Display function :
     public void display(){
         display(root, "Root Node: ");
     }
     private void display(Node node, String details){
         if(node == null){
             return;
         }
         System.out.println(details + node.getValue());
         display(node.left, "Left child of "+ node.getValue() +" : ");
         display(node.right, "Right child of "+ node.getValue() +" : ");
     }

//     Insertion in Binary Search Tree :
     public void insert(int value){
        root = insert(value,root);
     }
     private Node insert(int value, Node node){
         if(node == null){
             node = new Node(value);
             return node;
         }
         if(value < node.getValue()){
             node.left = insert(value, node.left);
         }

         if(value > node.getValue()){
             node.right = insert(value, node.right);
         }
         node.height = Math.max(height(node.left),height(node.right)) +1;
         return node;
       }

//       Function to check if BST is balanced or not :
       public boolean balanced(){
         return balanced(root);
       }
       private boolean balanced(Node node){
         if(node == null){
             return true;
         }
         return Math.abs(height(node.left) - height(node.right))<=1  && balanced(node.left) && balanced(node.right);
       }

//       Creating a tree from a given input array :
       public void populate(int[] nums){
         for(int i=0; i<nums.length; i++){
             this.insert(nums[i]);
         }
       }

//       Creating a tree from given sorted input array :
//       this method helps us to avoid skewed trees:
       public void populateSorted(int[] nums){
         populateSorted(nums,0,nums.length);
       }
       private void populateSorted(int[] nums, int start, int end){
         if(start>=end){
             return;
         }
         int mid = (start + end)/2;
         this.insert(nums[mid]);
         populateSorted(nums,start,mid);
         populateSorted(nums,mid+1,end);
       }
}
