var dictionary = ["key":"val"]
print(dictionary.count)
dictionary["key"] = nil
print(dictionary.count)

dictionary = ["key":"val"]
print(dictionary.count)
var str:String?
dictionary["key"] = str
print(dictionary.count)

str = "str";
dictionary = ["key":"val"]
print(dictionary.count)
dictionary["key"] = true ? nil : "ssss"
print(dictionary.count)