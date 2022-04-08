package com.wallace.dashboardapi.domain.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
public class Weather {

    private Long id;
    private String main;
    private String description;
    private String icon;

}
