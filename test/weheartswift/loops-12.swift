let N = 8

// prints the top border
print("+", terminator: "")
for _ in 1...N {
    print("-", terminator: "")
}
print("+")

for i in 1...N {
    // prints the left border
    print("|", terminator: "")
    for j in 1...N {
        if i % 2 == j % 2 {
            print("#", terminator: "")
        } else {
            print(" ", terminator: "")
        }
    }
    // prints the right border a a new line
    print("|")
}

// prints the bottom border
print("+", terminator: "")
for _ in 1...N {
    print("-", terminator: "")
}
print("+")