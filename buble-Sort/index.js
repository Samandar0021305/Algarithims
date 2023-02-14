function bubleSort(arr){
    for(let i=0;i<arr.length;i++){
        for(let j=0;j<arr.length - i -1;j++){
            if(arr[j] > arr[j+1]){
                let temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
            }
        }
    }
    return arr
}

let array = [3,90,34,123,12,3,5,2]
console.log(bubleSort(array))