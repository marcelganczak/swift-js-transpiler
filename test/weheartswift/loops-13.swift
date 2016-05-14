var N = 10

var a = 1
var b = 0

for _ in 1...N {
    print(a)
    var tmp = a + b
    b = a
    a = tmp
}