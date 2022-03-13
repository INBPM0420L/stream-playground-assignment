Assignments
===========

Execute the following code snippets in JShell to be able to work with countries:
```java
import countries.*;
import static java.util.stream.Collectors.*;
var countries = new CountryRepository().getAll();
```
In the following, the `countries` variable holds a list of `Country` objects, you must work with this list in the solutions.

Write a stream pipeline that:

1. Returns the largest country (care must be taken with area because it may be `null`).

1. Prints the names of countries with `null` area.

1. Returns summary statistics about the area field.

1. Returns the total area of countries.

1. Returns a comma separated string of country names sorted alphabetically.

1. Returns the map of country code-country name pairs.

1. Returns the map of countries for efficient access by country code.

1. Prints the names and populations of countries with population less or equal to that of Hungary in descending order of population.

1. Returns the number of European and non-European countries.

1. Returns the lists of countries by region.

1. Returns the number of countries by region.

1. Prints the number of countries by region.

1. Returns population average by region.

1. Returns the most populous country by region.

1. Returns the largest population by region.

1. Returns the longest country name by region.

1. Returns the number of countries grouped by the first letter of their name.

1. Returns whether there are two or more countries with the same non-`null` area.
