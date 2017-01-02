var dictionary: [String:Int] = ["one" : 1]
print(dictionary["one"]!)
print(dictionary.count)

var emptyDictionary: [Int:Int] = [:]
print(emptyDictionary.count)

var inferredIntIntDictionary = [1:2]
print(inferredIntIntDictionary[1]!)
print(inferredIntIntDictionary.count)

var inferredIntStringDictionary = [1:"one"]
print(inferredIntStringDictionary[1]!)
print(inferredIntStringDictionary.count)

var a = 1;
var inferredIntStringDictionary2 = [a:"one"]
print(inferredIntStringDictionary2[1]!)
print(inferredIntStringDictionary2.count)
