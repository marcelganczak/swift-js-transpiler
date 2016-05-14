var mealCost:Double = 3.5
var tip:Int = 20

var tipCost = mealCost * Double(tip) / 100.0
var totalCost = mealCost + tipCost

print(totalCost)