func multiplyTwoInts(a: Int, b: Int) -> Int {
    return a * b
}
let mathFunction = multiplyTwoInts
let mathFunction2: (Int, c: Int) -> Int = multiplyTwoInts
print(mathFunction(2, 3))
print(mathFunction2(1, c:2))