Swift to JavaScript/TypeScript transpiler
==============

This is an open source Swift to TypeScript transpiler (which can then be then transpiled further to JavaScript).
It's written in Java using antlr4 parser generator.

Visit http://ec2-52-213-137-101.eu-west-1.compute.amazonaws.com for live transpilation preview.

It has support for Swift:

- functions & closures
- control flow (if, for-in, while)
- data/collection types (primitives, tuples, arrays, dictionaries, sets)
- optionals & chaining

To get a better sense of supported features, have a look inside the test directory.
It contains Swift code snippets that demonstrate all supported features in greater detail.

The transpiler currently lacks support for:

- classes
- overloading operators
- enums
- inout params
- switch

Examples
==============

Arrays
```Swift
var arrayOfInts: [Int] = [1, 2, 3]
print(arrayOfInts.count)

let inferredArrayOfStrings = ["Swift", "is", "ace"]
print(inferredArrayOfStrings.count)
print(inferredArrayOfStrings[0].characters.count)
```
```Typescript
let arrayOfInts:Array<number> = [ 1 , 2 , 3 ]
console.log(arrayOfInts.length)

const inferredArrayOfStrings:Array<string> = [ "Swift" , "is" , "ace" ]
console.log(inferredArrayOfStrings.length)
console.log(inferredArrayOfStrings[0 ].length)
```

Dictionaries
```Swift
var dictionary: [String:Int] = ["one" : 1]
print(dictionary["one"]!)
print(dictionary["two"] ?? 404)
print(dictionary.count)

if let dictVal = dictionary["one"] {
    print(dictVal);
}

dictionary["one"] = nil
print(dictionary.count)
```
```Typescript
let dictionary:Object = {"one" :1 }
console.log(dictionary["one" ])
console.log((dictionary["two" ] != null ? dictionary["two" ] : 404 ))
console.log(_.size(dictionary))

if(dictionary["one" ] != null) {
    const dictVal:number = dictionary["one" ];
    console.log(dictVal);
}

delete dictionary["one" ]
console.log(_.size(dictionary))
```

Strings
```Swift
var str:String?
print(str?.characters.count)

str = "Message"
print((str?.characters.count)!)
```
```Typescript
let str:string;
console.log((str!= null ? str.length : null ))

str = "Message"
console.log(((str!= null ? str.length : null )))
```

Tuples
```Swift
let unnamedUntypedTuple = (4, 25)
print(unnamedUntypedTuple.0)
print(unnamedUntypedTuple.1)

let namedTypedTuple:(a:Int, count:Int) = (4, 25)
print(namedTypedTuple.a)
print(namedTypedTuple.count)
```
```Typescript
const unnamedUntypedTuple:any = {'0':4 ,'1':25 }
console.log(unnamedUntypedTuple[0 ])
console.log(unnamedUntypedTuple[1 ])

const namedTypedTuple:any = {'a':4 ,'count':25 }
console.log(namedTypedTuple.a)
console.log(namedTypedTuple.count)
```

Motivation & Development
==============

Swift is the new language behind iOS apps.
Its ease of use coupled with great performance make it a strong contender for a back-end language in the future
(a compiler has already been released for linux).

Wouldn't it be great to be able to share business logic written in Swift with JavaScript?
No need to maintain three different code bases (back-end, iOS and browser)!

Ideally, this project would have complete Swift support and would transpile both to TypeScript and Java.

Back when I wrote this transpiler in May, it was more robust than any solution I could find online.
Using antlr4 is a huge advantage over hand coding lexers & parsers -- it's more reliable and more maintainable.

I welcome any contributions. Feel free to drop me a line at marcelganczak@gmail.com

Usage
==============

You will need Java to run the transpiler.

It will grab the contents of example.swift in the root folder and print the transpiled TypeScript into console.

To find out how to then transpile TypeScript further to JavaScript, check https://www.typescriptlang.org/

Testing
==============

In order to run the tests, you need xcode and node as well as typescript and mocha npm packages installed globally.

```
cd test
mocha
```

The test will iterate through all swift files within the test directory,
run both the original Swift code and the transpiled TypeScript code and compare the console output.

License
==============

MIT