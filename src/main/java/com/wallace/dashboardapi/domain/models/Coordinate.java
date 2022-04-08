package com.wallace.dashboardapi.domain.models;

import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Coordinate {

    @NonNull
    private Double lat;
    @NonNull
    private Double lon;

}
