var dictionary = ["key":"val"]
dictionary["key"] = nil
print(dictionary["key"])
print(dictionary.count)
dictionary = ["key":"val"]
var str:String?
dictionary["key"] = str
print(dictionary["key"])
print(dictionary.count)
str = "str";
dictionary["key"] = true ? nil : "ssss"
print(dictionary["key"])
print(dictionary.count)