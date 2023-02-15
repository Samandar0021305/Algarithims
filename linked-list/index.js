class Node {
    constructor(value){
        this.value = value
        this.next = null
    }
}

class LinkedList {
    constructor(){
        this.head = null
        this.size = 0
    }

    isEmpty(){
        return this.size === 0
    }

    getSize(){
        return this.size
    }
  
    prepend(value){
        const node = new Node(value)
        if(this.isEmpty()){
            this.head = node
        }else{
            this.next = this.head
            this.head = node
        }

        this.size++
    }

    append(value){
     const node = new Node(value)
     if(this.isEmpty()){
        this.head = node
     }else{
        let prev = this.head
        while(prev.next){
            prev = prev.next
        }
        prev.next = node
     }
     this.size++
    }

    print(){
        if(this.isEmpty()){
            console.log("this is empty")
        }else{
            let cur = this.head
            let initValue = ""
            while(cur){
                initValue += `${cur.value}`
                cur = cur.next
            }
            console.log(initValue)
        }
    }

}

let list = new LinkedList()

// console.log(list.getSize())

list.prepend(60)
list.print()
list.prepend(50)



list.print()

