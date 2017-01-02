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

let numberOfLegs = ["ant": 6, "cat": 4, "spider": 8]
for (animalName, legCount) in numberOfLegs {
    print(animalName)
    print(legCount)
}

for number in 0...10 {
    if number >= 6 {
        break
    }
    if number % 2 > 0 {
        continue
    }
    print(number)
}