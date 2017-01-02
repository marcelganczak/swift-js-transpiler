var a = 4
if a > 3 {
    print("A greater than 3")
} else {
    print("A smaller or equal 3")
}

var dict = ["key":"val"]
if let dictVal = dict["key"] {
    print(dictVal);
}

for number in 0...10 {
    guard number < 3 else {
        break
    }
    print(number)
}