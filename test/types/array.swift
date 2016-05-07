var arrayOfInts: [Int] = [1, 2, 3]
print(arrayOfInts[0])
print(arrayOfInts.count)
var arrayOfStrings: [String] = ["We", "love", "Swift"]
print(arrayOfStrings[0])
print(arrayOfStrings.count)
var emptyArray: [Int] = []
print(emptyArray.count)
var inferredArrayOfInts = [1, 2, 3]
print(inferredArrayOfInts[0])
print(inferredArrayOfInts.count)
var inferredEmptyArray = [Int]()
print(inferredEmptyArray.count)
var inferredFilledArray = [Int](count: 3, repeatedValue: 0)
print(inferredFilledArray[0])
print(inferredFilledArray.count)