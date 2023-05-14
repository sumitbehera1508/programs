abstract class Person(){
    abstract fun det()
}

class Student(val name:String="unknown",val age:Int =0):Person(){
    override fun det(){
        println("name : $name \nage : $age")
    }
}
fun main(){
    val a :Person = Student()
    a.det()
}