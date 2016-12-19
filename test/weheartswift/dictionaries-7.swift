var numbers = [1, 2, 3, 2, 3, 5, 2, 1, 3, 4, 2, 2, 2]

var frequency: [Int:Int] = [:]
var uniqueNumbers: [Int] = []

for number in numbers {
    if let oldFr = frequency[number] {
        frequency[number] = oldFr + 1
    } else {
        uniqueNumbers.append(number)
        frequency[number] = 1
    }
}

uniqueNumbers.sort(by: <)

for number in uniqueNumbers {
    print("\(number) \(frequency[number]!)")
}