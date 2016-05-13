func sayHello(personName: String) -> String {
    let greeting = "Hello, " + personName + "!"
    return greeting
}
print(sayHello("Anna"))
func sayHello(personName: String, alreadyGreeted: Bool) -> String {
    if alreadyGreeted {
        return "Hello again, " + personName + "!"
    } else {
        return sayHello(personName)
    }
}
print(sayHello("Tim", alreadyGreeted: true))
func sayGoodbye(personName: String) {
    print("Goodbye, " + personName + "!")
}
sayGoodbye("Dave")
func sayHello(to person: String, and anotherPerson: String) -> String {
    return "Hello " + person + " and " + anotherPerson + "!"
}
print(sayHello(to: "Bill", and: "Ted"))
func addition(firstParameterName: Int, _ secondParameterName: Int) -> Int {
    return firstParameterName + secondParameterName
}
print(addition(1, 2))