// Given a nullable List of Strings, write a method toSet that converts it to a Set of Strings that contains all the same Strings in the original list. So given a List containing "test", "me", and "test", you would return a Set containing "test" and "me". require that the passed List is not null.

// v1

fun toSet(input: List<String>): Set<String> {
    var set = mutableSetOf<String>()

    for (i in input){
        set.add(i)
    }

    return set
}

// v2

fun toSet(input: List<String>): Set<String> {
    var set = mutableSetOf<String>()

    for (i in input){
        set += i
    }

    return set
}

// v3

fun toSet(input: List<String>): Set<String> {
    return input.toSet()
}

// v4

fun toSet(input: List<String>) = input.toSet()