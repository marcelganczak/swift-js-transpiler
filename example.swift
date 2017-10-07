struct Cuboid {
    var width = 0, height = 0, depth = 0
    var volume: Double {
        return width * height * depth
    }
}
let fourByFiveByTwo = Cuboid()
fourByFiveByTwo.width = 4
fourByFiveByTwo.height = 5
fourByFiveByTwo.depth = 2
print(fourByFiveByTwo.volume)