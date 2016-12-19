func divides(_ a: Int, _ b: Int) -> Bool {
    return a % b == 0
}

func countDivisors(_ number: Int) -> Int {
    var cnt = 0
    for i in 1...number {
        if divides(number, i) {
            cnt += 1
        }
    }
    return cnt
}

func isPrime(_ number: Int) -> Bool {
    return countDivisors(number) == 2
}

print(divides(10, 2))
print(divides(10, 3))
print(divides(10, 4))
print(divides(10, 5))

print(countDivisors(11))
print(countDivisors(15))
print(countDivisors(24))
print(countDivisors(64))

print(isPrime(2))
print(isPrime(3))
print(isPrime(4))
print(isPrime(5))
print(isPrime(6))