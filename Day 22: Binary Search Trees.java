import java.util.*;
import java.io.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	public static int getHeight(Node root){
      //Write your code here
      
       if(root == null)
      {
          return -1;
      }
      else
      {
        int lHeight= getHeight(root.left);
        int rHeight=getHeight(root.right);
 
        if(lHeight>rHeight)
        {
            return (lHeight+1);
        }
        else
            return (rHeight+1);
      }
    }
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

