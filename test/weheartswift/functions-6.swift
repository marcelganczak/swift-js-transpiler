func divides(a: Int, _ b: Int) -> Bool {
    return a % b == 0
}

func countDivisors(number: Int) -> Int {
    var cnt = 0
    for i in 1...number {
        if divides(number, i) {
            ++cnt
        }
    }
    return cnt
}

func isPrime(number: Int) -> Bool {
    return countDivisors(number) == 2
}

func printFirstPrimes(count: Int) {
    var i = 2
    var printed = 0
    while printed < count {
        if isPrime(i) {
            print(i)
            printed += 1
        }
        i += 1
    }
}

printFirstPrimes(10)