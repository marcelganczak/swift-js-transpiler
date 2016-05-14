var number = 10
print("\(number) = ", terminator: "")

var isFirst = true

for i in 2...number {
    if number % i == 0 {
        while (number % i == 0) {
            number /= i

            if isFirst {
                isFirst = false
            } else {
                print(" * ", terminator: "")
            }

            print(i, terminator: "")
        }
    }
}