class myArray {
    constructor(...args){
     this.myArr = args ? [...args] : [];
    }

    myIncludes(value){
      for(let i =0;i<this.myArr.length;i++){
        if(value === this.myArr[i]){
            return true;
        }
      }
      return false;
    };

     myIndexOf(value){
        for(let i =0;i<this.myArr.length;i++){
            if(value === this.myArr[i]){
                return i;
            }
          }
          return -1;
     };

    myPush(value){
        this.myArr = [...this.myArr,value]
    }

    myPop(){
       let temp = this.myArr[this.myArr.length - 1];
       let value = []
       for(let i=0;i<this.myArr.length - 1;i++){
        value= [...value,this.myArr[i]]
       }
       this.myArr = value
       return temp
    }

    myShift(){
        let temp = this.myArr[0];
        let res = []
        for(let i=1;i<this.myArr.length;i++){
            res = [...res,this.myArr[i]]
        }
        this.myArr = res
        return res
    }
    myUnshift(val){
     this.myArr = [val,...this.myArr];
    }

     
    myConcat(arr){
      return [...this.myArr,...arr];
    }

    
}



let myVal = new myArray(3,2,1)

myVal.myPush(4)
console.log(myVal);