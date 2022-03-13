package brickset;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PackagingType {

    @JsonProperty("Blister pack") BLISTER_PACK,
    @JsonProperty("Box") BOX,
    @JsonProperty("Bucket") BUCKET,
    @JsonProperty("Canister") CANISTER,
    @JsonProperty("None (loose parts)") NONE,
    @JsonProperty("Other") OTHER,
    @JsonProperty("Plastic box") PLASTIC_BOX,
    @JsonProperty("Plastic canister") PLASTIC_CANISTER,
    @JsonProperty("Polybag") POLYBAG,
    @JsonProperty("Tag") TAG,
    @JsonProperty("Tub") TUB,
    @JsonProperty("{Not specified}") NOT_SPECIFIED

}
