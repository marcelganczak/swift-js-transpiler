for index in 1...5 {
    print(index)
}
for index in 1..<5 {
    print(index)
}
let base = 3
let power = 10
var answer = 1
for _ in 1...power {
    answer *= base
}
print(answer)
let names = ["Anna", "Alex", "Brian", "Jack"]
for name in names {
    print("Hello, " + name + "!")
}
let numberOfLegs = ["spider": 8, "ant": 6, "cat": 4]
for (animalName, legCount) in numberOfLegs {
    print(animalName)
    print(legCount)
}