package com.datastructure.java8course.ch1;

import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZonId {

    public static void main(String[] args) {

        int count = 0;
        for (String zoneId: ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId1 = ZoneId.of(zoneId);
            String zoneIdDisplayName = zoneId1.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            System.out.println(zoneId + " : " + zoneIdDisplayName);
        }
    }
}
