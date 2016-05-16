func printFirstPrimes(count: Int) {
    var i = 2
    var printed = 0
    while printed < count {
        if isPrime(i) {
            print(i)
            ++printed
        }
        ++i
    }
}

printFirstPrimes(10)