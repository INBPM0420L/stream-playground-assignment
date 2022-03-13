stream-playground
=================

Playground for playing with [streams](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/package-summary.html) in Java.

Data is taken from the [REST Countries](https://restcountries.com/) API from [here](https://restcountries.com/v2/all?fields=alpha2Code,name,capital,region,area,population,translations,timezones,independent).

Usage:
```console
$ mvn compile jshell:run
jshell> import countries.*;
jshell> List<Country> countries = new CountryRepository().getAll(); // The list of all countries
```

Building and running the project requires JDK 17 or later.
