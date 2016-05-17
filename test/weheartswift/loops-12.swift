let N = 8

// prints the top border
print("+")
for _ in 1...N {
    print("-")
}
print("+")

for i in 1...N {
    // prints the left border
    print("|")
    for j in 1...N {
        if i % 2 == j % 2 {
            print("#")
        } else {
            print(" ")
        }
    }
    // prints the right border a a new line
    print("|")
}

// prints the bottom border
print("+")
for _ in 1...N {
    print("-")
}
print("+")