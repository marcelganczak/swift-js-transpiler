var dictionary: [String:String]?
dictionary?["key"] = "val"
print(dictionary?.count)
dictionary = [:]
dictionary?["key"] = "val"
print((dictionary?.count)!)