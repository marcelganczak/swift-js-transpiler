var number = 1234

while number > 0 {
    print(number % 10, terminator: "")
    number /= 10
}