import countries.*;
import static java.util.stream.Collectors.*;

var countries = new CountryRepository().getAll();

// 1. Returns the largest country (care must be taken with area because it may be null):

countries.stream().max(Comparator.comparing(Country::getArea)); // throws a NullPointerException

countries.stream().
  filter(country -> country.getArea() != null).
  max(Comparator.comparing(Country::getArea)); // Returns an Optional<Country>

// 2. Prints the names of countries with null area:
countries.stream().
  filter(country -> country.getArea() == null).
  map(Country::getName).
  forEach(System.out::println);

// 3. Returns summary statistics about the area field:

countries.stream().
  map(Country::getArea).
  filter(Objects::nonNull).
  mapToDouble(BigDecimal::doubleValue).
  summaryStatistics(); // Returns a DoubleSummaryStatistics

// 4. Returns the total area of countries:

countries.stream().
  map(Country::getArea).
  filter(Objects::nonNull).
  reduce(BigDecimal.ZERO, BigDecimal::add); // Returns a BigDecimal

countries.stream().
  map(Country::getArea).
  filter(Objects::nonNull).
  reduce(BigDecimal::add); // Returns an Optional<BigDecimal>

// 5. Returns a comma separated string of country names sorted alphabetically:

countries.stream().
  map(Country::getName).
  sorted().
  collect(Collector.of(() -> new StringJoiner(","), (j, s) -> j.add(s), (j1, j2) -> j1.merge(j2), j -> j.toString()));

countries.stream().
  map(Country::getName).
  sorted().
  collect(Collector.of(() -> new StringJoiner(","), StringJoiner::add, StringJoiner::merge, StringJoiner::toString));

countries.stream().
  map(Country::getName).
  sorted().
  collect(Collectors.joining(","))

// 6. Returns the map of country code-country name pairs:

// Map<String, String> countryNameMap = countries.stream().
//   collect(HashMap::new, (map, country) -> map.put(country.getCode(), country.getName()), HashMap::putAll);

Map<String, String> countryNameMap = countries.stream().collect(toMap(Country::getCode, Country::getName));

// 7. Returns the map of countries for efficient access by country code:

// Map<String, Country> countryMap = countries.stream().
//   collect(HashMap::new, (map, country) -> map.put(country.getCode(), country), HashMap::putAll);

Map<String, Country> countryMap = countries.stream().collect(toMap(Country::getCode, Function.identity()));

countryMap.get("HU"); // Returns Hungary
countryMap.get("DE"); // Returns Germany
countryMap.get("CN"); // Returns China

// 8. Prints the names and populations of countries with population less or equal to that of Hungary in descending order of population:

Country hungary = countryMap.get("HU");
countries.stream().
  filter(country -> country.getPopulation() <= hungary.getPopulation()).
  sorted(Comparator.comparing(Country::getPopulation).reversed()).
  forEach(country -> System.out.printf("%s:%d\n", country.getName(), country.getPopulation()));

// 9. Returns the number of European and non-European countries:

countries.stream().collect(partitioningBy(country -> country.getRegion() == Region.EUROPE, counting()));

// 10. Returns the lists of countries by region:

Map<Region, List<Country>> countriesByRegion = countries.stream().collect(groupingBy(Country::getRegion));

// 11. Returns the number of countries by region:

Map<Region, Long> numberOfCountriesByRegion = countries.stream().collect(groupingBy(Country::getRegion, counting()));

// 12. Prints the number of countries by region:

countries.stream().
  collect(groupingBy(Country::getRegion, counting())).
  forEach((region, count) -> System.out.printf("%s:%d\n", region, count));

countries.stream().
  collect(groupingBy(Country::getRegion, counting())).
  entrySet().
  stream().
  sorted(Comparator.comparingLong(Map.Entry::getValue)).
  forEach(System.out::println);

countries.stream().
  collect(groupingBy(Country::getRegion, counting())).
  entrySet().
  stream().
  sorted(Map.Entry.comparingByValue()).
  forEach(System.out::println);

countries.stream().
  collect(groupingBy(Country::getRegion, counting())).
  entrySet().
  stream().
  sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
  forEach(System.out::println);

// 13. Returns population average by region:

Map<Region, Double> avgPopulationByRegion = countries.stream().collect(groupingBy(Country::getRegion, averagingLong(Country::getPopulation)));

// 14. Returns the most populous country by region:

countries.stream().collect(groupingBy(Country::getRegion, maxBy(Comparator.comparing(Country::getPopulation)))); // Returns a Map<Region, Optional<Country>>

countries.stream().collect(groupingBy(Country::getRegion, collectingAndThen(maxBy(Comparator.comparing(Country::getPopulation)), Optional::get))); // Returns a Map<Region, Country>

// 15. Returns the largest population by region:

countries.stream().collect(groupingBy(Country::getRegion, mapping(Country::getPopulation, maxBy(Long::compare)))); // Returns a Map<Region, Optional<Long>>

countries.stream().collect(groupingBy(Country::getRegion, collectingAndThen(mapping(Country::getPopulation, maxBy(Long::compare)), Optional::get))); // Returns a Map<Region, Long>

// 16. Returns the longest country name by region:

countries.stream().map(Country::getName).max(Comparator.comparingInt(String::length));

countries.stream().collect(groupingBy(Country::getRegion, mapping(Country::getName, maxBy(Comparator.comparingInt(String::length)))));

countries.stream().collect(groupingBy(Country::getRegion, mapping(Country::getName, collectingAndThen(maxBy(Comparator.comparingInt(String::length)), Optional::get))));

// 17. Returning the number of countries grouped by the first letter of their name:

countries.stream().collect(groupingBy(country -> country.getName().charAt(0), counting()));

// 18. Returns whether there are two or more countries with the same non-null area:

countries.stream().
  map(Country::getArea).
  filter(Objects::nonNull).
  collect(groupingBy(Function.identity(), counting())).
  entrySet().
  stream().
  anyMatch(e -> e.getValue() > 1);
