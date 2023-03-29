package org.example.builder;

import org.example.entity.Drw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class DrwBuilder {
    public static Drw toDrw(Map<String, String> map) {
        return Drw.builder()
                .drwNo(Integer.parseInt(map.get("drwNo")))
                .drwtNo1(Integer.parseInt(map.get("drwtNo1")))
                .drwtNo2(Integer.parseInt(map.get("drwtNo2")))
                .drwtNo3(Integer.parseInt(map.get("drwtNo3")))
                .drwtNo4(Integer.parseInt(map.get("drwtNo4")))
                .drwtNo5(Integer.parseInt(map.get("drwtNo5")))
                .drwtNo6(Integer.parseInt(map.get("drwtNo6")))
                .bnusNo(Integer.parseInt(map.get("bnusNo")))
                .firstWinAmnt(Long.parseLong(map.get("firstWinAmnt")))
                .drwNoDate(LocalDate.parse(
                        map.get("drwNoDate"),
                        DateTimeFormatter.ofPattern("yyyy-MM-dd")))
                .build();
    }
}
