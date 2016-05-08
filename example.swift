func addTwoInts(a: Int, b: Int) -> Int {
    return a + b
}
var mathFunction: (Int, c: Int) -> Int = addTwoInts
print(mathFunction(1, c:1))