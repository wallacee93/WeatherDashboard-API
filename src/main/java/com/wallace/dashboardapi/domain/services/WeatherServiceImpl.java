package com.wallace.dashboardapi.domain.services;

import com.wallace.dashboardapi.domain.models.WeatherApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class WeatherServiceImpl implements WeatherService{

    private Logger logger = LoggerFactory.getLogger(WeatherServiceImpl.class);

    private RestTemplate template;

    public WeatherServiceImpl(){
        template = new RestTemplate();


    }

    @Override
    public Optional<WeatherApiResponse> requestDataFromApi(String lat, String lon) {
        try{
            String apiKey = "90b33227f93ab5733f65e47ebb208131";
            String url = "https://api.openweathermap.org/data/2.5/weather?lat=%s&lon=%s&appid=%s";
            String request = String.format(url, lat, lon, apiKey);
            ResponseEntity<WeatherApiResponse> response = template.exchange(request, HttpMethod.GET, null, WeatherApiResponse.class);
            WeatherApiResponse apiResponse = response.getBody();
            return Optional.of(apiResponse);
        } catch (HttpClientErrorException ex){
            logger.error(ex.getMessage());
            return Optional.empty();
        }
    }
}
