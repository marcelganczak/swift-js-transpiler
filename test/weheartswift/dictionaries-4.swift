var people: [[String:String]] = [
    [
        "firstName": "Calvin",
        "lastName": "Newton"
    ],
    [
        "firstName": "Garry",
        "lastName": "Mckenzie"
    ],
    [
        "firstName": "Leah",
        "lastName": "Rivera"
    ],
    [
        "firstName": "Sonja",
        "lastName": "Moreno"
    ],
    [
        "firstName": "Noel",
        "lastName": "Bowen"
    ]
]

var fullNames: [String] = []

for person in people {
    var fullName = " "
    for (key, value) in person {
        if key == "lastName" {
            fullName += value
        } else {
            fullName = value + fullName
        }
    }
    fullNames += [fullName]
}

for fullName in fullNames {
    print(fullName)
}