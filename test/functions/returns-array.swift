func returnArray() -> [String] {
    return ["val"]
}
print(returnArray().count);
print(returnArray()[0]);
func returnOptionalArray(shouldReturn: Bool) -> [String]? {
    return shouldReturn ? ["val"] : nil
}
print(returnOptionalArray(false)?.count);
print(returnOptionalArray(false)?[0]);
print((returnOptionalArray(true)?.count)!);
print((returnOptionalArray(true)?[0])!);
