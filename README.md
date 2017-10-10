Swift to JavaScript/TypeScript and Java transpiler
==============

This is an open source Swift3 to JavaScript/TypeScript and Java transpiler.
It's written in Java using antlr4 parser generator.

Visit http://typeswift.com for live transpilation preview.

It has support for Swift:

- data types (primitives, tuples, arrays, dictionaries, sets)
- control flow (if, for-in, while)
- optionals & chaining
- functions & closures (no Java support yet)
- classes (no Java support)

To get a better sense of supported features, have a look inside the test directory,
which contains Swift code snippets that demonstrate supported features in greater detail.

The transpiler currently lacks support for:

- overloading operators
- enums
- switch
- binary operators

Also, check out my reverse project (TypeScript to Swift transpiler): https://github.com/marcelganczak/ts-swift-transpiler

Examples
==============

#### Data types
Arrays
```Swift
let array = ["Swift", "is", "ace"]
print(array.count)
print(array[0].characters.count)
```
```Typescript
const array:Array<string> = [ "Swift" , "is" , "ace" ] ;
console.log(array.length);
console.log(array[0 ].length);
```
```Java
List<String> array = new ArrayList<String>(Arrays.asList("Swift", "is", "ace"));
System.out.println(array.size());
System.out.println(array.get(0 ).length());
```

Dictionaries
```Swift
var dictionary: [String:Int] = ["key" : "val"]
print(dictionary.count)
dictionary["key"] = nil
```
```Typescript
let dictionary:Object = {"key" :"val" };
console.log(_.size(dictionary));
delete dictionary["key" ];
```
```Java
Map<String, Integer> dictionary = new InitializableHashMap<String, Integer>(new Pair<String, Integer>("key" , "val" ));
System.out.println(dictionary.size());
dictionary.remove("key" );
```

Tuples
```Swift
let tuple: (a:String, count:Int) = ("str", 3)
print(tuple.a)
print(tuple.count)
```
```Typescript
const tuple:Object = {'a':"str" ,'count':3 };
console.log(tuple.a);
console.log(tuple.count);
```
```Java
Map<String, ?> tuple = new InitializableHashMap<String, Object>(new Pair<String, String>("a", "str" ),new Pair<String, Integer>("count", 3 ));
System.out.println(((String)tuple.get("a")));
System.out.println(((Integer)tuple.get("count")));
```

#### Control flow
For in range
```Swift
for number in 0...10 {
    guard number < 3 else {
        break
    }
    print(number)
}
```
```Typescript
for(let number = 0 ; number <= 10 ; number++) {
    if(!(number < 3 )) {
        break;
    }
    console.log(number);
}
```
```Java
for(int number = 0 ; number <= 10 ; number++) {
    if(!(number < 3 )) {
        break ;
    }
    System.out.println(number);
}
```

For in collection
```Swift
let numberOfLegs = ["ant": 6, "cat": 4, "spider": 8]
for (animalName, legCount) in numberOfLegs {
    print(animalName)
    print(legCount)
}
```
```Typescript
const numberOfLegs:Object = {"ant" :6 , "cat" :4 , "spider" :8 };
for(let animalName in numberOfLegs) {
    let legCount = (numberOfLegs)[animalName];
    console.log(animalName);
    console.log(legCount);
}
```
```Java
Map<String, Integer> numberOfLegs = new InitializableHashMap<String, Integer>(new Pair<String, Integer>("ant" , 6 ), new Pair<String, Integer>("cat" , 4 ), new Pair<String, Integer>("spider" , 8 ));
for(Map.Entry<String, Integer> $ : (numberOfLegs).entrySet()) {
    String animalName = $.getKey();
    Integer legCount = $.getValue();
    System.out.println(animalName);
    System.out.println(legCount);
}
```

If let
```Swift
let numberOfLegs = ["ant": 6, "cat": 4, "spider": 8]
if let catLegs = numberOfLegs["cat"] {
    print(catLegs);
}
```
```Typescript
const numberOfLegs:Object = {"ant" :6 , "cat" :4 , "spider" :8 };
if(numberOfLegs["cat" ] != null) {
    const catLegs:number = numberOfLegs["cat" ];
    console.log(catLegs);
}
```
```Java
Map<String, Integer> numberOfLegs = new InitializableHashMap<String, Integer>(new Pair<String, Integer>("ant" , 6 ), new Pair<String, Integer>("cat" , 4 ), new Pair<String, Integer>("spider" , 8 ));
if(numberOfLegs.get("cat" ) != null) {
    Integer catLegs = numberOfLegs.get("cat" );
    System.out.println(catLegs);
}
```

