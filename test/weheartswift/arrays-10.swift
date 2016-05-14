var listOfNumbers = [1, 2, 3, 10, 100]

var otherNumbers = [1, 2, 3, 4, 5, 6]

for otherNumber in otherNumbers {
    for number in listOfNumbers {
        if number == otherNumber {
            print(number)
            break
        }
    }
}