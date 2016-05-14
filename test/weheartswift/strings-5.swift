func *(string: String, scalar: Int) -> String {
    let array = Array(count: scalar, repeatedValue: string)
    return array.joinWithSeparator("")
}

var newLine = "\n"

var N = 5
var M = 10

var line = "*" * M
line += newLine

var rectangle: String = line * N

print(rectangle)
// **********
// **********
// **********
// **********
// **********