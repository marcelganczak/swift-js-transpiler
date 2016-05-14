var baconAge = 6
var eggsAge = 12

if baconAge <= 7 &amp;&amp; eggsAge &lt;= 21 {
    // bacon and eggs are ok, we can cook
    print("you can cook bacon and eggs")
} else {
    // either eggs or bacon or both are spoiled
    if baconAge > 7 {
        print("throw out bacon")
    }
    if eggsAge &gt; 21 {
        print("throw out eggs")
    }
}