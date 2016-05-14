let N = 4

for i in 1...N {
    for j in 0..<(N-i) {
        print(" ", terminator: "")
    }

    for j in 1...2*i-1 {
        print("*", terminator: "")
    }
    print("")
}

if (N > 1) {
    for j in 2...N {
        var i = N - j + 1
        for k in 0..&lt;(N-i) {
            print(" ", terminator: "")
        }

        for k in 1...2*i-1 {
            print("*", terminator: "")
        }
        print("")
    }
}