Assignments
===========

Execute the following code snippets in JShell to be able to work with countries:
```java
import countries.*;
var countries = new CountryRepository().getAll();
```
In the following, the `countries` variable holds a list of `Country` objects, you must work with this list in the solutions.

Write a stream pipeline that:

1. Prints country names.

1. Prints the capital of each country in alphabetical order. Beware: the capital of a country may be `null`.

1. Prints the capital of each country in reverse alphabetical order. Beware: the capital of a country may be `null`.

1. Returns the maximum population.

1. Returns population average.

1. Returns summary statistics about the population field.

1. Prints the names of European countries.

1. Returns the number of European countries.

1. Returns the number of independent countries.

1. Prints all countries with population below 100.

1. Prints the names of countries with population below 100.

1. Returns the sum of population of European countries.

1. Prints the population of European countries in ascending order.

1. Prints the population of European countries in descending order.

1. Returns the European country with the highest population.

1. Returns the name of the European country with the highest population.

1. Prints the names of the first five countries (required intermediate operation: [`limit`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#limit(long))).

1. Returns whether there is at least one country with 0 population (required terminal operation: [`anyMatch`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#anyMatch(java.util.function.Predicate))).

1. Returns whether each country has at least one timezone (required terminal operation: [`allMatch`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate))).

1. Returns the first country whose name starts with 'H' (required terminal operation: [`findFirst`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#findFirst())).

1. Returns the number of all distinct timezones (required intermediate operations: [`flatMap`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#flatMap(java.util.function.Function)), [`distinct`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#distinct())).

1. Prints all distinct timezones of European countries (required intermediate operations: [`flatMap`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#flatMap(java.util.function.Function)), [`distinct`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#distinct())).

1. Prints the name and population of each country in descending order of population.

1. Returns the length of the longest country name.

1. Prints the capital of each country in ascending order of length. Beware: the capital of a country may be `null`.

1. Prints the capital of each country in ascending order of length and then in alphabetical order. Beware: the capital of a country may be `null`.
