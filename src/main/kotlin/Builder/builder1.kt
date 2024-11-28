package Builder

data class car (
    var brand : String,
    var model : String,
    var topSpeed : Int,
    var turbo : Boolean
)
class carBuilder {
    private var brand : String = ""
    private var model : String = ""
    private var topSpeed : Int = 0
    private var turbo : Boolean = false

    fun brand(brand : String) : carBuilder {
        this.brand = brand
        return  this
    }

    fun model(model : String) : carBuilder {
        this.model = model
        return this
    }

    fun topSpeed(topSpeed: Int) : carBuilder {
        this.topSpeed = topSpeed
        return this
    }

    fun turbo(turbo: Boolean) : carBuilder {
        this.turbo = turbo
        return this
    }

    fun build() : car{
        return car(brand,model,topSpeed,turbo)
    }
}

fun main() {

    // Builder Pattern - Use when object creation is complex, involves optional parameters, or requires validations.
    val builder = carBuilder()
    val superCar = builder
        .brand("Toyota")
        .model("Supra")
        .topSpeed(380)
        .turbo(true)
        .build()

    println(superCar)

    // Direct Constructor - Use when object creation is simple, with a fixed set of parameters and no additional logic needed.
    val superCar1 = car(
        brand = "Toyota",
        model = "Mark 5",
        topSpeed = 450,
        turbo = true
    )

    println(superCar1)
}