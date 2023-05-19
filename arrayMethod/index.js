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

    myMap(fn){
    let values = []
        for(let i=0;i<this.myArr.length;i++){
          values = [...values,fn(this.myArr[i],i)]
       }
       return values
    }

    myFilter(fn){
        let values = []
        for(let i = 0;i<this.myArr.length;i++){
            if(fn(this.myArr[i],i)){
              values = [...values,this.myArr[i]]
            }
        }
        return values
    }

    myForEach(fn){
      for(let i = 0; i<this.myArr.length;i++){
        fn(this.myArr[i],i,this.myArr);
      }
    }


    myEntries(){
      let values = [];

      for(let i = 0; i<this.myArr.length;i++){
        values =[...values,[i,this.myArr[i]]]
      }
      return values
    }

    myEvery(fn){
     for(let i=0;i<this.myArr.length;i++){
       if(!fn(this.myArr[i],i,this.myArr)){
          return false;
       }
     };
     return true
    }

    myFind(fn){
     for(let i=0;i<this.myArr.length;i++){
      if(fn(this.myArr[i],i)){
       return this.myArr[i]
      }
     }
     return -1;
    }

    myFindIndex(){
      for(let i=0;i<this.myArr.length;i++){
        if(fn(this.myArr[i],i)){
         return i
        }
       }
       return -1;
    }

    myKeys(){
      let values  = []
      for(let i=0;i<this.myArr.length;i++){
        values = [...values,i]
      }
      return values
    }


    myReverse(){
      let n = this.myArr.length
      for(let i=0;i<n / 2;i++){
        let temp = this.myArr[i]
        this.myArr[i] = this.myArr[n - 1 -i];
        this.myArr[n - 1 -i] = temp
      }
      return this.myArr
    }
}



let myVal = new myArray(3,2,1,null)

// console.log(myVal.myReverse());
// console.log(myVal.myFilter((a,b)=> a>1))

// let temp = myVal.myMap((a,b)=>a*2);

// console.log(temp);
// myVal.myPush(4)
// console.log(myVal);