func push(number: Int, inout _ queue: [Int]) {
    queue.append(number)
}

func pop(inout queue: [Int]) -> Int? {
    var result = queue.first

    if queue.count > 0 {
        queue.removeAtIndex(0)
    }

    return result
}

//TODO