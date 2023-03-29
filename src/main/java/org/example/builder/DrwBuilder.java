package org.example.builder;

import org.example.entity.Drw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class DrwBuilder {
    public static Drw toDrw(Map<String, String> map) {
        return Drw.builder()
                .drwNo(Integer.parseInt(map.get("round")))
                .drwtNo1(Integer.parseInt(map.get("num1")))
                .drwtNo2(Integer.parseInt(map.get("num2")))
                .drwtNo3(Integer.parseInt(map.get("num3")))
                .drwtNo4(Integer.parseInt(map.get("num4")))
                .drwtNo5(Integer.parseInt(map.get("num5")))
                .drwtNo6(Integer.parseInt(map.get("num6")))
                .bnusNo(Integer.parseInt(map.get("bnum")))
                .firstWinAmnt(Long.parseLong(map.get("firstWinamnt")))
                .drwNoDate(LocalDate.parse(
                        map.get("date"),
                        DateTimeFormatter.ofPattern("yyyy-MM-dd")))
                .build();
    }
}
