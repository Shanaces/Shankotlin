class Cars(var brand:String,var model:String, var year:Int){
    // functions
    fun drive(){
        println("Wrooom!")
    }
    fun speed(maxSpeed: Int){
    println("Max speed is: " + maxSpeed) 
    }

}


fun main(args: Array<String>) {

    // constructor
    val c1 = Cars("BMW","X5",2000)

    println(c1.brand)
    println(c1.model)
    println(c1.year)

    c1.drive()
    c1.speed(180)


    val c2 = Cars("Mustang","Ford",1949)

    println(c2.brand)
    println(c2.model)
    println(c2.year)



}