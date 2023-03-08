class MySet{
    constructor(...arg){
        this.data = arg ? arg : {}
    }
    add(value){
       this.data = {...this.data,value}
       return this
    }

    delete(value){
       if(this.data[value]){
          delete this.data[value]
          return true
       }else{
        return false
       }
    }

    has(value){
        for(let val in this.data){
            if(`${val}` == `${value}`){
           return true
            }
        }
        return false
    }

     size(){
        let a = 0
        for(let index of this.data){
            a++
        }
        return a
     }
}