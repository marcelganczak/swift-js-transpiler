func returnTuple() -> (Int,String) {
    return (0,"val")
}
print(returnTuple().0);
print(returnTuple().1);
func returnOptionalTuple(shouldReturn: Bool) -> (Int,String)? {
    return shouldReturn ? (0,"val") : nil
}
print(returnOptionalTuple(false)?.0);
print(returnOptionalTuple(false)?.1);
print((returnOptionalTuple(true)?.0)!);
print((returnOptionalTuple(true)?.1)!);
