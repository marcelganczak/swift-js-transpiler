var number = 60
var divisors: [Int] = []

for divisor in 1...number {
    if number % divisor == 0 {
        divisors.append(divisor)
    }
}

for divisor in divisors {
    print(divisor)
}