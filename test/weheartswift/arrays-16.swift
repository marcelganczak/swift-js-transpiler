var number = 12345
var digits: [Int] = []

while number > 0 {
    var digit = number % 10

    digits = [digit] + digits

    number /= 10 // 12345 -> 1234 -> 123 -> 12 -> 1
}

for digit in digits {
    print(digit)
}