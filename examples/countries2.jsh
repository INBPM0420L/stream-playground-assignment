import countries.*;
var countries = new CountryRepository().getAll();

// 1. Returns whether there is at least one country with the word "island" in its name ignoring case:

countries.stream().anyMatch(country -> country.getName().toLowerCase().contains("island"));

// 2. Returns the first country name that contains the word "island" ignoring case:

countries.stream().
  map(Country::getName).
  filter(s -> s.toLowerCase().contains("island")).
  findFirst().
  get();

// 3. Prints each country name in which the first and the last letters are the same ignoring case:

countries.stream().
  map(Country::getName).
  filter(s -> { String t = s.toLowerCase(); return t.charAt(0) == t.charAt(t.length() - 1); }).
  forEach(System.out::println);

// 4. Prints the populations of the first ten least populous countries (required intermediate operations: [`mapToLong`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#mapToLong(java.util.function.ToLongFunction)), [`sorted`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#sorted()), [`limit`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#limit(long)))):

countries.stream().
  mapToLong(Country::getPopulation).
  sorted().
  limit(10).
  forEach(System.out::println);

// 5. Prints the names of the first ten least populous countries (required intermediate operations: [`sorted`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#sorted(java.util.Comparator)), [`limit`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#limit(long)))):

countries.stream().
  sorted(Comparator.comparingLong(Country::getPopulation)).
  limit(10).
  map(Country::getName).
  forEach(System.out::println);

// 6. Returns summary statistics about the number of country name translations associated with each country (required intermediate operations: [`mapToInt`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#mapToInt(java.util.function.ToIntFunction)), [`summaryStatistics`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/IntStream.html#summaryStatistics())):

countries.stream().
  mapToInt(country -> country.getTranslations().size()).
  summaryStatistics();

// 7. Prints the names of countries in the ascending order of the number of timezones:

countries.stream().
  sorted(Comparator.comparingInt(country -> country.getTimezones().size())).
  map(Country::getName).
  forEach(System.out::println);

// 8. Prints the number of timezones for each country in the form name:timezones, in the ascending order of the number of timezones:

countries.stream().
  sorted(Comparator.comparingInt(country -> country.getTimezones().size())).
  forEach(country -> System.out.printf("%s:%d\n", country.getName(), country.getTimezones().size()));

// 9. Returns the number of countries with no Spanish country name translation (the Spanish language is identified by the language code "es"):

countries.stream().
  filter(country -> ! country.getTranslations().containsKey("es")).
  count();

// 10. Prints the names of countries with null area:

countries.stream().
  filter(country -> country.getArea() == null).
  map(Country::getName).
  forEach(System.out::println);

// 11. Prints all distinct language tags of country name translations sorted in alphabetical order (required intermediate operation: [`flatMap`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#flatMap(java.util.function.Function))):

countries.stream().
  flatMap(country -> country.getTranslations().keySet().stream()).
  sorted().
  distinct().
  forEach(System.out::println);

// 12. Returns the average length of country names:

countries.stream().
  map(Country::getName).
  mapToInt(String::length).
  average().
  getAsDouble();

// 13. Prints all distinct regions of the countries with null area:

countries.stream().
  filter(country -> country.getArea() == null).
  map(Country::getRegion).
  distinct().
  forEach(System.out::println);

// 14. Returns the largest country with non-null area:

countries.stream().filter(country -> country.getArea() != null).max(Comparator.comparing(Country::getArea));

// 15. Prints the names of countries with a non-`null` area below 1:

countries.stream().
  filter(country -> country.getArea() != null).
  filter(country -> country.getArea().compareTo(BigDecimal.ONE) < 0).
  map(Country::getName).
  forEach(System.out::println);

// 16. Prints all distinct timezones of European and Asian countries (required intermediate operation: [`flatMap`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#flatMap(java.util.function.Function))):

countries.stream().
  filter(country -> country.getRegion() == Region.EUROPE || country.getRegion() == Region.ASIA).
  flatMap(country -> country.getTimezones().stream()).
  distinct().
  forEach(System.out::println);
