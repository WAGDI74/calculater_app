fun add (num1:Int , op:String , num2:Int): Int{
    return (num1+num2)
}
fun sub (num1:Int , op:String , num2:Int): Int{
    return (num1-num2)
}
fun mul (num1:Int , op:String , num2:Int): Int{
    return (num1*num2)
}
fun div (num1:Int , op:String , num2:Int): Int{
    return (num1/num2)
}
fun mod (num1:Int , op:String , num2:Int): Int{
    return (num1%num2)
}
fun main(){
    println("ENTER NUM1 =")
    var num1:Int = readLine()!!.toInt()
    println("ENTER OP : ")
    var op:String= readLine()!!
    println("Enter NUM2")
    var num2:Int = readLine()!!.toInt()

    if (op=="+"){
       var result = add(num1,op,num2)
        println(result)
    }
    if (op=="-") {
        var result = sub(num1,op,num2)
        println(result)
    }
    if (op=="*") {
        var result = mul(num1,op,num2)
        println(result)
    }
    if (op=="/") {
        var result = div(num1,op,num2)
        println(result)
    }
    if (op=="%") {
        var result = mod(num1,op,num2)
        println(result)
    }

}