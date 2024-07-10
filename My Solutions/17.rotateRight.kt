fun rotateRight(input: String, rotate: Int) : String {
// You will want to use the remainder operator to perform modular arithmetic.
// You will probably want to convert the String to an array of characters before you begin.
// You can convert an array of characters characters back into a String like this: String(characters).
// You can also solve this problem quite elegantly using substring.

 var str2Arr = input.toCharArray();
 var output = ""

 for (character in str2Arr.indices) {
     var position = character

     position = (position + rotate) % input.length
     output += input[position]
 }

 return output
} 

// Testing rotateRight(input: String = "8 circle", rotate: Int = 1) failed:
// Solution returned: "e8 circl"
// Submission returned: " circle8"

console.WriteLine(rotateRight("CS125", 2)) // 25CS1
console.WriteLine(rotateRight("8 circle", 1)) // "e8 circl"