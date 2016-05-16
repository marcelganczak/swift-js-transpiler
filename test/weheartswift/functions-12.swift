func parseNumber(number: String) -> Int {
    if isNumber(number) != true {
        return -1
    }

    var result = 0
    for character in number.characters {
        var digit = "\(character)"

        result = result * 10 + parseDigit(digit)
    }

    return result
}

print(parseNumber("1"))
print(parseNumber("23"))
print(parseNumber("456"))
print(parseNumber("7890"))