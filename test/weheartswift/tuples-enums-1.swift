enum Direction {
    case Up
    case Down
    case Left
    case Right
}

var location = (x: 0, y: 0)

var steps: [Direction] = [.Up, .Up, .Left, .Down, .Left]

for step in steps {
    switch step {
    case .Up:
        location.y += 1
    case .Down:
        location.y -= 1
    case .Right:
        location.x += 1
    case .Left:
        location.x -= 1
    default:
        break
    }
}

print(location)