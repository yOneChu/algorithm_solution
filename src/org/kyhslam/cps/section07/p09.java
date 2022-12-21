
import java.util.LinkedList;
import java.util.Queue;


class Node{ 
    int data; 
    Node lt, rt; 
    public Node(int val) { 
        data=val; 
        lt=rt=null; 
    } 
}

public class p09_BFS {

    private static int BFS(Node root) {


        Queue<Node> queue = new LinkedList<>();


        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {

            int len = queue.size();

            for(int i=0; i < len; i++) {
                Node node = queue.poll();

                if(node.lt == null && node.rt == null) return level;
                else {
                    if(node.lt != null) queue.offer(node.lt);
                    if(node.rt != null) queue.offer(node.rt);
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Node root;
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);

        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        System.out.println(BFS(root));
    }
}
