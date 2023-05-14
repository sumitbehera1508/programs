class Student(val name:String ){
    class Tiffin(){
        fun printT(){
            println("Tiffin")
        }
    }
    inner class Bag(){
        fun printBag(){
            println("Bag in $name")
        }
    }
}

fun main(){
    Student.Tiffin().printT()
    Student("sumit").Bag().printBag()
}