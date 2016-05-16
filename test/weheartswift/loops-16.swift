var a = 24
var b = 18

var maxDiv = a

if b < maxDiv {
    maxDiv = b
}

var gcd = 1

for i in 1...maxDiv {
    if (a % i == 0) && (b % i == 0){
        gcd = i
    }
}

print(gcd) // 6