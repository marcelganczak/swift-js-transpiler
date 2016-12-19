func first(_ N: Int) -> [Int] {
    var numbers:[Int] = []

    for number in 1...N {
        numbers.append(number)
    }

    return numbers
}
print(first(10)[0])
print(first(10)[2])
print(first(10)[4])
print(first(10)[6])
print(first(10)[8])