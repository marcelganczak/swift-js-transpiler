func verifyParentheses(_ expression: String) -> Bool {
    var open = 0
    var closed = 0
    for char in expression.characters {
        var character = "\(char)"
        if character == "(" {
            open += 1
        } else {
            closed += 1
            if closed > open {
                return false
            }
        }
    }
    return open == closed
}

print(verifyParentheses("parent()"))
print(verifyParentheses("parent("))
print(verifyParentheses("parent)"))
print(verifyParentheses("parent(()"))
print(verifyParentheses(""))