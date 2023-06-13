public class BinaryTree {
    String[] arr;
    int lastUsedIndex;
    public BinaryTree(int size){
        arr = new String[size+1];
        lastUsedIndex = 0;
    }

    public boolean isFull(){
        if(arr.length - 1 == lastUsedIndex){
            return true;
        }
        return false;
    }

    public void insert(String value){
        if(!isFull()){
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("created element");
        }else{
            System.out.println("is full");
        }
    }


    public void preOrder(int index){
        if(lastUsedIndex < index){
            return;
        }
        System.out.println(arr[index]);
        preOrder(index*2);
        preOrder(index*2+1);
    }

    public void inOrder(int index){
        if(lastUsedIndex < index){
            return;
        }
        inOrder(index*2);
        System.out.println(arr[index] + " ");
        inOrder(index*2+1);
    }

    public void postOrder(int index){
        if(lastUsedIndex < index){
            return;
        }
        postOrder(2*index);
        postOrder(2*index+1);
        System.out.println(arr[index] + " ");
    }

    public void levelOrder(){
        for(int i = 0; i<=lastUsedIndex;i++){
            System.out.println(arr[i] +  " ");
        }
    }


    public int search(String value){
        for(int i = 0; i<=lastUsedIndex;i++){
         if(arr[i] == value){
             return i;
         }
        }
        return -1;
    }


    public void delete(String value){
        int location = search(value);
        if(location == -1){
            return;
        }else{
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("deleted");
        }
    }

    public void deleteBT(){
        try {
            arr = null;
            System.out.println("deleted BT");
        }catch (Exception e){
            System.out.println("before deleted");
        }
    }

}
