/**
 *
 * @author Niels Heltner (nhelt15) & Antonio Lascari (anlas15)
 */
public class Node {
    
    private int key;
    private Node leftChild;
    private Node rightChild;
    
    public Node() {
    }
    
    public Node(int key) {
        this.key = key;
        leftChild = null;
        rightChild = null;
    }
    
    public int getKey() {
        return key;
    }
    
    public Node getLeftChild() {
        return leftChild;
    }
    
    public Node getRightChild() {
        return rightChild;
    }
    
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
    
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
    
}
