public class CircularDoublyLinkedList {
    public DoubleNode head;
    public DoubleNode tail;
    public int size;

    public DoubleNode createCDLL(int nodeValue){
        head = new DoubleNode();
        DoubleNode newNode = new DoubleNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return  head;
    }

    public void insertCDLL(int nodeValue,int location){
        DoubleNode newNode = new DoubleNode();
        newNode.value = nodeValue;
        if(head == null){
            createCDLL(nodeValue);
            return;
        }else if(location == 0){
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
            size++;
        }else if(location >= size){
            newNode.next = head;
            newNode.prev = tail.prev;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
            size++;
        }else{
            DoubleNode temp = head;
            int index = 0;
            while (index < location-1){
                temp = temp.next;
                index++;
            }
            newNode.prev = temp;
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.next.prev = newNode;
            size++;
        }
    }

    public void  traversalCDLL(){
        if(head == null) {
            System.out.println("not found");
            return;
        }else{
            DoubleNode temp = head;
            for(int i = 0; i<size;i++){
                System.out.println(temp.value + " " + i);
                temp = temp.next;
            }
        }
    }

    public void traversalReverseCDLL(){
        if(head != null){
            DoubleNode temp = tail;
            for(int i =0;i<size;i++){
                System.out.println(temp.value + " " + i);
                temp = temp.prev;

            }
        }else{
            System.out.println("not found");
        }
    }

    boolean searchCDLL(int nodeValue){
        if(head != null){
            DoubleNode temp = head;
            for(int i = 0;i < size;i++){
                if(temp.value == nodeValue){
                    System.out.println(i);
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

   public  void deleteNodeCDLL(int location){
    if(head == null){
        System.out.println("not found");
        return;
    }else if(location == 0){
        if(size == 1){
            head.prev = null;
            head.next = null;
            head = tail = null;
            size--;
            return;
        }else{
            head = head.next;
            head.prev = tail;
            tail.next=head;
            size--;
        }
    }else if(location >= size){
        if(size == 1){
            head.prev = null;
            head.next = null;
            head = tail = null;
            size--;
            return;
        }else{
            tail = tail.prev;
            tail.next = head;
            head.prev= tail;
            size--;
        }
    }else{
        DoubleNode temp = head;
        int index = 0;
        while (index < location-1){
            temp = temp.next;
            index++;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
    }
    }

    public void deleteCDLL(){
        DoubleNode temp = head;
        for(int i = 0; i<size;i++){
            temp.prev = null;
            temp = temp.next;
        }
        head = null;
        tail = null;
    }

}
