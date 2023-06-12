import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
  BinaryNode root;

  public BinaryTreeLL(){
    this.root = null;
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
    System.out.println(node.value + " ");
    inOrder(node.right);

  }

  public void postOrder(BinaryNode node){
    if(node == null){
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.value + " ");
  }

  public void levelOrder(){
   Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
   queue.add(root);
   while (!queue.isEmpty()){
     BinaryNode presentNode = queue.remove();
     System.out.println(presentNode.value + " ");
     if(presentNode.left != null){
       queue.add(presentNode.left);
     }
     if(presentNode.right != null){
       queue.add(presentNode.right);
     }
   }
  }

  public void Search(String str){
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty()){
      BinaryNode parse = queue.remove();
      if(parse.value == str){
        System.out.println("yes ");
        return;
      }else{
        if(parse.left != null){
          queue.add(parse.left);
        }
        if(parse.right != null){
          queue.add(parse.right);
        }
      }

    }
    System.out.println("not found");
  }

  void Insert(String str){
    BinaryNode newNode = new BinaryNode();
    newNode.value = str;

    if(root == null){
      root = newNode;
      System.out.println("create root");
      return;
    }

    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);

    while (!queue.isEmpty()){
      BinaryNode prest = queue.remove();
      if(prest.left == null){
        prest.left = newNode;
        System.out.println("sucsess");
        break;
      }else if(prest.right == null){
        prest.right = newNode;
        System.out.println("sucsess");
        break;
      }else {
        queue.add(prest.left);
        queue.add(prest.right);
      }
    }
  }

  public BinaryNode getDeep(){
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    BinaryNode perst = null;
    while (!queue.isEmpty()){
      perst = queue.remove();
      if(perst.left != null){
        queue.add(perst.left);
      }
      if(perst.right != null){
        queue.add(perst.right);
      }
    }
    return perst;
  }

  public void deleteDeep(){
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    BinaryNode prev,pres = null;
    while (!queue.isEmpty()){
      prev = pres;
      pres = queue.remove();
      if(pres.left == null){
        prev.right = null;
        return;
      }else if(pres.right == null){
        pres.right = null;
        return;
      }
      queue.add(pres.left);
      queue.add(pres.right);
    }
  }

  public void deleteNode(String value){
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty()){
      BinaryNode pre = queue.remove();
      if(pre.value == value){
        pre.value = getDeep().value;
        deleteDeep();
        return;
      }else{
        if(pre.left != null){
          queue.add(pre.left);
        }
        if(pre.right != null){
          queue.add(pre.right);
        }
      }

    }
    System.out.println("not found");
  }


  public void deleteBT(){
    root = null;
    System.out.println("BT deleted");
  }


}
