var problem = "find the longest word in the problem description"

// this will help the algorithm see the last word
problem += " "

var word = ""
var length = 0

var max = 0
var longestWord = ""

for character in problem.characters {
    if character == " " {
        if length > max {
            max = length
            longestWord = word
        }
        word = ""
        length = 0
    } else {
        word += "\(character)"
        length += 1
    }
}

print(longestWord)