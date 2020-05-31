import java.io.*;
import java.util.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class Solution{

	static void levelOrder(Node root){
    //Write your code here
      Queue<Node> queue = new LinkedList<Node>();
      queue.add(root);
      while(queue.peek()!=null)
          {
          Node node =queue.remove();
          System.out.print(""+node.data+" ");
          if(node.left!=null)
              queue.add(node.left);
          if(node.right!=null)
              queue.add(node.right);
      }
  }
