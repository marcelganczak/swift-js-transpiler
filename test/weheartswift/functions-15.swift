func levelCost(heights: [Int], maxJump: Int) -> Int {
    var totalEnergy = 0
    var lastHeight = 0

    for height in heights {
        if lastHeight == 0 {
            lastHeight = height
        } else {
            var jumpHeight = lastHeight - height
            if jumpHeight < 0 {
                jumpHeight = -jumpHeight
            }

            if jumpHeight > maxJump {
                return -1
            }

            if jumpHeight == 0 {
                totalEnergy += 1
            } else {
                totalEnergy += 2 * jumpHeight
            }

            lastHeight = height
        }
    }

    return totalEnergy
}

print(levelCost(heights: [2, 3, 4], maxJump: 2))
print(levelCost(heights: [12, 13, 14], maxJump: 2))
print(levelCost(heights: [5, 100, 12], maxJump: 10))