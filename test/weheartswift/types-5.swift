var numberOfFields:Int = 5
var wheatYield:Double = 7.5
var weatherWasGood:Bool = true

var totalYield = Double(numberOfFields) * wheatYield
if (weatherWasGood == true) {
    totalYield = totalYield * 1.5
}

print(totalYield)