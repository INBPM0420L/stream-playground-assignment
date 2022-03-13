package countries;

import repository.Repository;

/**
 * Represents a repository of {@code Country} objects.
 */
public class CountryRepository extends Repository<Country> {

    public CountryRepository() {
        super(Country.class, "countries.json");
    }

}
