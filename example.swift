var dictionary = ["key" : "val"]
print(dictionary["non-existent"]?.characters.count)
print(dictionary["non-existent"] ?? "key doesn't exist!")
dictionary?["key2"] = "val2"