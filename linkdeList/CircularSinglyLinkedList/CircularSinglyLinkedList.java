public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue){
         head = new Node();
         Node node = new Node();
         node.value = nodeValue;
         size = 1;
         node.next = node;
         head = node;
         tail = node;
         return  head;
    }

    public void insertCSLL(int nodeValue,int location){
     Node node = new Node();
     node.value = nodeValue;
     if(head == null){
         createCSLL(nodeValue);
         return;
     }else  if(location == 0){
        node.next = head;
        head = node;
        tail.next = head;
     }else if(location >= size){
         tail.next = node;
         tail = node;
         tail.next = head;
     }else{
         Node temp = head;
         int index = 0;
         while (index < location - 1){
             temp = temp.next;
             index++;
         }
         node.next = temp.next;
         temp.next = node;

     }
     size++;
    }

    public void  traversalCSLL(){
        if(head != null){
            Node temp = head;
            int i = size;
            while(i >=0){
                System.out.println(temp.value);
                temp = temp.next;
                i--;
            }
        }else{
            System.out.println("not found");
        }
    }


    public boolean searchCSLL(int nodeValue){
        if(head != null){
            Node node = head;
            for(int i =0;i<size;i++){
                if(node.value == nodeValue){
                    return  true;
                }
                node = node.next;
            }
        }
        return  false;
    }

    public void deleteCSLL(int location){
        if(head == null){
            System.out.println("not found");
            return;
        }else if(location == 0){
            head = head.next;
            tail.next = head;
            size--;
            if(size == 0){
                head = null;
                tail = null;
                head.next = null;
            }

        }else if(location >= size){
            Node temp = head;
            for(int i = 0;i<size-1;i++){
                temp = temp.next;
            }
            if(temp == head){
                head.next= tail.next = null;
                tail = head = null;
                return;
            }
            temp.next = head;
            tail = temp;
            size--;
        }else{
            Node temp = head;
            for(int i = 0;i<size-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

     public  void removeCSLL(){
        if(head == null){
            System.out.println("not found");
        }else{
            head = head.next = null;
            tail = tail.next = null;
        }
     }

}
