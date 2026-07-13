import kotlin.math.max

fun main(){

//    val a = Array<Int>(10){i->i*1}
//    for (i in a.indices)
//        println(max(a[i], 0))
//        println("Maximum number is ${a.max()}")
//    println(a.joinToString())



//    val a1 = arrayOf(34, 54, 66, 74,12)
//    var max = a1[0]
//    for (i in a1.indices){
//        if (max<a1[i])
//            max = a1[i]
//    }
//    println(max)

    val arr = IntArray(5)
    println("Enter the array values: ")

    for (i in 0..4){
        print("a[$i] = ")
        arr[i] = readLine()!!.toInt()
    }

    var max = arr[0]
    for (i in arr.indices){
        if (max < arr[i]){
            max=arr[i]
        }
    }
    println("Largest element = $max")

}