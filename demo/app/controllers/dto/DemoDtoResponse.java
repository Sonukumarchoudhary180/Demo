package controllers.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class DemoDtoResponse {

    @JsonProperty("fullName")
    private String fullName;

    @JsonProperty("rollNo")
    private String rollNo;

    @JsonProperty("address")
    private String address;
}
