package Factory

interface Car {
    fun drive()
}

class ElectricCar(val model: String) : Car {
    override fun drive() {
        println("Driving an electric $model")
    }
}

class GasCar(val model: String) : Car {
    override fun drive() {
        println("Driving a gas-powered $model")
    }
}

class CarFactory {
    fun createCar(model: String, fuelType: String): Car {
        return when (fuelType) {
            "Electric" -> ElectricCar(model)
            "Gas" -> GasCar(model)
            else -> throw IllegalArgumentException("Unknown fuel type")
        }
    }
}

fun main() {
    val factory = CarFactory()

    val car1 = factory.createCar("Tesla Model S", "Electric")
    val car2 = factory.createCar("Ford Mustang", "Gas")

    car1.drive()
    car2.drive()
}
