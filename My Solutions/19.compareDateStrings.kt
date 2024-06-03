// Complete the method below called compareDates that, given two Strings containing datetimes in ISO-8601 format, returns -1 
// if the first time is before the second, 1 if the second is before the first, and 0 if they are equal.

// When you are done, here is how your method should work:

// You will want to approach this in two steps. First, convert each String into some kind of datetime representation. 
// We suggest that you explore the various built-in Java libraries for working with dates and times. Don't attempt to do this yourself!

// Next, use the resulting object to compare the two datetimes. We might suggest that you explore the java.time.Instant 
// class and its parse and other methods. We have provided some starter code so that you can identify where 
// the import statements should go. Ignore the class Question stuff, since we haven't covered that yet.

//import java statements here
import.java.time.Instant

Class Question {
    fun compareDates(first: String, second: String): Int {
        return 0
    }

    Instant instant1 = Instant.parse(first)
    Instant instant2 = Instant.parse(second)
    int date = 0

    int value = instant1.compareTo(instant2)

    if (value > 0) {
        // instant1 is greater
        // return 1
        return 1
    } else if (value == 0) {
        //they're equal return 0
        return 0
    } else {
        // instant2 is greater
        return -1
    }

    return date
}