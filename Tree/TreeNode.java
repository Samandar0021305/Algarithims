import java.util.ArrayList;

public class TreeNode {
 String data;
 ArrayList<TreeNode> children;
 public TreeNode(String data){
      this.data = data;
      this.children = new ArrayList<TreeNode>();
 }

 public void addChaild(TreeNode node){
      this.children.add(node);
 }


 public String print(int lavel){
     String ret;
     ret = " ".repeat(lavel) + data + "\n";
     for(TreeNode node:this.children){
         ret += node.print(lavel+1);
     }
     return ret;
 }

}
