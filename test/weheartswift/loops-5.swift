var N = 5

var left = 1
var right = N

while left < right {
    print(left)
    print(right)
    ++left
    --right
}

if left == right {
    print(left)
}