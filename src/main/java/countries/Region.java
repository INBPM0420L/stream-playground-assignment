package countries;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Region {

    @JsonProperty("Africa") AFRICA,
    @JsonProperty("Americas") AMERICAS,
    @JsonProperty("Antarctic") ANTARCTIC,
    @JsonProperty("Antarctic Ocean") ANTARCTIC_OCEAN,
    @JsonProperty("Asia") ASIA,
    @JsonProperty("Europe") EUROPE,
    @JsonProperty("Oceania") OCEANIA,
    @JsonProperty("Polar") POLAR

}
