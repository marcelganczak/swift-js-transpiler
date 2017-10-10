struct Uninitialized {
    var prop: Int
}
struct Initialized {
    var prop: Int = 1
}
var uninitialized = Uninitialized(prop: 2)
var initialized = Initialized(prop: 2)
var initialized2 = Initialized()
print(uninitialized.prop)
print(initialized.prop)
print(initialized2.prop)