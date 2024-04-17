package com.evs.vtiger.testScript;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public static Map<String, String> readTestData(String filePath, String sheetName, String testCaseName) {
        Map<String, String> testData = new HashMap<>();

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            Sheet sheet = workbook.getSheet(sheetName);

            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

            int testCaseRow = -1;
            Row headerRow = sheet.getRow(0);

            for (int row = 1; row < rowCount; row++) {
                Row currentRow = sheet.getRow(row);
                Cell testCaseCell = currentRow.getCell(0);

                if (testCaseCell.getStringCellValue().equals(testCaseName)) {
                    testCaseRow = row;
                    break;
                }
            }

            if (testCaseRow != -1) {
                for (int col = 0; col < colCount; col++) {
                    Cell headerCell = headerRow.getCell(col);
                    Cell dataCell = sheet.getRow(testCaseRow).getCell(col);

                    testData.put(headerCell.getStringCellValue(), dataCell.getStringCellValue());
                }
            } else {
                System.out.println("Test case not found in the Excel sheet.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return testData;
	}

}
