class Node {
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
      var newNode = new Node(x)
      if(!this.head){
        this.head = newNode;
        this.tail = this.head
      }else{
        this.tail.next = newNode
        this.tail = newNode
      }
      this.length++
      return this
    }
}


let list = new LinkedList()
list.push("hi")
list.push("you")
console.log(list)