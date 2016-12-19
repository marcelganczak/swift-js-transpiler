var arrayOfInts: [Int] = [1, 2, 3]
print(arrayOfInts.count)

let inferredArrayOfStrings = ["Swift", "is", "ace"]
print(inferredArrayOfStrings.count)
print(inferredArrayOfStrings[0].characters.count)

var dictionary: [String:Int] = ["one" : 1]
print(dictionary["one"]!)
print(dictionary["two"] ?? 404)
print(dictionary.count)
if let dictVal = dictionary["one"] {
    print(dictVal);
}
dictionary["one"] = nil
print(dictionary.count)

var str:String?;
print(str?.characters.count)
str = "Message"
print((str?.characters.count)!)

let unnamedUntypedTuple = (4, 25)
print(unnamedUntypedTuple.0)
print(unnamedUntypedTuple.1)

let namedTypedTuple:(a:Int, count:Int) = (4, 25)
print(namedTypedTuple.a)
print(namedTypedTuple.count)