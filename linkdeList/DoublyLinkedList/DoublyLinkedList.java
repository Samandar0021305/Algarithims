public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createCLL(int nodeValue){
        head = new DoublyNode();
        DoublyNode newNode =new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size=1;
        return  head;
    }

    public void instertDLL(int nodeValue,int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;

        if(head == null){
            createCLL(nodeValue);
            return;
        }else if(location == 0){
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }else if(location >= size){
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }else{
            DoublyNode temp = head;
            int index = 0;
            while (index < location -1){
                temp = temp.next;
                index++;
            }
            newNode.prev = temp;
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    public  void traverseDLL(){
        if(head !=null){
            DoublyNode temp = head;
            for(int i =0;i<size;i++){
                System.out.println(temp.value + " " + i);
                temp = temp.next;
            };

        }else{
            System.out.println("not found");
        }
    }


    public void  reverseTraverseDLL(){
        if(head != null){
            DoublyNode temp = tail;
            for(int i = 0;i<size;i++){
                System.out.println(temp.value + " " + i);
                temp = temp.prev;
            }
        }else{
            System.out.println("not found");
        }
    }

       public  boolean searchDLL(int nodeValue){
        if(head != null){
            DoublyNode temp = head;
            for(int i = 0; i <size;i++){
                if(temp.value == nodeValue){
                    System.out.println(i);
                    return true;
                }
                temp = temp.next;
            }
        }
        return  false;
       }

       public void deleteNodeDLL(int location){
         if(head == null){
             System.out.println("not found nodeList");
           return;
         }else if (location == 0){
           if(size == 1){
               head = null;
               tail = null;
               size--;
               return;
           }else{
               head = head.next;
               head.prev = null;
               size--;
           }
         }else if(location >=size){
             DoublyNode temp = tail.prev;
             if(size == 1){
                 head = null;
                 tail = null;
                 size--;
                 return;
             }else {
                 temp.next = null;
                 tail = temp;
                 size--;
             }
         }else {
             DoublyNode temp = head;
             for(int i =0;i<location - 1;i++){
                 temp = temp.next;
             }
             temp.next = temp.next.next;
             temp.next.prev = temp;
             size--;
         }


       }


       public void deleteDLL(){
        DoublyNode temp = head;
        for(int i =0;i<size;i++){
            temp.prev = null;
            temp = temp.next;
        }
        head = null;
        temp=null;
       }


}
