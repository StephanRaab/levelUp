/* Problem Set
Write a method called sectionListsToMap that, given a List of Strings, parses it into a Map<String, MutableSet<String>> 
as follows. Each String in the passed list contains a comma-separated list of names of people in a discussion section. 
The first name is the section leader, and the rest are students. Your map should map each section leader to the set of 
students in their section. No section leader or student will appear twice in the data set.

For example, given the Strings "challen,student1", "ruisong4,student2, student3" and "friendly,student4, student5", 
your map would have keys "challen", "ruisong4", and "friendly". "challen" would map to a set containing 
"student1", "ruisong4" would map to a set containing "student2" and "student3", and so on.

A few hints for approaching this problem. First, consider how to use .split and .trim appropriately to parse the 
input String. You should get this part to work before proceeding. Then consider when you need to create the map and 
each set, and how to populate them.
 */ 

// My Solution

fun sectionListsToMap(sectionsLists: List<String>): Map<String, MutableSet<String>> {
    // Create map
    var sectionMap = mutableMapOf<String, MutableSet<String>>()

    // Loop through sectionsLists
    for (sectionList in sectionLists) {
        // Separate the CSV data
        var people = sectionList.split(",")

        // Get the Leader key and set it on the earlier created map
        var leader = people[0].trim()

        // Create set
        var gradeSet = mutableSetOf<String>()

        // Populate the set
        for (i in 1 until people.size) {
            gradeSet += people[i]
        }

        // Set the Map data to the set
        sectionMap[leader] = gradeSet 
    }

    return sectionMap
}

// Official Solution

fun sectionListsToMap(sectionLists: List<String>): Map<String, MutableSet<String>> {
    // Create my map
    var sections = mutableMapOf<String, MutableSet<String>>()
    for (sectionList in sectionLists) {
      var people = sectionList.split(",")
      var sectionLeader = people[0].trim()
      // Create set for sectionLeader
      var sectionSet = mutableSetOf<String>()
      for (i in 1 until people.size) {
        sectionSet += people[i].trim()
      }
      // Add set to the map
      sections[sectionLeader] = sectionSet
    }
    return sections
  }