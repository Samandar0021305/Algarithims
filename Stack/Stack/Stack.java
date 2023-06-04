public class Stack {
    int[] arr;
    int topOfStack;
    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
    }

    public boolean isEmpty(){
        if(this.topOfStack == -1){
            return true;
        }
        return false;
    }

    public  boolean isFull(){
        if(topOfStack == arr.length - 1 ){
            return  true;
        }
        return  false;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("this array succesfuly inserted");
        }
    }

  public  int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
            int topStack = arr[topOfStack];
            topOfStack--;
            return  topOfStack;
    }


    public  int peek(){
        if (isEmpty()){
            return  -1;
        }
        return arr[topOfStack];
    }

    public  void deleteStack(){
        arr = null;
        System.out.println("Sucsessfuly delete");
    }


}
