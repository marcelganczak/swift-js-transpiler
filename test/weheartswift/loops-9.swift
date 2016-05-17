var N = 3

for i in 1...N {
    for j in 0..<(N-i) {
        print(" ")
    }

    for j in 1...2*i-1 {
        print("*")
    }
    print("")
}