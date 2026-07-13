class Matrix(
    private val matrix: Array<IntArray>,
    private val rows: Int,
    private val cols: Int
) {

    operator fun plus(other: Matrix): Matrix {
        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = matrix[i][j] + other.matrix[i][j]
            }
        }

        return Matrix(result, rows, cols)
    }

    operator fun minus(other: Matrix): Matrix {
        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = matrix[i][j] - other.matrix[i][j]
            }
        }

        return Matrix(result, rows, cols)
    }

    operator fun times(other: Matrix): Matrix {
        val result = Array(rows) { IntArray(other.cols) }

        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    result[i][j] += matrix[i][k] * other.matrix[k][j]
                }
            }
        }

        return Matrix(result, rows, other.cols)
    }

    override fun toString(): String {

        var output = "($rows x $cols Matrix):\n"

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                output += matrix[i][j].toString() + "\t"
            }
            output += "\n"
        }

        return output
    }
}

fun main() {

    val firstMatrix = Matrix(arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4)), 2, 3)
    val secondMatrix = Matrix(arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4)), 3, 2)
    val secondMatrix1 = Matrix(arrayOf(intArrayOf(6, 3), intArrayOf(9, 0), intArrayOf(5, 4)), 3, 2)

    println("****************Addition****************")

    print("Matrix:1 ")
    println(secondMatrix1)

    print("Matrix:2 ")
    println(secondMatrix)

    val thirdMatrix = secondMatrix1 + secondMatrix

    print("Addition: ")
    println(thirdMatrix)

    println("****************Subtraction****************")

    print("Matrix:1 ")
    println(secondMatrix1)

    print("Matrix:2 ")
    println(secondMatrix)

    val subtractMatrix = secondMatrix1 - secondMatrix

    print("Subtraction: ")
    println(subtractMatrix)

    println("****************Multiplication****************")

    print("Matrix:1 ")
    println(firstMatrix)

    print("Matrix:2 ")
    println(secondMatrix)

    val multiplication = firstMatrix * secondMatrix

    print("Multiplication: ")
    println(multiplication)
}