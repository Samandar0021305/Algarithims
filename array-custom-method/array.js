// let arr = [1,2,0,3,4,undefined]

// Array.prototype.myReduce = function(old,cur){
//  let sum = cur == undefined ? 0 :cur
 
//  for(let i = cur == undefined ? 0 : cur;i<this.length;i++){
//     sum = old(sum,this[i])
//  }
 
//  return sum
// }

// console.log(arr.myReduce((a,b)=>b+a,0))

// Array.prototype.myFilter = function(val,index,n){
//   let res = []
//   for(let i=index == undefined ? 0 : index ; i<this.length;i++){
//     val = this[i]
//     if(val){
//         res.push(val)
//     }
//   }
//   return res
// }

// console.log(arr.myFilter((a,b)=>a))



// Array.prototype.mySort = function(){
//     for(let i=0;i<this.length;i++){
//         for(let j=0;j<this.length ;j++){
//             if(this[j] > this[j+1]){
//                 let temp = this[j]
//                 this[j] = this[j+1]
//                 this[j+1] = temp
//             }
//         }
//     }
//     return this
// }

// console.log([5,90,4,2,12].mySort())