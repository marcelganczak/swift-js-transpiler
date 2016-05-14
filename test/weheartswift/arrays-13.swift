var N = 30

var fibonacci = [1, 1]

for i in 2...N - 1 {
    fibonacci.append(fibonacci[i-1] + fibonacci[i-2])
}

for number in fibonacci {
    print(number)
}