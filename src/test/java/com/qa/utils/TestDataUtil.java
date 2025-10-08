package com.qa.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDataUtil {

    public static List<String[]> getLoginData(String filePath) throws IOException {
        List<String[]> data = new ArrayList<>();
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
            Cell emailCell = row.getCell(0);
            Cell passwordCell = row.getCell(1);
            if (emailCell != null && passwordCell != null) {
                data.add(new String[]{
                        emailCell.getStringCellValue(),
                        passwordCell.getStringCellValue()
                });
            }
        }
        workbook.close();
        return data;
    }
}
