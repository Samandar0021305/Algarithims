var myStack = function(){
    this.element =[]
}

myStack.prototype.pop = function(){
    return this.element.pop()
}

myStack.prototype.push = function(x){
    this.element.push(x)
}

myStack.prototype.top = function(){
    return this.element[this.element.length - 1]
}

myStack.prototype.isEmpty = function(){  
      return this.element.length === 0
}