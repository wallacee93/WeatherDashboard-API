package com.wallace.dashboardapi.domain.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@ToString
public class WeatherApiResponse {


    private Long weatherId;
    private Coordinate coord;
    private List<Weather> weather;
    private String base;
    private Integer visibility;
    private Wind wind;
    private Cloud clouds;
    private Long dt;
    private WeatherSys sys;
    private Long timezone;
    private String name;
    private Integer cod;
    private WeatherMain main;

}
