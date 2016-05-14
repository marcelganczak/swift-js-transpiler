let strings = ["We", "Heart", "Swift"]

let string = strings.reduce("") {
    if $0 == "" {
        return $1
    } else {
        return $0 + " " + $1
    }
}

print(string)