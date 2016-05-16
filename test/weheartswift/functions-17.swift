func push(number: Int, inout _ stack: [Int]) {
    stack.append(number)
}

func top(stack: [Int]) -> Int? {
    if stack.count == 0 {
        return nil
    }
    return stack[stack.count - 1]
}

func pop(inout stack: [Int]) -> Int? {
    var result = top(stack)

    if stack.count > 0 {
        stack.removeAtIndex(stack.count - 1)
    }

    return result
}

//TODO