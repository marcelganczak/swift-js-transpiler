func incr(_ a: inout Int) {
    a = a + 1
}
var b = 0
incr(&b)
print(b)