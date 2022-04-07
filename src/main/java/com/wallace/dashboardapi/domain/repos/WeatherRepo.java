package com.wallace.dashboardapi.domain.repos;

import com.wallace.dashboardapi.domain.models.WeatherApiResponse;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface WeatherRepo {

    Optional<WeatherApiResponse> findByLatAndLon(String lat, String lon);
}
