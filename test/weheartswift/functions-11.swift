func isNumber(string: String) -> Bool {
    if countElements(string) == 0 {
        return false
    }

    for character in string.character {
        if parseDigit("\(character)") == -1 {
            return false
        }
    }
    return true
}

print(isNumber("1"))
print(isNumber("12.34"))
print(isNumber("1a"))
print(isNumber("a1"))