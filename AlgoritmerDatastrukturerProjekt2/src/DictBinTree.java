/**
 *
 * @author Niels
 */
public class DictBinTree implements Dict {
    
    private Node root;
    private int size;
    private int pointer;
    
    public DictBinTree() {
        size = 0;
    }

    @Override
    public void insert(int key) {
        Node y = null;
        Node x = root;
        Node z = new Node(key);
        while(x != null) {
            y = x;
            if(z.getKey() < x.getKey()) {
                x = x.getLeftChild();
            }
            else {
                x = x.getRightChild();
            }
        }
        if(y == null) {
            root = z;
        }
        else if(z.getKey() < y.getKey()) {
            y.setLeftChild(z);
        }
        else {
            y.setRightChild(z);
        }
        size++;
    }

    @Override
    public int[] orderedTraversal() {
        int[] array = new int[size];
        pointer = 0;
        inorderTreeWalk(root, array);
        return array;
    }
    
    private void inorderTreeWalk(Node x, int[] array) {
        if(x != null) {
            inorderTreeWalk(x.getLeftChild(), array);
            array[pointer++] = x.getKey();
            inorderTreeWalk(x.getRightChild(), array);
        }
    }

    @Override
    public boolean search(int key) {
        Node x = root;
        while(x != null) {
            if(key == x.getKey()) {
                return true;
            }
            if(key < x.getKey()) {
                x = x.getLeftChild();
            }
            else {
                x = x.getRightChild();
            }
        }
        return false;
    }
    
}
