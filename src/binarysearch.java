import java.util.NoSuchElementException;

/**
 * Created by IntelliJ Idea.
 * User: Menard Feko
 * Date: 2/18/18
 * Time: 7:30 PM
 * Contact: fekomenard@yahoo.fr
 * .java was created for...
 */


class Node {
    Node left;
    Node right;
    int data;

    public Node( int data){
        this(data,null,null);
    }
    public Node(int data,Node left,Node right){
        this.data=data;
        this.left= left;
        this.right= right;
    }
}

public class binarysearch {
    Node root;
    public void Insert(int value ){
        if(root==null) root= new Node(value);
        else
            Insert(value,root);


    }

    private void Insert(int value , Node latestroot){
        if (latestroot.data>value){
            if(latestroot.left==null)
                latestroot.left=new Node(value);
            else
                Insert(value,latestroot.left);
        }
        else {
            if (latestroot.data < value) {
                if (latestroot.right == null) latestroot.right = new Node(value);
                else Insert(value, latestroot.right);
            }
        }


    }
    public int min(){
        return min(root);
    }
    private int min(Node latestroot){
        if(latestroot==null) {
            return latestroot.data;

        }

        if (latestroot.left == null && latestroot.right == null) {
            return latestroot.data;
        } else {
            return min(latestroot.left);

        }



    }
    public int max(){
        return max(root);
    }
    private int max(Node latestroot){
        if(latestroot==null) {
            return latestroot.data;

        }

        if (latestroot.left == null && latestroot.right == null) {
            return latestroot.data;
        } else {
                return max(latestroot.right);

        }



    }







    public void preOrder() {
        System.out.print("preOrder:");
        printpreOrder(root);
        System.out.println();
    }

    private void printpreOrder(Node latestroot) {
        if (latestroot != null) {


            System.out.print(latestroot.data + " ");
            printpreOrder(latestroot.left);
            printpreOrder(latestroot.right);

        }
    }

    public void inOrder() {
        System.out.print("inOrder:");
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node root) {
        if (root != null) {


            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public void postOrder() {
        System.out.print("postOrder:");
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node latestroot) {
        if (latestroot != null) {


            postOrder(latestroot.left);
            postOrder(latestroot.right);
            System.out.print(latestroot.data + " ");
        }
    }


    public static void main(String[] args){
        binarysearch t=new binarysearch();
        t.Insert(47);
        t.Insert(32);
        t.Insert(59);
        t.Insert(62);
        t.Insert(21);
        t.preOrder();
        t.inOrder();
        t.postOrder();
        System.out.print(t.min()+"this is min "+t.max()+"this is max");

    }
}
