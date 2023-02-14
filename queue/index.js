var myQueue = function(){
    this.element = []
}

myQueue.prototype.push = function(x){
    this.element.push(x)
}

myQueue.prototype.shift = function(){
    return this.element.shift()
}

myQueue.prototype.top = function(){
    return this.element[this.element.length - 1]
}

myQueue.prototype.isEmpty = function(){
    return this.element.length == 0 
}