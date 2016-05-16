var numbers = [1, 2, 3, 4, 5, 6]

let sum = numbers.filter {
        $0 % 2 == 1 //select all the odd numbers
    }.map {
        $0 * $0 // square them
    }.reduce(0) {
        $0 + $1 // get their sum
    }

print(sum)