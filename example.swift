struct Square {
    var a = 1.0
    var girth: Double {
        get {
            return a * 4
        }
        set(newGirth) {
            a = newGirth / 4
        }
    }
}
var square = Square()
square.girth = 16
print(square.girth)