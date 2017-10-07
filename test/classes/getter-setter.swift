struct Point {
    var x = 0, y = 0
}
struct Size {
    var width = 10, height = 10
}
struct Rect {
    var origin = Point()
    var size = Size()
    var center: Point {
        get {
            let centerX = origin.x + (size.width / 2)
            let centerY = origin.y + (size.height / 2)
            var center = Point()
            center.x = centerX
            center.y = centerY
            return center
        }
        set(newCenter) {
            origin.x = newCenter.x - (size.width / 2)
            origin.y = newCenter.y - (size.height / 2)
        }
    }
}
var square = Rect()
var newCenter = Point()
newCenter.x = 15
newCenter.y = 15
square.center = newCenter
print("square.origin is now at (\(square.origin.x), \(square.origin.y))")