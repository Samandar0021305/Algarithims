class Node{
    constructor(val){
        this.val = val
        this.next = null
    }
}


class LinkedList{
    constructor(){
        this.head = null
        this.tail = null
        this.length = 0
    }

    push(x){
        let newNode= new Node(x)
        if(!this.head){
            this.head = newNode
            this.tail = this.head
        }else{
            this.tail.next = newNode
             this.tail=newNode
        }
        this.length ++
        return this
    }
    // traverse(){
    //     var current= this.head
    //     while(current){
    //         console.log(current.val);
    //         current = current.next
    //     }
    // }

    pop(){
        if(!this.head) return undefined
    }
}

let list = new LinkedList()
list.push("hhhhh")
list.push("asdas")
// list.traverse()
console.log(list);