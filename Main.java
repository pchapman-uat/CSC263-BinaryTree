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