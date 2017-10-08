class Vehicle {
    var speed = ["elo": 1]
}
class Bicycle: Vehicle {
    var hasBasket = false
}
var bicycle = Bicycle()
print(bicycle.speed.count)