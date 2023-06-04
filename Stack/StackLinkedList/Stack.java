public class Stack {
   SinglLinkedList linkedList;
   public Stack(){
       linkedList = new SinglLinkedList();

   }

   public  void push(int value){
     linkedList.insertinLinkedList(value,0);
   }

   public boolean isEmpty(){
       if(linkedList.head == null) return  true;
       return  false;
   }

   public int pop(){
       int res = 0;
       if(isEmpty()){
           System.out.println("not found");
           return  -1;
       }else {
           res =  linkedList.head.value;
           linkedList.deleteSinglyLinkedList(0);
       }
       return  res;
   }

   public  int peek(){
       int res = -1;
       if(isEmpty()){
           System.out.println("not found");
       }else{
           res = linkedList.head.value;
       }
       return  res;
   }
   public void deleteStack(){
       linkedList.head = null;
   }

}
