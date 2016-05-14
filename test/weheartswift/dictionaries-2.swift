var code = [
    "a" : "b",
    "b" : "c",
    "c" : "d",
    "d" : "e",
    "e" : "f",
    "f" : "g",
    "g" : "h",
    "h" : "i",
    "i" : "j",
    "j" : "k",
    "k" : "l",
    "l" : "m",
    "m" : "n",
    "n" : "o",
    "o" : "p",
    "p" : "q",
    "q" : "r",
    "r" : "s",
    "s" : "t",
    "t" : "u",
    "u" : "v",
    "v" : "w",
    "w" : "x",
    "x" : "y",
    "y" : "z",
    "z" : "a"
]

var encodedMessage = "uijt nfttbhf jt ibse up sfbe"

var decoder: [String:String] = [:]

// reverse the code
for (key, value) in code {
    decoder[value] = key
}

var decodedMessage = ""

for char in encodedMessage.characters {
    var character = "\(char)"

    if let encodedChar = decoder[character] {
        // letter
        decodedMessage += encodedChar
    } else {
        // space
        decodedMessage += character
    }
}

print(decodedMessage)