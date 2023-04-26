fun main() {
    findsecondlargest(arrayOf(23,12,45,67,22,89,34))
    var b=addoddnumber(arrayOf(11,12,13,14,15,16,17,18,19))
    println(b)
    fruits(arrayOf("mango","apple","oranges","lyn","love"))
    sortinreverse(arrayOf("mary","jane","zakia","ann","brenda"))
    findlongeststring(arrayOf("mary","ann","serah","mentorship"))
    removeduplicates(arrayOf(1,2,3,1,2,3,4,5,6,4))
    var z=productofnum(arrayOf(10,10,10,10))
    println(z)

}

//Write a Kotlin program to create an array of integers and
//find the second largestt element in the array.

fun findsecondlargest(numbers:Array<Int>){
    var c=numbers.sorted()
    println(c[5])
}
//Write a Kotlin program to create a function that takes
//an array of integers as input and
//returns the sum of all the odd numbers in the array.
fun addoddnumber(number:Array<Int>):Int{
    var sum=0
    for (a in number){
        if (a%2!=0){
            sum+=a
        }
    }
    return  sum
}
//Write a Kotlin program to create an array
//of strings and print only the
//strings that contain the letter 'a'.
fun fruits(names:Array<String>){
    for (e in names){
        if ('a' in e){
            println(e)
        }
    }
}
//Write a Kotlin program to create an array of strings
//and sort them in reverse alphabetical order.
fun sortinreverse(namees:Array<String>){
    var c=namees.sortedDescending()
    println(c)


    }
//Write a Kotlin program to create an array of strings and
//find the longest string in the array.
fun findlongeststring(nammes:Array<String>){
    var n=""
    for (m in nammes){
        if (m.length>n.length){
          n=m
            println(n)
        }
    }
}
//Write a Kotlin program to create an array of integers and
//remove all the duplicates in the array.
fun removeduplicates(numb:Array<Int>){
    var f=numb.distinct()
    println(f)

}
//Write a Kotlin program to create a function
//that takes an array of integers as input and
//returns the product of all
//the elements in the array.
fun productofnum(numberss:Array<Int>):Int{
    var j=1
    for (p in numberss){
        j*=p
    }
    return j
}

