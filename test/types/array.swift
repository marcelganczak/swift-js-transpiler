var arrayOfInts: [Int] = [1, 2, 3]
print(arrayOfInts[0])
print(arrayOfInts.count)
arrayOfInts.append(5)
arrayOfInts.insert(4, at: 3)
arrayOfInts.append(contentsOf: [9, 10, 11])
arrayOfInts.insert(contentsOf: [6, 7, 8], at: 5)
arrayOfInts += [12, 13, 14]
print(arrayOfInts.count)
print(arrayOfInts[4])
print(arrayOfInts[5])
print(arrayOfInts[7])
arrayOfInts.remove(at: 2)
print(arrayOfInts.count)
print(arrayOfInts[2])

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

var inferredFilledArray = [Int](repeating: 0, count: 3)
print(inferredFilledArray[0])
print(inferredFilledArray.count)