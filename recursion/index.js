function CountDown(n){
    if(n==0){
        return "All"
    }
   console.log(n)
   n--
   return CountDown(n)
}

// console.log(CountDown(5));

// n gacha bo'lgan sonni qo'shish
function sumaRange(n){
    if(n===1) return 1
    return n + sumaRange(n-1)
}

// console.log(sumaRange(10))


// sonni faktariolini topish

function faktarial(n){
    if(n==1) return 1
    return n*faktarial(n-1)
}

// console.log(faktarial(5))
