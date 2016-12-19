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

func compareScores(first: [String:Any], second: [String:Any]) -> Bool {
    if let a = first["score"] as? Int {
        if let b = second["score"] as? Int {
            return a > b
        }
    }
    return false
}

people.sort(by: compareScores)

for (index, person) in people.enumerated() {
    if let firstName = person["firstName"] as? String {
        if let lastName = person["lastName"] as? String  {
            if let score = person["score"] as? Int {
                print("\(index + 1). \(firstName) \(lastName) - \(score)")
            }
        }
    }
}