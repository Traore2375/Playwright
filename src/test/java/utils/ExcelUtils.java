package utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.DataFormatter;

public class ExcelUtils {

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public static void setExcelFile(String path, String sheetName) throws Exception {

        FileInputStream fis = new FileInputStream(path);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetName);
    }

    public static String getCellData(int row, int col) {

        DataFormatter formatter = new DataFormatter();

        return formatter.formatCellValue(sheet.getRow(row).getCell(col));
    }
}