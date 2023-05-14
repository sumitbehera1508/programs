fun main() {
    val n = 5  
    if(isfab(n)) print("it is fab") else print("Not fab")
}
fun isfab(x:Int) : Boolean{
    var num1 = 0
    var num2 = 1
    var temp:Int
    while(num2<x){
        temp=num1+num2
        num1=num2
        num2 = temp
    }
    if(num2==x || x==0){
        return true
    }
    return false
}