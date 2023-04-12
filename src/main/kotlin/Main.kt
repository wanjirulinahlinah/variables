

fun main() {
    numbers(20,3)
    information("lina", 24, "black")
    number(50,50,100)


}
//Q1Write a program that a ask a  user to enter two numbers and stores them in variables.
//The program should then calculate and print the sum ,difference ,product and
//quoetient of the two numbers.

fun numbers(num1:Int,num2:Int){
    var sum=num1+num2
    println(sum)
    var diff=num1-num2
    println(diff)
    var multiply=num1*num2
    println(multiply)
    var quotient=num1/num2
    println(quotient)
}
//Q2Write a program that prompts the user to enter their name, age,
// and favorite color, and then prints out a message including all of that information.
fun information(name:String,age:Int,colour:String){

    println("i am $name my age is $age years old. i love $colour color")
  }

//Q3Write a program that calculates the average of three numbers.
// The user should be prompted to enter the three numbers.

fun number(Nam4:Int,nam3:Int,nam5:Int){
    println(Nam4 + nam3 + nam5)
}

}



