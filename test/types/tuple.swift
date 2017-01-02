let unnamedUntypedTuple = (4, 25)
print(unnamedUntypedTuple.0)
print(unnamedUntypedTuple.1)

let unnamedTypedTuple:(Int, Int) = (4, 25)
print(unnamedTypedTuple.0)
print(unnamedTypedTuple.1)

let unnamedUntypedVariadicTuple = (4, "string")
print(unnamedUntypedVariadicTuple.0)
print(unnamedUntypedVariadicTuple.1)

let namedUntypedTuple = (a:4, count:25)
print(namedUntypedTuple.a)
print(namedUntypedTuple.count)

let namedTypedTuple:(a:Int, count:Int) = (4, 25)
print(namedTypedTuple.a)
print(namedTypedTuple.count)

let nestedTuple = (4, (12, 25))
print(nestedTuple.1.0)
print(nestedTuple.1.1)