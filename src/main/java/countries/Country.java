package countries;

import java.math.BigDecimal;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Country {

    @JsonProperty("alpha2Code") private String code;
    private String name;
    private String capital;
    private Region region;
    private long population;
    private BigDecimal area;
    private Map<String, String> translations;
    private List<ZoneId> timezones;
    private boolean independent;

}
