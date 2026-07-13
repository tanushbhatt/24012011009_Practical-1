//fun main(){
////    val c = Car("BMW", 10000.0)
////    val s = Suzuki("Hi", 200000.0)
////    println(c.model)
////    println(c.price)
////    println(s.model)
////    println(s.price)
////}
////
////open class Car(var model:String){ // Parent Class
////    var price: Double = 0.0
////    constructor(m: String, p: Double): this(m){ // 'this' is used to call primary constructor
////        price = p
////    }
////}
////
////class Suzuki(m: String, p: Double): Car(m){ // child
//
//}

class Car(
    var type: String,
    var model: Int,
    var price: Double,
    var owner: String,
    var milesDrive: Int
) {

    init {
        println("Object of class is created and Init is called.")
    }

    fun getCarInformation() {
        println("Car Information: $type, $model")
    }

    fun getOriginalCarPrice() {
        println("Original Car Price: $price")
    }

    fun getCurrentCarPrice() {
        val currentPrice = price - (milesDrive * 10)
        println("Current Car Price: $currentPrice")
    }

    fun displayCarInformation() {
        getCarInformation()
        println("Car Owner: $owner")
        println("Miles Drive: $milesDrive")
        getOriginalCarPrice()
        getCurrentCarPrice()
    }
}

fun main() {

    println("Creating Car Class Object car1 in next line")
    val car1 = Car("BMW", 2018, 100000.0, "Aman", 105)

    println("----------")
    println()

    car1.displayCarInformation()

    println("----------")
    println()

    println("Creating Car Class Object car2 in next line")
    val car2 = Car("BMW", 2019, 400000.0, "Karan", 20)

    println("----------")
    println()

    car2.displayCarInformation()

    println("----------")
    println()

    println("******* ArrayList of Car ***************")

    val carList = ArrayList<Car>()

    carList.add(Car("Toyota", 2017, 1080000.0, "KJS", 100))
    carList.add(Car("Maruti", 2020, 4000000.0, "NPP", 200))

    println("----------")

    for (car in carList) {
        println()
        println("----------")
        car.displayCarInformation()
        println("----------")
    }
}