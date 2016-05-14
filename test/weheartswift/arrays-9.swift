var listOfNumbers = [1, 2, 3, 10, 100]

var x = 10

var xAppears = false

for number in listOfNumbers {
    if number == x {
        xAppears = true
    }
}

if xAppears {
    print("yes")
} else {
    print("no")
}