let N = 30
var fib = [Int](repeating: 1, count: N)

for i in 2..<30 {
    fib[i] = fib[i-1] + fib[i-2]
}

for number in fib {
    print(number)
}