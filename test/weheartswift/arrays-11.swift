var listOfNumbers = [1, 2, 3, 10, 100]
var divisors = [7, 5]

for number in listOfNumbers {
    for divisor in divisors {
        if number % divisor == 0 {
            print(number)
            break
        }
    }
}