// problem set
// Given a String containing words separated by the " " (space) character, write a method hasDuplicateWords that returns true if any word appears twice in the String. Also, you should ignore case: so "Chuchu" and "chuchu" are considered the same word. require that the passed String is not null.

// So, for example, given the String "Wow that is amazing", you would return false, but given the String "Chuchu chuchu xyz" you would return true.

// Our intention is for you to solve this problem using a Set, but there are also solutions that use a Map. You should not use a nested loop to solve this problem. You may want to use the lowercase method of Kotlin Strings.


// my solution

fun hasDuplicateWords(input: String): Boolean {
    val list = input.split(" ")
    var set = mutableSetOf<String>()

    for (item in list) {
        if (set.contains(item.lowercase())) {
            return true
        } else {
            set += item.lowercase()
        }
    }

    return false
}

// official solution

fun hasDuplicateWords(input: String?): Boolean {
    require(input != null)

    var set = mutableSetOf<String>()
    for (part in input.split(" ")) {
        var word = part.lowercase()
        if (set.contains(word)) {
            return true
        } else {
            set += word
        }
    }

    return false
}