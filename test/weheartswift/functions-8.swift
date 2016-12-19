func reverse(_ numbers: [Int]) -> [Int] {
    var reversed: [Int] = []

    for number in numbers {
        reversed.insert(number, at: 0)
    }

    return reversed
}

print(reverse([1, 2, 3])[0])
print(reverse([1, 2, 3])[1])
print(reverse([1, 2, 3])[2])