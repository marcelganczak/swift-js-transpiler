struct Point {
    var x = 0.0, y = 0.0
    mutating func moveBy(x deltaX: Double, y deltaY: Double) {
        self = Point(x: x + deltaX, y: y + deltaY)
    }
}
var point = Point()
point.moveBy(x: 1.5, y: 1.5)
print(point.x)
print(point.y)