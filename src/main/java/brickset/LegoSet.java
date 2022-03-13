package brickset;

import java.time.Year;
import java.util.Set;

@lombok.Data
public class LegoSet {

    private String number;
    private String name;
    private Year year;
    private String theme;
    private String subtheme;
    private PackagingType packagingType;
    private int pieces;
    private String bricksetURL;
    private Set<String> tags;
    private Dimensions dimensions;

}
