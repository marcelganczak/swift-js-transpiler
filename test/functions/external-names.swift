func sayHello(personName: String) -> String {
    let greeting = "Hello, " + personName + "!"
    return greeting
}
println(sayHello("Anna"))
func sayHello(personName: String, alreadyGreeted: Bool) -> String {
    if alreadyGreeted {
        return "Hello again, " + personName + "!"
    } else {
        return sayHello(personName)
    }
}
println(sayHello("Tim", alreadyGreeted: true))
func sayGoodbye(personName: String) {
    println("Goodbye, " + personName + "!")
}
sayGoodbye("Dave")
func sayHello(to person: String, and anotherPerson: String) -> String {
    return "Hello " + person + " and " + anotherPerson + "!"
}
println(sayHello(to: "Bill", and: "Ted"))
func addition(firstParameterName: Int, _ secondParameterName: Int) {
    return firstParameterName + secondParameterName
}
println(addition(1, 2))