class Parent {
    var var1: Int
    init(var1: Int) {
        self.var1 = var1
    }
    convenience init() {
        self.init(var1: 1)
    }
}
class Child: Parent {
    var var2: Int
    init(var1: Int, var2: Int) {
        self.var2 = var2
        super.init(var1: var1)
    }
    convenience init() {
        self.init(var1: 10, var2: 20)
    }
}
var parentAuto = Parent()
var parent5 = Parent(var1: 5)
var childAuto = Child()
var child67 = Child(var1: 6, var2: 7)
print(parentAuto.var1)
print(parent5.var1)
print(childAuto.var1)
print(childAuto.var2)
print(child67.var1)
print(child67.var2)