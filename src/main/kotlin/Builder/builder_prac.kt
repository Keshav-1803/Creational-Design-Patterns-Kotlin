package Builder

data class Car(
    var brand: String,
    var model: String,
    var topSpeed: Int,
    var turbo: Boolean,
    var color: String? = null,
    var engineType: String? = null,
    var sunroof: Boolean = false
)

class CarBuilder {
    private var brand: String = ""
    private var model: String = ""
    private var topSpeed: Int = 0
    private var turbo: Boolean = false
    private var color: String? = null
    private var engineType: String? = null
    private var sunroof: Boolean = false

    fun brand(brand: String): CarBuilder {
        this.brand = brand
        return this
    }

    fun model(model: String): CarBuilder {
        this.model = model
        return this
    }

    fun topSpeed(topSpeed: Int): CarBuilder {
        if (topSpeed <= 0) {
            throw IllegalArgumentException("Top speed must be greater than 0!")
        }
        this.topSpeed = topSpeed
        return this
    }

    fun turbo(turbo: Boolean): CarBuilder {
        this.turbo = turbo
        return this
    }

    fun color(color: String): CarBuilder {
        this.color = color
        return this
    }

    fun engineType(engineType: String): CarBuilder {
        this.engineType = engineType
        return this
    }

    fun sunroof(sunroof: Boolean): CarBuilder {
        this.sunroof = sunroof
        return this
    }

    fun build(): Car {
        if (brand.isEmpty() || model.isEmpty()) {
            throw IllegalArgumentException("Brand and Model are required!")
        }
        return Car(brand, model, topSpeed, turbo, color, engineType, sunroof)
    }
}

fun main() {
    try {
        val carBuilder = CarBuilder()
        val customCar = carBuilder
            .brand("BMW")
            .model("M3")
            .topSpeed(250)
            .turbo(true)
            .color("Black")
            .engineType("V8")
            .sunroof(true)
            .build()

        println(customCar)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

    try {
        val simpleCar = CarBuilder()
            .brand("Ford")
            .model("Focus")
            .topSpeed(180)
            .turbo(false)
            .build()

        println(simpleCar)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
