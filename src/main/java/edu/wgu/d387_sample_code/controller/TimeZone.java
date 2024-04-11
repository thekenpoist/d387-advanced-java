package edu.wgu.d387_sample_code.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZone {

    public static String getMeetingTime() {

        LocalDate localDate = LocalDate.of(2024, 4, 15);
        LocalTime localTime = LocalTime.of(10,  30);
        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        ZonedDateTime time = ZonedDateTime.of(localDate, localTime, zoneId);
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("h:mm a");

        ZonedDateTime ET = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime MT = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime UTC = time.withZoneSameInstant(ZoneId.of("UTC"));

        String times = ET.format(timeFormat) + " ET | " + MT.format(timeFormat) + " MT | " + UTC.format(timeFormat) + " UTC";

        return times;
    }
}
