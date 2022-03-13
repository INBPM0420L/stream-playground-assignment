package repository;

import java.io.IOException;

import java.util.List;

/**
 * Represents a repository to obtain a list of objects. Data is read from a
 * static JSON file that contains an array of JSON objects. The file is loaded
 * via the classloader.
 *
 * @param <T> the type of the elements
 */
public abstract class Repository<T> {

    private List<T> elements;

    /**
     * Creates a {@code Repository} object to obtain a list of objects of
     * {@code elementClass}. The classloader of {@code elementClass} is used to
     * read JSON data.
     *
     * @param elementClass represents the type of the elements
     * @param resourceName the name of the resource that contains JSON data to
     *                     be read
     */
    protected Repository(Class<T> elementClass, String resourceName) {
        try {
            elements = JacksonHelper.readList(elementClass.getResourceAsStream(resourceName), elementClass);
        } catch(IOException e) {
            e.printStackTrace();
            throw new AssertionError("Failed to load resource " + resourceName, e); // Can't happen
        }
    }

    /**
     * Returns the list of objects.
     *
     * @return the list of objects
     */
    public List<T> getAll() {
        return elements;
    }

}
