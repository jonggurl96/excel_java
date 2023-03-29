package org.example;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.builder.DrwBuilder;
import org.example.entity.Drw;
import org.example.jdbc.PsqlJdbc;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Drw> entities = new ArrayList<>();
        try(FileInputStream file = new FileInputStream("lotto_data_from_api.xlsx")) {
            XSSFSheet sheet = new XSSFWorkbook(file).getSheet("data");
            
            int rows = sheet.getPhysicalNumberOfRows();
            XSSFRow headers = sheet.getRow(0);
            int cells = headers.getPhysicalNumberOfCells();
            for(int i = 1; i < rows; i++) {
                XSSFRow row = sheet.getRow(i);
                if(row != null) {
                    Map<String, String> map = new HashMap<>();
                    for(int j = 0; j < cells; j++) {
                        XSSFCell cell = row.getCell(j);
                        XSSFCell header = headers.getCell(j);
                        String headerNm = header.getStringCellValue();
                        map.put(headerNm, cell.getRawValue());
                    }
                    entities.add(DrwBuilder.toDrw(map));
                }
            }
        }
        PsqlJdbc pj = new PsqlJdbc();
        pj.update(entities);
    }
}