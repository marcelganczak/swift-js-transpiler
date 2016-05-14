var number = 12345
var digits: [Int] = []

while number > 0 {
    var digit = number % 10

    digits = [digit] + digits

    number /= 10 // 12345 -&gt; 1234 -&gt; 123 -&gt; 12 -&gt; 1
}

for digit in digits {
    print(digit)
}