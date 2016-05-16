func reverse(numbers: [Int]) -> [Int] {
    var reversed: [Int] = []

    for number in numbers {
        reversed.insert(number, atIndex: 0)
    }

    return reversed
}

print(reversed([1, 2, 3])[0])
print(reversed([1, 2, 3])[1])
print(reversed([1, 2, 3])[2])