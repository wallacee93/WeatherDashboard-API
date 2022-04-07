package com.wallace.dashboardapi.domain.services;

import com.wallace.dashboardapi.domain.models.WeatherApiResponse;

import java.util.Optional;

public interface WeatherService {
    Optional<WeatherApiResponse> requestDataFromApi(String lat, String lon);
}