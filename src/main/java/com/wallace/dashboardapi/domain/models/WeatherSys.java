package com.wallace.dashboardapi.domain.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
public class WeatherSys {

    private Integer type;
    private Long id;
    private Double message;
    private String country;
    private Long sunrise;
    private Long sunset;

}
