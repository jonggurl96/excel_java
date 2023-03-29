package org.example.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Drw {
    
    private int drwNo;
    
    private int bnusNo;
    
    private LocalDate drwNoDate;
    
    private int drwtNo1;
    
    private int drwtNo2;
    
    private int drwtNo3;
    
    private int drwtNo4;
    
    private int drwtNo5;
    
    private int drwtNo6;
    
    private long firstWinAmnt;
    
    public String values() {
        StringBuilder builder = new StringBuilder("values(");
        builder.append(drwNo + ", ");
        builder.append(bnusNo + ", ");
        builder.append("'" + drwNoDate + "', ");
        builder.append(drwtNo1 + ", ");
        builder.append(drwtNo2 + ", ");
        builder.append(drwtNo3 + ", ");
        builder.append(drwtNo4 + ", ");
        builder.append(drwtNo5 + ", ");
        builder.append(drwtNo6 + ", ");
        builder.append(firstWinAmnt);
        return builder.append(")").toString();
    }
}
