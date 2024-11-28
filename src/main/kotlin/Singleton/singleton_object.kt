package Singleton

import kotlin.math.sin

object singleton {

   init {
       println("This is the Init block")
   }
   private var count : Int = 0

   fun display() {
      for(nums in 1..5){
         count = nums
         println(count)
      }
   }
}

fun main() {
   singleton.display()
   singleton.display()

   println(singleton1)
   println(singleton1)

   println(singleton2)
   println(singleton2)

}

object singleton1{
   init {
       println("This is the init block...")
   }
}


object singleton2 {
   init {
      println("This is the init block")
   }

   // var instance : singleton? = null
   var instance : singleton2 = singleton2
   // var instance = singleton

   fun display() {
      if (instance == null){
         instance = singleton2
      }
      instance
   }
}