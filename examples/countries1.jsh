import countries.*;
var countries = new CountryRepository().getAll();

// 1. Prints country names:

countries.stream().
  map(Country::getName).
  forEach(System.out::println);

// 2. Prints the capital of each country in alphabetical order:

countries.stream().
  map(Country::getCapital).
  sorted(Comparator.nullsFirst(Comparator.naturalOrder())).
  forEach(System.out::println);

// 3. Prints the capital of each country in reverse alphabetical order:

countries.stream().
  map(Country::getCapital).
  sorted(Comparator.nullsLast(Comparator.reverseOrder())).
  forEach(System.out::println);

// 4. Returns the maximum population:

countries.stream().
  mapToLong(Country::getPopulation).
  max().
  getAsLong();

// 5. Returns population average:

countries.stream().
  mapToLong(Country::getPopulation).
  average().
  getAsDouble();

// 6. Returns summary statistics about the population field:

countries.stream().
  mapToLong(Country::getPopulation).
  summaryStatistics();

// 7. Prints the names of European countries:

countries.stream().
  filter(country -> country.getRegion() == Region.EUROPE).
  map(Country::getName).
  forEach(System.out::println);

// 8. Returns the number of European countries:

countries.stream().
  filter(country -> country.getRegion() == Region.EUROPE).
  map(Country::getName).
  count();

// 9. Returns the number of independent countries:

countries.stream().
  filter(country -> country.isIndependent()).
  count();

countries.stream().
  filter(Country::isIndependent).
  count();

// 10. Prints all countries with population below 100:

countries.stream().
  filter(country -> country.getPopulation() < 100).
  forEach(System.out::println);

// 11. Prints the names of countries with population below 100:

countries.stream().
  filter(country -> country.getPopulation() < 100).
  map(Country::getName).
  forEach(System.out::println);

// 12. Returns the sum of population of European countries:

countries.stream().
  filter(country -> country.getRegion() == Region.EUROPE).
  mapToLong(Country::getPopulation).
  sum();

// 13. Prints the population of European countries in ascending order:

countries.stream().
  filter(country -> country.getRegion() == Region.EUROPE).
  mapToLong(Country::getPopulation).
  sorted().
  forEach(System.out::println)

// 14. Prints the population of European countries in descending order:

countries.stream().
  filter(country -> country.getRegion() == Region.EUROPE).
  mapToLong(Country::getPopulation).
  boxed(). // returns a Stream of java.lang.Long objects (required because LongStream has only a no-argument sorted() operation)
  sorted(Comparator.reverseOrder()).
  forEach(System.out::println)

// 15. Returns the European country with the highest population:

Country mostPopulousCountry = countries.stream().
  filter(country -> country.getRegion() == Region.EUROPE).
  max(Comparator.comparingLong(Country::getPopulation)).
  get();

// 16. Returns the name of the European country with the highest population:

countries.stream().
  filter(country -> country.getRegion() == Region.EUROPE).
  max(Comparator.comparingLong(Country::getPopulation)).
  get().
  getName();

// 17. Prints the names of the first five countries:

countries.stream().
  map(Country::getName).
  limit(5).
  forEach(System.out::println);

// 18. Returns whether there is at least one country with 0 population:

countries.stream().anyMatch(country -> country.getPopulation() == 0);

// 19. Returns whether each country has at least one timezone:

countries.stream().allMatch(country -> ! country.getTimezones().isEmpty());
countries.stream().allMatch(country -> country.getTimezones().size() > 0);

// 20. Returns the first country whose name starts with ‘H’:

countries.stream().
  filter(country -> country.getName().charAt(0) == 'H').
  findFirst();

countries.stream().
  filter(country -> country.getName().startsWith("H")).
  findFirst();

// 21. Returns the number of all distinct timezones:

long numberOfTimezones = countries.stream().
  flatMap(country -> country.getTimezones().stream()).
  distinct().
  count();

// 22. Prints all distinct timezones of European countries:

countries.stream().
  filter(country -> country.getRegion() == Region.EUROPE).
  flatMap(country -> country.getTimezones().stream()).
  distinct().
  forEach(System.out::println);

// 23. Prints the name and population of each country in descending order of population:

countries.stream().
  sorted(Comparator.comparingLong(Country::getPopulation)).
  forEach(country -> System.out.printf("%s: %d\n", country.getName(), country.getPopulation()));

// 24. Returns the length of the longest country name:

countries.stream().
  map(Country::getName).
  max(Comparator.comparingInt(String::length)).
  get();

// 25. Prints the capital of each country in ascending order of length:

countries.stream().
  map(Country::getCapital).
  sorted(Comparator.nullsFirst(Comparator.comparingInt(String::length))).
  forEach(System.out::println);

// 26. Prints the capital of each country in ascending order of length and then in alphabetical order:

countries.stream().
  map(Country::getCapital). sorted(Comparator.nullsFirst(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))).
  forEach(System.out::println);
