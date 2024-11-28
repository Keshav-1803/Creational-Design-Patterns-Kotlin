interface Car {
    fun drive()
}

class Tesla : Car {
    override fun drive() {
        println("Driving a Tesla")
    }
}

class BMW : Car {
    override fun drive() {
        println("Driving a BMW")
    }
}

class CarFactory {
    fun createCar(type: String): Car {
        return when (type) {
            "Tesla" -> Tesla()
            "BMW" -> BMW()
            else -> throw IllegalArgumentException("Unknown car type")
        }
    }
}

fun main() {
    val factory = CarFactory()
    val car1 = factory.createCar("Tesla")
    val car2 = factory.createCar("BMW")

    car1.drive()
    car2.drive()
}
