let N = 3

for i in 1...N {
    for _ in 1...2 {
        for _ in 0..<(N-i) {
            print("  ")
        }

        for _ in 1...2*i-1 {
            print("**")
        }
        print("")
    }
}