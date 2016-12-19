func returnArray() -> [String] {
    return ["val"]
}
print(returnArray().count);
print(returnArray()[0]);
func returnOptionalArray(shouldReturn: Bool) -> [String]? {
    return shouldReturn ? ["val"] : nil
}
print(returnOptionalArray(shouldReturn: false)?.count);
print(returnOptionalArray(shouldReturn: false)?[0]);
print((returnOptionalArray(shouldReturn: true)?.count)!);
print((returnOptionalArray(shouldReturn: true)?[0])!);
