# String concatenation in Java
Simple example and benchmarking of two different string concatenation in Java. 
It's created to show why you should use StringBuilder for concatenating strings.


In Concatenation class we have two methods that do the same thing, concatenate strings.
For example we used the longest place name in the world that belongs to a hill near Porangahau in the southern Hawke’s Bay in New Zealand. 
It is a name given in the Moari language. 

It contains 85 letters. In the example that name is splitted into array of character strings and then used for concatenation.

## How to run benchmarking
 It's a maven based project, so to run it just execute:
```$xslt
mvn clean package
``` 
Which will generate a jar file that you can run with:
```$xslt
java -jar target/string-concatenation-1.0-SNAPSHOT-jar-with-dependencies.jar
```



