var numbers = [12, 36, 720, 18]

// find the minimum value in numbers
var maxDiv = numbers[0]

for number in numbers {
    if number < maxDiv {
        maxDiv = number
    }
}

var gcd = 1

// find the biggest number that divides all the numbers
for divisor in 1...maxDiv {
    // we assume that divisor divides all numbers
    var dividesAll = true
    for number in numbers {
        // if we find one that does not divide by divisor
        if number % divisor != 0 {
            // we remeber and stop searching
            dividesAll = false
            break
        }
    }

    // if divisor divides all numbers then it's the biggest one so far
    if dividesAll {
        gcd = divisor
    }
}

print(gcd)