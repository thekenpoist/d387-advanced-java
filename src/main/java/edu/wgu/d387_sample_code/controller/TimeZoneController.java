package edu.wgu.d387_sample_code.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class TimeZoneController {

    @GetMapping("/presentation")
    public String timeZoneConvert() {
        return TimeZone.getMeetingTime();
    }
}
