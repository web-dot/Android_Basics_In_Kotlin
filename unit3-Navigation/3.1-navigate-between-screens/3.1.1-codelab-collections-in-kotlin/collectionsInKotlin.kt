fun main() {

    /**
     * Working with collections
     */
    val peopleAges = mutableMapOf<String, Int>(
    	"Fred" to 30,
        "Ann" to 23
    )
    println("ages-map: ${peopleAges}")
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    
    println("ages-map: ${peopleAges}")
    
    
    println(peopleAges.map{"${it.key} is ${it.value}"}.joinToString(", "))
    
    val filteredNames = peopleAges.filter{it.key.length < 4}
    println(filteredNames)

    /**
     * Lambdas and higher order functions
     * 
     * in kotlin you can store functions in variables, and classes, pass function
     * as arguments , and even return functions. you would treat them like you would
     * variables of other types line Int or String.
     * 
     * Function type:
     * (Int) -> Int
     * a function with the above function type must take in a parameter of type
     * Int and return a value of type Int
     * 
     * Lambda:
     * 
     * {a * Int -> a * 3}
     */

    //  val number: Int = 5
     val triple: (Int) -> Int = {a: Int -> a * 3}
     println("tripled: ${triple(3)}") // tripled: 9


     // lambda for single parameter
     val tripleForSingle: (Int) -> Int = {it * 3}
     println(tripleForSingle(5))

/**
 * Higher order Functions
 * 
 * map, filter, and forEach are all `higher order functions` because they all took
 * a function as a parameter. 
*/

// sort a list of strings based on length of the strings

val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
println(peopleNames.sorted())
println(peopleNames.sortedWith{str1 : String, str2 : String -> str1.length - str2.length})



/**
 * 
 * OnClickListener and OnKeyListener in android
 * Tying this back to what you have learned in Android so far, you have used lambdas
 * in earlier codelabs, such as when you set a click listener for the button in the 
 * Tip calculator app:
 * 
 * calculateButton.setOnClickListener{calculateTip()}
 */

/**
 * Application of : collections, higher order functions and lambda
 * 
 * Vocabulary words:
 */
println()
println("Vocubulary words")

val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
val filteredWords = words.filter{it.startsWith("b", ignoreCase = true)}
println(filteredWords)

val filteredShuffledWords = words.filter{it.startsWith("b", ignoreCase = true)}
.shuffled()
.take(2)
.sorted()
println(filteredShuffledWords)


val startsWithC = words.filter{it.startsWith("c", ignoreCase = true)}
.take(1)
println(startsWithC)

/**
 * Summary : 
 * 
 * * a collection is group of related items
 * * a collection can be mutable or immutable
 * * collections can be ordered or unordered
 * * collections can require unique items or allow duplicates
 * * kotlin supports different types of collections, including list, set and map
 * * kotlin provides many functions for processing and transforming collections, including forEach, map, filter
 * sorted and more
 * * a lambda is a function wthout a name, that can be passed as an expression immediately. An example
 * would be({a: Int -> a * 3})
 * * A Higher Order Function means passing a function to another function, or returning a function from an other 
 * function.
 * 
 */



















}