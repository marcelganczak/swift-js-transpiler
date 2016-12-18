Swift to JavaScript/TypeScript transpiler
==============

This is an open source Swift to TypeScript transpiler (which can then be then transpiled further to JavaScript).
It's written in Java using antlr4 parser generator.

It has support for Swift:

- functions & closures
- control flow (if, for-in, while)
- data/collection types (primitives, tuples, arrays, dictionaries, sets)
- optionals & chaining

Have a look inside the test folder to check out Swift code snippets that demonstrate all supported features.
I will try and set up an online playground whenever I get the chance.

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

I'd welcome any contributions. Feel free to drop me a line at marcelganczak@gmail.com

Usage
==============

You will need Java to run the transpiler.

It will grab the contents of example.swift in the root folder and print the transpiled TypeScript into console.

To find out how to then transpile TypeScript further to JavaScript, check https://www.typescriptlang.org/

Testing
==============

In order to run the tests, you need xcode, node and typescript npm package (https://www.typescriptlang.org/).

To run the tests, enter test folder and run test.js with node (node test.js).

The test will iterate through all swift files within the test directory,
run both the original Swift code and the transpiled TypeScript code and compare the console logs.

License
==============

MIT