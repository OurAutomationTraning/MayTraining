package io_Operartions;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelUtils {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        File file = new File("Files/Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));
        XSSFSheet sheet = workbook.getSheet("Sheet1");//To get the specific sheet
        int lastRowNum = sheet.getLastRowNum();//To get the number of rows present
        for (int i = 0; i <= lastRowNum; i++) {
            Row row = sheet.getRow(i);
            int lastCellNum = row.getLastCellNum();
            System.out.println();
            for (int j = 0; j < lastCellNum; j++) {
                Cell cell = row.getCell(j);
                CellType cellType = cell.getCellType();
                switch (cellType) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + " ");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + " ");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + " ");
                        break;
                }
            }
        }

        if (workbook.getSheet("Writing") != null) {
            int writingSheetIndex = workbook.getSheetIndex("Writing");
            workbook.removeSheetAt(writingSheetIndex);
        }
        XSSFSheet writingSheet = workbook.createSheet("Writing");
        for (int i = 0; i < 10; i++) {
            Row row = writingSheet.createRow(i);
            for (int j = 0; j < 4; j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue(i + "" + j);
            }
        }

        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(file);
            workbook.write(fout);
        } catch (FileNotFoundException e) {

        } finally {
            fout.close();
            workbook.close();
        }
    }
}
