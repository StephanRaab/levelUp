///Given a String containing words separated by the "_" character, write a method wordCount 
///that returns a Map<String, Int> containing the number of times that each part appears in the String.
///So, for example, given the String "Xyz_Chuchu_Chuchu_Xyz_Ferdie", you would return a map with three mappings: "Xyz" to 2, "Chuchu" to 2, and "Ferdie" to 1.
fun wordCount(input: String): Map<String, Int> {
    var map = mutableMap<String,Int>
    var words = mutableListOf<String>()

    for (word in input.Split("_")) {
        words.add(word)
    }

    return words.groupingBy { it }.eachCount()
}

wordCount("Xyz_Chuchu_Chuchu_Xyz_Ferdie")