#### Optionals & chaining
```Swift
var dictionary = ["key" : "val"]
print(dictionary["non-existent"]?.characters.count)
print(dictionary["non-existent"] ?? "key doesn't exist!")
dictionary?["key2"] = "val2"
```
```Typescript
let dictionary:Object = {"key" :"val" };
console.log((dictionary["non-existent" ]!= null ? dictionary["non-existent" ].length : null ));
console.log((dictionary["non-existent" ] != null ? dictionary["non-existent" ] : "key doesn't exist!" ));
if(dictionary != null) { dictionary["key2" ] = "val2" ; };
```
```Java
Map<String, String> dictionary = new InitializableHashMap<String, String>(new Pair<String, String>("key" , "val" ));
System.out.println((dictionary.get("non-existent" ) != null ? dictionary.get("non-existent" ).length() : null ));
System.out.println((dictionary.get("non-existent" ) != null ? dictionary.get("non-existent" ) : "key doesn't exist!" ));
if(dictionary != null) { dictionary.put("key2" , "val2" ); };
```

#### Functions
Overloading
```Swift
func justPrint(_ printed: String) {
    print("String: \(printed)")
}
func justPrint(_ printed: Int) {
    print("Int: \(printed)")
}
func justPrint(_ printed: Double) {
    print("Double: \(printed)")
}
justPrint("message")
justPrint(1)
justPrint(2.1)
```
```Typescript
function justPrint$_String(printed : string):void{
    console.log("String: "  + (printed) + "" );
}
function justPrint$_Int(printed : number):void{
    console.log("Int: "  + (printed) + "" );
}
function justPrint$_Double(printed : number):void{
    console.log("Double: "  + (printed) + "" );
}
justPrint$_String("message" );
justPrint$_Int(1 );
justPrint$_Double(2.1 );
```
```Java
No support in Java yet.
```

Non-primitive return types
```Swift
func returnOptionalTuple(shouldReturn: Bool) -> (Int,String)? {
    return shouldReturn ? (0, "val") : nil
}
print(returnOptionalTuple(shouldReturn: false)?.0)
print((returnOptionalTuple(shouldReturn: true)?.0)!)
```
```Typescript
function returnTuple():Object{
    return {'0':0 ,'1':"val" };
}
console.log(returnTuple()[0 ]);
```
```Java
No support in Java yet.
```

In-Out parameters
```Swift
func incr(_ a: inout Int) {
    a = a + 1
}
var a = 0
incr(&a)
print(a)
```
```Typescript
function incr$_Int(a : {get: () => number, set: (val: number) => void}):void{
    a.set( a.get() + 1 );
}
let a:number = 0 ;
incr$_Int({get: () => a, set: $val => a = $val});
console.log(a);
```
```Java
No support in Java yet.
```

#### Closures
Operator methods
```Swift
var numbers = [5, 2, 3, 1, 4]
numbers.sort(by: <)
```
```Typescript
let numbers:Array<number> = [ 5 , 2 , 3 , 1 , 4 ] ;
numbers.sortBool((a, b) => a < b);
```
```Java
No support in Java yet.
```

Shorthand argument names
```Swift
var numbers = [5, 2, 3, 1, 4]
let sum = numbers.filter {
        $0 % 2 == 1 //select all the odd numbers
    }.map {
        $0 * $0 // square them
    }.reduce(0) {
        $0 + $1 // get their sum
    }
```
```Typescript
let numbers:Array<number> = [ 5 , 2 , 3 , 1 , 4 ] ;
const sum:number = numbers.filter(
        () => arguments[0] % 2  == 1
    ).map(
        () => arguments[0] * arguments[0]
    ).reduce(
        () => arguments[0] + arguments[1]
    , 0);
```
```Java
No support in Java yet.
```

#### Classes
Getter/setter Properties
```Swift
struct Square {
    var a = 1.0
    var perimeter: Double {
        get {
            return a * 4
        }
        set(newPerimeter) {
            a = newPerimeter / 4
        }
    }
}
var square = Square()
square.perimeter = 16
print(square.perimeter)
```
```Typescript
class Square {
    a:number = 1.0 ;
    perimeter$get(): number {
        return this.a * 4 ;
    }
    perimeter$set(newPerimeter:number) {
        this.a = newPerimeter / 4 ;
    } ;
} ;
let square:Square = new Square();
square.perimeter$set( 16 );
console.log(square.perimeter$get());
```
```Java
No support in Java yet.
```

Motivation & Development
==============

Swift is the official new language behind iOS apps.
On top of that, its ease of use coupled with great performance make it a strong contender for a future back-end language
(a compiler has already been released for linux).

Wouldn't it be great to be able to share business logic across the whole mobile environment?
No need to maintain four different code bases (back-end, iOS, Android and browser)!

This transpiler is more robust than any solution I could find online.
Using antlr4 is a huge advantage over hand coding lexers & parsers -- it's more reliable and more maintainable.

The project is undergoing rapid development and ideally it would have complete Swift support.
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
run both the original Swift code and the transpiled TypeScript/Java code and compare the console output.

License
==============

MIT