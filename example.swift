var arrayOfInts: [Int] = [1, 2, 3]
print(arrayOfInts.count)

let inferredArrayOfStrings = ["Swift", "is", "ace"]
print(inferredArrayOfStrings.count)
print(inferredArrayOfStrings[0].characters.count)

var dictionary: [String:Int] = ["one" : 1]
print(dictionary["one"]!)
print(dictionary["two"] ?? "404")
print(dictionary.count)

var str:String?;
print(str?.characters.count)
str = "Message"
print((str?.characters.count)!)