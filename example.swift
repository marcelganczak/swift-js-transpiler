func multiplyTwoInts(a: Int, b: Int) -> Int {
    return a * b
}
let mathFunction: (Int, c: Int) -> Int = multiplyTwoInts
mathFunction(1, c:2)