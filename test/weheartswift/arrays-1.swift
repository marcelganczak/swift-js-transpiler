var listOfNumbers = [1, 2, 3, 10, 100]

var maxVal = listOfNumbers[0]

for number in listOfNumbers {
    if maxVal < number {
        maxVal = number
    }
}

print(maxVal)