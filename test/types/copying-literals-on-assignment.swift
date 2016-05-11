var a = ["key":"aVal"]
var b = a
var c: [String:String]
c = a
b["key"] = "bVal"
c["key"] = "cVal"
print(a["key"]!)
print(b["key"]!)
print(c["key"]!)