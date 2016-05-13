func returnDictionary() -> [String:String] {
    return ["key":"val"]
}
print(returnDictionary().count);
print(returnDictionary()["key"]!);
func returnOptionalDictionary(shouldReturn: Bool) -> [String:String]? {
    return shouldReturn ? ["key":"val"] : nil
}
print(returnOptionalDictionary(false)?.count);
print(returnOptionalDictionary(false)?["key"]);
print((returnOptionalDictionary(true)?.count)!);
print((returnOptionalDictionary(true)?["key"])!);
