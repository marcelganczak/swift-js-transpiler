func parseDigit(_ digit: String) -> Int {
    let digits = "0123456789"

    var result = 0

    for character in digits.characters {
        var d = "\(character)"

        if d == digit {
            return result
        }

        result += 1
    }

    return -1
}

print(parseDigit("1"))
print(parseDigit("23"))
print(parseDigit("456"))
print(parseDigit("7890"))