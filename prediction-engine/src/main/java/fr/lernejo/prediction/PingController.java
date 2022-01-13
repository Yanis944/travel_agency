package fr.lernejo.prediction;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping(path = "/api/ping")
    String ping() {
        return "OK";
    }


    @GetMapping(path = "/api/temperature")
    public @ResponseBody Object GetTemp(@RequestParam String country)  {
        TemperatureService temperatureService = new TemperatureService();
        try {
            Temperature temperature = new Temperature(country);
            temperature.temperature.add(new Temperatureday("2022-13-01", temperatureService.getTemperature(country)));
            temperature.temperature.add(new Temperatureday("2021-14-01", temperatureService.getTemperature(country)));
            return temperature;
        } catch (UnknownCountryException e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }

    }
}
