// Given a String? containing words separated by the " " (space) character, write a method wordLengths that return a Map<String, Int> mapping each word that is contained in the String to its length. require that the passed String? is not null.
// So, for example, given the String "Wow that is amazing", you would return a map with four mappings: "Wow" to 3, "that" to 4, "is" to 2, and "amazing" to 7.

// my solution
fun wordLengths(input: String): Map<String, Int> {
    var map = mutableMap<String, Int>()

    for (word in input.split(" ")) {
        map[word] = word.length
    }

    return map
}

// official solution
fun wordLengths(input: String): Map<String, Int> {
    require(input != null)
    var lengths = mutableMap<String, Int>()

    for (word in input.split(" ")) {
        lengths[word] = word.length
    }

    return lengths
}