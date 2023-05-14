open class Vehicle(){
    init{
        println("A vehicle is created ")
    }
    open fun start(){
    }
}
class Audi():Vehicle(){
    init{println("it is an Audi")}
    override fun start(){
        println("Audi is started")
    }
}
class BMW():Vehicle(){
    init{println("it is a BMW")}
    override fun start(){
        println("BMW is started")
    }
}
fun main(){
    val acar : Vehicle = Audi()
    startcar(acar)
    val bcar : Vehicle = BMW()
    startcar(bcar)
}
fun startcar(car:Vehicle){
    car.start()
}