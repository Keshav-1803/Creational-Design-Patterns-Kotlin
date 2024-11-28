package Singleton

class Manager private constructor() {
    companion object {
        //  @Volatile keyword is used to ensure that changes to the instance variable are immediately visible to all threads.
        @Volatile
        private var instance : Manager? = null

        fun getInstance() = synchronized(this) {
            if(instance == null)
                instance = Manager()

            instance
        }
    }
}

fun main() {
    println(Manager.getInstance())
}

