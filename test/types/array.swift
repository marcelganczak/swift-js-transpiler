var arrayOfInts: [Int] = [1, 2, 3]
println(arrayOfInts[0])
println(arrayOfInts.count)
var arrayOfStrings: [String] = ["We", "love", "Swift"]
println(arrayOfStrings[0])
println(arrayOfStrings.count)
var emptyArray: [Int] = []
println(emptyArray.count)
var inferredArrayOfInts = [1, 2, 3]
println(inferredArrayOfInts[0])
println(inferredArrayOfInts.count)
var inferredEmptyArray = [Int]()
println(inferredEmptyArray.count)
var inferredFilledArray = [Int](count: 3, repeatedValue: 0)
println(inferredFilledArray[0])
println(inferredFilledArray.count)