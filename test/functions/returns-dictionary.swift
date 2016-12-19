func returnDictionary() -> [String:String] {
    return ["key":"val"]
}
print(returnDictionary().count);
print(returnDictionary()["key"]!);
func returnOptionalDictionary(shouldReturn: Bool) -> [String:String]? {
    return shouldReturn ? ["key":"val"] : nil
}
print(returnOptionalDictionary(shouldReturn: false)?.count);
print(returnOptionalDictionary(shouldReturn: false)?["key"]);
print((returnOptionalDictionary(shouldReturn: true)?.count)!);
print((returnOptionalDictionary(shouldReturn: true)?["key"])!);
