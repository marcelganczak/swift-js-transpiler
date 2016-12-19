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

func printFirstPrimes(_ count: Int) {
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