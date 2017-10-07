struct Rect {
    var a = 0, b = 0
    var girth: Int {
        return a + a + b + b
    }
}
var rect = Rect()
rect.a = 2
rect.b = 3
print(rect.girth)