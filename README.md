Swift to JavaScript/TypeScript transpiler
==============

This is an open source Swift to TypeScript transpiler (which can then be then transpiled further to JavaScript).
It's written in Java using antlr4 parser generator.

It has support for Swift:

- functions & closures
- control flow (if, for-in, while)
- data/collection types (primitives, tuples, arrays, dictionaries, sets)
- optionals & chaining

A look inside the test directory will reveal Swift code snippets that demonstrate all supported features in greater detail.
Whenever I get the chance I will set up an online playground with live transpilation results.

The transpiler currently lacks support for:

- classes
- overloading operators
- enums
- inout params
- switch

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