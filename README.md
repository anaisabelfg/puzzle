# Puzzle #
 Everyone loves alphabet soup.  And of course you want to know if you can construct a message from the letters found in your bowl. 
Write a function that takes as input two strings: 
-   The message you want to write
 -   All the letters found in your bowl of alphabet soup. 

## The solution ##
The class com.puzzle.Solution has a public static method called canIWriteTheMessage with the parameters mentioned in the specifications that return true or false.

`public static boolean canIWriteTheMessage(String message, String bowlOfSoup)`

### Complexity: ###
* Worst case scenario: O(n + m + 26). In this case the message would contain the whole alphabet being n and m > 0. 
* Best case scenario: O(n + m + 1). In this case the message contain just one character x times being n and m > 0.

The bowl of soup and the message are traversed once and the map with the counting of different characters in the message
 is also traversed once. The complexity for accessing to the elements in a HashMap of characters is O(1).

## How to run the tests? ##

* Check if you have Java 8 and Maven 3. 
* Run `mvn verify`


## Dependencies ##

There are no runtime dependencies, just for testing

* junit:junit:jar:4.11:test
* org.assertj:assertj-core:jar:3.6.2:test