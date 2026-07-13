import java.util.Arrays

fun main(){
//    val a1 = arrayOf('a', 'b', 'c')
//    println(a1.joinToString())
//
//    val a2 = Array<Int>(5){10} // value in {} is the fun parameter and it's lambda fun
//    println(a2.joinToString())
//
//    val a3 = Array<Int>(5){i->i*2} // here parameter is index
//    a3.shuffle() // here every shuffle
//    println(a3.joinToString())
//    a3.sort()
//    println(a3.joinToString())


    val arr1 = arrayOf(10, 90, 60, 80, 100)
    println("Array-1 by using arrayOf() method: \n${arr1.contentDeepToString()}")

    val arr2 = Array<Int>(5){0}
    println("Array-2 by using Array<>(): \n${arr2.contentDeepToString()}")

    val arr3 = Array<Int>(8){i->i*1}
    println("Array-3 by using Array<>() and lambda function: \n${arr3.contentDeepToString()}")

    val arr4 = IntArray(5){0}
    println("Array-4 by using IntArray(): \n${arr4.joinToString()}")

    val arr5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println("Array-5 by using intArrayOf(): \n${arr5.joinToString()}")

    val twoDArray = arrayOf(intArrayOf(1,3), intArrayOf(4,5), intArrayOf(6,7))
    println("2D Array-6 by using arrayOf() and intArrayOf(): \n${twoDArray.contentDeepToString()}")

    val arr6 = IntArray(5)
    println("Please enter array values: ")

    for (i in 0..4){
        print("a[$i] = ")
        arr6[i] = readLine()!!.toInt()
    }

    println()
    println("Entered Array: \n${arr6.joinToString(", ")}")
    println()

    val builtInFun = arr6.copyOf()
    builtInFun.sort()

    println("********** With Built-in Function **********")
    println("Sorted Array:")
    println(builtInFun.joinToString(", "))
    println()


    println("********** Without Built-in Function **********")
    println("Before Sorting: \n${arr6.joinToString()}")
    println()

    val bubble_sort = arr6.copyOf()

    for (i in 0 until bubble_sort.size - 1) {
        for (j in 0 until bubble_sort.size - i - 1) {
            if (bubble_sort[j] > bubble_sort[j + 1]) {

                val temp = bubble_sort[j]
                bubble_sort[j] = bubble_sort[j + 1]
                bubble_sort[j + 1] = temp
            }
        }
    }

    println("After sorting without built-in function: \n${bubble_sort.joinToString(", ")}")

}