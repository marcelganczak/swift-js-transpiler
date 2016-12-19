func sum(_ numbers: [Int]) -> Int {
    var sum = 0

    for number in numbers {
        sum += number
    }

    return sum
}

print(sum([1, 2, 3]))
print(sum([1, 2, 3, 4]))
print(sum([1, 2, 3, 4, 5]))
print(sum([1, 2, 3, 4, 5, 6]))