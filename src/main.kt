fun main(){
    var car= Car("Corolla","Ford","Maroon",20)
    car.carrying(44)

    car.identity()

    var x= car.calculateParkingFees(2)
    println(x)

    var bus= Bus("singleDeck","Tatra","Yellow",80)
    println(bus.maxTripFare(13.4))

    println(bus.parkingFees(150,3))



}
open class Car(var make: String, var model: String,  var color: String, var capacity: Int){
    fun carrying(people: Int){
     var x= people-capacity
        if(people <= capacity)
            println("Carrying $people passengers") else{
                println("Over capacity by $x people")
        }

    }
    fun identity(){
        println("I am $color $make $model")

    }
    fun calculateParkingFees(hours: Int): Int{
        var fees= hours*20
        return fees

    }
}

class Bus(make: String, model: String, color: String, capacity: Int){
    fun maxTripFare(Fare:Double): Double{
        var fare=45.2
        return fare

    }
    fun parkingFees(fee: Int,hour:Int):Int{
        var fees=hour *fee
        return fees

    }

}