func lastDigit(_ number: Int) -> Int {
    return number % 10
}
print(lastDigit(12345))
print(lastDigit(1234567))
print(lastDigit(12345678))
print(lastDigit(123456789))