let aString = "anutforajaroftuna"

var reverse = ""

for character in aString.characters {
    var char = "\(character)"
    reverse = char + reverse
}

print(aString == reverse)