let N = 30
var fib = [Int](count: N, repeatedValue: 1)

for i in 2..<30 {
    fib[i] = fib[i-1] + fib[i-2]
}

for number in fib {
    print(number)
}