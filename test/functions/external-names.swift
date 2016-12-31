func sayHello(personName: String) -> String {
    let greeting = "Hello, " + personName + "!"
    return greeting
}
print(sayHello(personName: "Anna"))

func sayHello(_ personName: String) -> String {
    let greeting = "Hello, " + personName + "!"
    return greeting
}
print(sayHello("Anna"))

func sayHello(personName: String, alreadyGreeted: Bool) -> String {
    if alreadyGreeted {
        return "Hello again, " + personName + "!"
    } else {
        return sayHello(personName: personName)
    }
}
print(sayHello(personName: "Tim", alreadyGreeted: true))

func sayGoodbye(personName: String) {
    print("Goodbye, " + personName + "!")
}
sayGoodbye(personName: "Dave")

func sayHello(to person: String, and anotherPerson: String) -> String {
    return "Hello " + person + " and " + anotherPerson + "!"
}
print(sayHello(to: "Bill", and: "Ted"))

func addition(_ firstParameterName: Int, _ secondParameterName: Int) -> Int {
    return firstParameterName + secondParameterName
}
print(addition(1, 2))