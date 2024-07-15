public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
class Node {
    int key;
    Node left, right;
    public Node(int item){
        key = item;
        left = right = null;
    }
}

class BinarySearchTree{
    private Node root;
    public BinarySearchTree(){
        root = null;
    }
    public void insert(int key){
        root = insertRec(root, key);
    }
    private Node insertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key<root.key){
            root.left = insertRec(root.left, key);
        } else if(key>root.key){
            root.right = insertRec(root.right, key);
        } return root;
    }
}