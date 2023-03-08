class MyMap{
    constructor(){
        this.data = {}
    }

    set(key,value){
    this.data[key] = value
    return value
    }
    get(key){
        return this.data[key] 
    }
   
    has(key){
        for(let item in this.data){
            if(item === key) {
                return true
            }
        }
        return false
    }


    delete(key){
        delete this.data[key]
        return this 
    }

    clear(){
        this.data = {}
    }
    size(){
        let a = 0
        for(let index in this.data){
            a++
        }
        return a
    }
}

const value = new MyMap()

// console.log(value.set({},'hello'));
// console.log(value.delete({}));
// console.log(value);
value.set("hello",29)
console.log(value.size());