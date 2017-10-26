var str:String?;
print(str?.characters.count)
str = "Message"
print((str?.characters.count)!)

var dict = ["key": "value"]
print(dict.count)
print((dict["key"]?.characters.count)!)
print(dict["non-existant"]?.characters.count)

var myThirdDictionary: [String: String]?
print(myThirdDictionary?["key"])
print(myThirdDictionary?["key"]?.characters.count)