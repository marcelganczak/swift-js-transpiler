var N = 10

print(1)

for i in 2...N {
    var isFree = true

    var a = i

    for j in 2...a {
        if a % j == 0 {
            var put = 0
            while (a % j == 0) {
                a /= j
                put += 1
            }
            if put > 1 {
                isFree = false
            }
        }
    }

    if isFree {
        print(i)
    }
}