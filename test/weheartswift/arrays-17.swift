var listOfNumbers = [1, 2, 3, 1, 2, 10, 100]

var unique: [Int] = []

for number in listOfNumbers {
    var numberIsNew = true

    for otherNumber in unique {
        if number == otherNumber {
            numberIsNew = false
            break
        }
    }

    if numberIsNew {
        unique.append(number)
    }
}

for number in unique {
    print(number)
}