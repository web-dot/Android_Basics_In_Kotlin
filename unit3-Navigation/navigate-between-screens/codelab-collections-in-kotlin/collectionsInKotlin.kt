fun main() {
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
}