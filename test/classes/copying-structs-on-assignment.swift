struct Struct {
    var prop = 0
}
class Class {
    var prop = 0
}
var s = Struct()
var c = Class()
var s2 = s
var c2 = c
s2.prop = 1
c2.prop = 1
print(s.prop)
print(c.prop)
print(s2.prop)
print(c2.prop)