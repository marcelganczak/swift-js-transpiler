var dict = ["key":"val"]
if let dictVal = dict["key"], let anotherDictVal = dict["nonExistent"] {
    print(dictVal);
}