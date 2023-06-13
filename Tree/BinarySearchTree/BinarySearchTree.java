import java.util.LinkedList;
import java.util.Queue;
import java.util.ServiceConfigurationError;

public class BinarySearchTree {
 BinaryNode root;

  public BinarySearchTree(){
      root = null;
  }


   private BinaryNode insert(BinaryNode currentNode,int value){
      if(currentNode == null) {
          BinaryNode newNode = new BinaryNode();
          newNode.value = value;
          System.out.println("success inserted");
          return newNode;
      }else if(value <= currentNode.value){
         currentNode.left = insert(currentNode.left,value);
         return currentNode;
      }else{
          currentNode.right = insert(currentNode.right,value);
          return currentNode;
      }
   }


   public void insert(int value){
      insert(root,value);
   }

   public void preOrder(BinaryNode node){
      if(node == null){
          return;
      }
      System.out.println(node.value + " ");
      preOrder(node.left);
      preOrder(node.right);
   }

   public void inOrder(BinaryNode node){
      if(node == null){
          return;
      }
      inOrder(node.left);
      System.out.println(node.value  + " ");
      inOrder(node.right);
   }


   public void postOrder(BinaryNode node){
      if(node == null) {
          return;
      }
      postOrder(node.left);
      postOrder(node.right);
       System.out.println(node.value  + " ");
   }

   public void levelOrder(){
      Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
      queue.add(root);
      while (!queue.isEmpty()){
          BinaryNode pres = queue.remove();
          System.out.println(pres.value + " ");
          if(pres.left != null){
              queue.add(pres.left);
          }
          if(pres.right != null){
              queue.add(pres.right);
          }
      }
   }

   BinaryNode Search(BinaryNode node,int value){
      if(node == null){
          System.out.println("not found");
          return null;
      }else if(node.value == value){
          System.out.println("not found");
          return node;
      }else if (node.value > value){
        return  Search(node.left,value);
      }else{
          return  Search(node.right,value);
      }
   }

   public static BinaryNode minNode(BinaryNode root){
      if(root.left == null){
           return null;
      }
      return minNode(root.left);
   }

   public BinaryNode delete(BinaryNode root,int value){
      if(root == null){
          System.out.println("not found");
          return null;
      }
      if(value<root.value){
          root.left = delete(root.left,value);
      }else if(value > root.value){
          root.right = delete(root.right,value);
      }else{
          if(root.left != null && root.right != null){
              BinaryNode temp = root;
              BinaryNode minRoot = minNode(root.right);
              root.value = minRoot.value;
              root.right = delete(root.right, minRoot.value);
          }else if(root.left != null){
              root = root.left;
          }else if (root.right != null){
              root = root.right;
          }else{
              root = null;
          }
      }
  return root;
   }

   public void deleteBST(){
      root  = null;
      System.out.println("deleted");
   }


}
