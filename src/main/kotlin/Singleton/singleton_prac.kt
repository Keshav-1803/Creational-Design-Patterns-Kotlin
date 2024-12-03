package Singleton

object CarSingleton {

    init {
        println("CarSingleton is initialized!")
    }

    var brand: String = "Toyota"
    var model: String = "Corolla"
    var year: Int = 2020
    var mileage: Double = 0.0

    fun drive(distance: Double) {
        mileage += distance
        println("Car driven for $distance km. Total mileage: $mileage km.")
    }

    fun displayCarDetails() {
        println("Car details: $brand $model, Year: $year, Mileage: $mileage km.")
    }
}

object CarInventory {

    init {
        println("CarInventory initialized!")
    }

    private val carsInInventory = mutableListOf<String>()

    fun addCarToInventory(carName: String) {
        carsInInventory.add(carName)
        println("$carName has been added to the inventory!")
    }

    fun displayInventory() {
        println("Cars in inventory: $carsInInventory")
    }
}

fun main() {
    CarSingleton.displayCarDetails()
    CarSingleton.drive(100.0)
    CarSingleton.displayCarDetails()

    CarInventory.addCarToInventory("Toyota Corolla")
    CarInventory.addCarToInventory("Honda Civic")
    CarInventory.displayInventory()

    CarSingleton.drive(50.0)
    CarSingleton.displayCarDetails()

    val car1 = CarSingleton
    val car2 = CarSingleton

    if (car1 === car2) {
        println("Both car instances are the same!")
    }
}
