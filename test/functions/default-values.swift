func justPrint(printed: String = "default") {
    print(printed)
}
justPrint(printed: "custom")
justPrint()
func justAdd(a: Int = 1, b: Int = 2, c: Int = 3) {
    print(a + b + c);
}
justAdd()
justAdd(a: 2)
justAdd(a: 2, b: 3)
justAdd(a: 2, b: 3, c: 4)