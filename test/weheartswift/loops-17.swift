var number = 17

var numberOfDivisors = 0

for i in 1...number {
    if number % i == 0 {
        numberOfDivisors += 1
    }
} 

if numberOfDivisors == 2 {
    print("prime")
} else {
    print("not prime")
}

