public class SinglLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return  head;
    }

    public  void  insertinLinkedList(int nodeValue,int location){
        Node node  = new Node();
        node.value = nodeValue;
        if(head == null){
            createSinglyLinkedList(nodeValue);
            return;
        }else if(location == 0){
            node.next = head;
            head = node;

        }else if(location >= size){
            node.next = null;
            tail.next = node;
            tail = node;

        }else{
            Node tamp = head;
            int index = 0;
            while (index < location - 1){
                tamp = tamp.next;
                index++;
            }
            Node nexNode = tamp.next;
            tamp.next = node;
            node.next = nexNode;
        }
        size++;

    };


    public  void traversalLinkedList(){
        if(head == null){
            System.out.println("SLL does not exist!");
        }else{
            Node temp = head;
            int index = size;
            while (index >= 0){
                System.out.println(temp.value);
                temp = temp.next;
                index--;
            }

        }
    }


    public  boolean SearchNode(int nodeValue){
        if(head != null){
            Node temp = head;
            for(int i =0;i<size;i++){
                if(temp.value == nodeValue){
                    return  true;
                }
                temp= temp.next;
            }
        }
        return  false;
    }


    public  void deleteSinglyLinkedList(int location){
        if(head == null) {
            System.out.println("Node not found");
            return;
        }else if(location == 0){
            head = head.next;
            size--;
            if(size == 0){
                tail = null;
            }
        }else if(location >= size){
            Node temp = head;
            for(int i =0; i<size-1;i++){
                temp = temp.next;
            }

            if(temp == head){
                tail = head = null;
                size--;
                return;
            }
            temp.next = null;
            tail = temp;
            size--;
        }else{
            Node temp = head;
            for(int i = 0; i<location-1;i++){
                temp= temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }


    }


    public  void deleteNode(){
        head =null;
        tail = null;
    }


}