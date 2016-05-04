var dictionary: [String:Int] = ["one" : 1]
println(dictionary["one"]!)
println(dictionary.count)
var emptyDictionary: [Int:Int] = [:]
println(emptyDictionary.count)
var inferredIntIntDictionary = [1:2] 
println(inferredIntIntDictionary[1]!)
println(inferredIntIntDictionary.count)
var inferredIntStringDictionary = [1:"one"] 
println(inferredIntStringDictionary[1]!)
println(inferredIntStringDictionary.count)
