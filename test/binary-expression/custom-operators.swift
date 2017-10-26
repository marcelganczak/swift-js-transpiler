prefix operator +++
infix operator +-: AdditionPrecedence
struct Vector2D {
    var x = 0, y = 0
    static func + (left: Vector2D, right: Vector2D) -> Vector2D {
        return Vector2D(x: left.x + right.x, y: left.y + right.y)
    }
    static prefix func - (vector: Vector2D) -> Vector2D {
        return Vector2D(x: -vector.x, y: -vector.y)
    }
    static func += (left: inout Vector2D, right: Vector2D) {
        left = left + right
    }
    static prefix func +++ (vector: inout Vector2D) -> Vector2D {
        vector += vector
        return vector
    }
    static func +- (left: Vector2D, right: Vector2D) -> Vector2D {
        return Vector2D(x: left.x + right.x, y: left.y - right.y)
    }
}
let vector = Vector2D(x: 3, y: 1)
let anotherVector = Vector2D(x: 2, y: 4)
let combinedVector = vector + anotherVector
print(combinedVector.x)
print(combinedVector.y)
let inverseCombinedVector = -combinedVector
print(inverseCombinedVector.x)
print(inverseCombinedVector.y)
var original = Vector2D(x: 1, y: 2)
let vectorToAdd = Vector2D(x: 3, y: 4)
original += vectorToAdd
print(original.x)
print(original.y)
var toBeDoubled = Vector2D(x: 1, y: 4)
let afterDoubling = +++toBeDoubled
print(afterDoubling.x)
print(afterDoubling.y)
let firstVector = Vector2D(x: 1, y: 2)
let secondVector = Vector2D(x: 3, y: 4)
let plusMinusVector = firstVector +- secondVector
print(plusMinusVector.x)
print(plusMinusVector.y)