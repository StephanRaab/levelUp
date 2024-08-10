// my solution

fun parseScript(input: String): Map<String, MutableList<String>> {
    var nothing = mutableMapOf<String, MutableList<String>>()
  
    // split on newline
    for (line in input.split("\n") {
      // split on ":"
      var parts = line.split(":")
      var actor = parts[0].trim()
      var dialogue = parts[1].trim()
  
      if (nothing.containsKey(actor)) {
        // only add dialogue
        nothing[actor]!! += dialogue
      } else {
        // add key and dialogue
        nothing.put(actor, mutableListOf<String>(dialogue))
      }
    }
  
    // return map
    return nothing
  }

  // official solution

  fun parseScript(script: String): Map<String, MutableList<String>>? {
    var scriptByCharacter = mutableMapOf<String, MutableList<String>>()
    for (line in script.split("\n")) {
      var parts = line.split(":")
      var character = parts[0].trim()
      var dialogue = parts[1].trim()
      
      var list = scriptByCharacter[character] ?: mutableListOf<String>()
      list += dialogue
      scriptByCharacter[character] = list
    }
    return scriptByCharacter
  }