var people: [[String:Any]] = [
    [
        "firstName": "Calvin",
        "lastName": "Newton",
        "score": 13
    ],
    [
        "firstName": "Garry",
        "lastName": "Mckenzie",
        "score": 23
    ],
    [
        "firstName": "Leah",
        "lastName": "Rivera",
        "score": 10
    ],
    [
        "firstName": "Sonja",
        "lastName": "Moreno",
        "score": 3
    ],
    [
        "firstName": "Noel",
        "lastName": "Bowen",
        "score": 16
    ]
]

var topPerson = people[0]
var bestScore = topPerson["score"] as? Int

for person in people {
    if let score = person["score"] as? Int {
        if bestScore! < score  {
            bestScore = score
            topPerson = person
        }
    }
}

if let first = topPerson["firstName"] as? String,
   let second = topPerson["lastName"] as? String  {
    print("\(first) \(second)")
}