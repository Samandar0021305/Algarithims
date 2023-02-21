// linear Search

function linearSearch(arr,val){
     for(let i=0;i<arr.length;i++){
        if(arr[i] == val){
            return i
        }
     }
     return -1
}

// console.log(linearSearch([3,9,4,2,3],9));


// Biynariy search

function bynarySearch(arr,val){
let start = 0
let end = arr.length - 1
  while(end >=start){
    let mid = Math.floor((start+end)/2)
    if(arr[mid] == val){
        return mid
    }
    if(val > arr[mid]){
        start = mid + 1
    }else{
        end=  mid - 1
    }
  }

  return -1
}

// console.log(bynarySearch([1,2,3,4,5,6,7],6));


// Native String search