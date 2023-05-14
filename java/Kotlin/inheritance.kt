open class Person(val name : String = "sumit"){
    var age:Int = 10
    init{
        println("the person name is ${this.name}")
    }
    open fun doWork(){
        println("Person is working")
    }
   
}
class Student (name:String ="Sumit",val school :String = "Unkown"):Person(name){
    init{
        println("this is a student")
    }
    override fun doWork(){
        println("Student is working")
    }
    fun pDoWork(){
        super.doWork()
    }
}

fun main() {
    val k : Person = Person("hdfjhjh")
    val s : Student = Student()
    s.age = 14
    println("${k.age}  \n${s.age}")
    s.pDoWork()
    s.doWork()
    
}