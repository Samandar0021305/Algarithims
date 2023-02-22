
// function SelectionSorting(arr){
//     function MaxValue(array){
//       let max = array[0]
//       array.forEach(val=>{
//         if(max < val){
//             max = val
//         }
//       })
//       return max
//     }
  
//     let res = []
//     let arr1 =arr 
//     while(arr1.length >=1){
//        res.push(MaxValue(arr1))
//        let value = []
//        arr1.forEach(val=>{
//         if(MaxValue(arr1) != val) value.push(val)
//        })    

//        arr1 = value
//     } 
//      return res
// }

let arr = [1,45,2,90,78,12]

// console.log(SelectionSorting(arr))


function selection(arr){
   for(let i=0;i<arr.length;i++){
     let str = i
     for(let j=i+1;j<arr.length;j++){
       if(arr[j] < arr[str]){
        str = j
       }
     }
     let temp = arr[i]
     arr[i] = arr[str]
     arr[str] = temp
   }
  return arr
}

console.log(selection(arr));