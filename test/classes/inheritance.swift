class Parent {
    func function() -> Int {
        return 1
    }
    var prop1: Int {
        return 1
    }
    var prop2_internal: Int = 1
    var prop2: Int {
        get {
            return prop2_internal * 2
        }
        set {
            prop2_internal = newValue / 2
        }
    }
    var prop3: Int = 1
}
class Child: Parent {
    override func function() -> Int {
        return super.function() + 1
    }
    override var prop1: Int {
        return super.prop1 + 1
    }
    override var prop2: Int {
        get {
            return super.prop2 * 2
        }
        set {
            super.prop2 = newValue / 4
        }
    }
    override var prop3: Int {
        willSet {
            print("lol")
        }
    }
}
var parent = Parent()
var child = Child()
print(parent.function())
print(child.function())
print(parent.prop1)
print(child.prop1)
parent.prop2 = 10
print(parent.prop2)
child.prop2 = 10
print(child.prop2)
print(parent.prop3)
print(child.prop3)
parent.prop3 = 3
child.prop3 = 3
print(parent.prop3)
print(child.prop3)