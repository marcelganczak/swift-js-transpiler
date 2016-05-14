var problem = "split this string into words and print them on separate lines"

var word = ""

for character in problem.characters {
    if character == " " {
        print(word)
        word = ""
    } else {
        word += "\(character)"
    }
}

// don't forget the last word
print(word)

// split
// this
// string
// into
// words
// and
// print
// them
// on
// separate
// lines