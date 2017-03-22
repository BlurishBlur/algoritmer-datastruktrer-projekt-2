import java.util.Scanner;

/**
 * Class to sort numbers, utilizing a binary search tree.
 * @author Niels Heltner (nhelt15) & Antonio Lascari (anlas15)
 */
public class Treesort {
    
    public static void main(String[] args) {
        Dict dict = new DictBinTree();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int key = in.nextInt();
            dict.insert(key);
        }
        for(int i : dict.orderedTraversal()) {
            System.out.println(i);
        }
    }
    
}
