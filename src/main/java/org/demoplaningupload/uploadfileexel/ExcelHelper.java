package org.demoplaningupload.uploadfileexel;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.demoplaningupload.model.Mois;
import org.demoplaningupload.model.Planing;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ExcelHelper {

    private ExcelHelper(){}
    public static final String  TYPE = "application/vnd.malformations-office document.spreadsheetml.sheet";
    static String[] headers = new String[]{"Id", "Sites", "janv-22","S5", "Feb2022", "mars-22", "apr-22", "may-22",
            "S6", "S22", "Juin-22", "Juil-22", "Aug2022", "S35", "Sep-22", "Oct-22","S44", "Nov-22", "Dec2022"};
    static String sheeet = "planing";

    public static boolean hasExcelFormat(MultipartFile file) {
        return !TYPE.equals(file.getContentType());
    }



    public static List<Planing> excelToPlaning(InputStream is)  {
        try {
            Workbook workbook = new XSSFWorkbook(is);
            Sheet sheet = workbook.getSheet(sheeet);
            Iterator<Row> rows = sheet.iterator();
            List<Planing> planings = new ArrayList<>();
            int rowNumber = 2;
            while (rows.hasNext()) {
                Row currentRow = rows.next();
                // skip header
                if (rowNumber == 2) {
                    rowNumber++;
                    continue;
                }
                Iterator<Cell> cellsInRow = currentRow.iterator();

                Planing planing = new Planing();

                int cellIdx;
                cellIdx = 0;

                while (cellsInRow.hasNext()) {

                    Cell currentCell = cellsInRow.next();
                    Mois mois = new Mois();
                    mois.setS1(currentCell.getStringCellValue());
                    mois.setS2(currentCell.getStringCellValue());
                    mois.setS3(currentCell.getStringCellValue());
                    mois.setS4(currentCell.getStringCellValue());

                    switch (cellIdx) {

                        case 0:
                            System.out.println("==================================================");
                            System.out.println(currentCell.getStringCellValue());
                            planing.setSites(currentCell.getStringCellValue());

                            break;
                        case 1:
                            System.out.println(currentCell.getStringCellValue());
                            planing.setJanv22(mois);
                            break;
                        case 2:
                            System.out.println(currentCell.getStringCellValue());
                            planing.setS5(currentCell.getStringCellValue()); ;
                            break;
                        case 3:
                            System.out.println(currentCell.getStringCellValue());
                            planing.setFeb22(mois) ;
                            break;
                            case 4:
                        System.out.println(currentCell.getStringCellValue());
                        planing.setMars22(mois);
                        break;
                        case 5:
                            System.out.println(currentCell.getStringCellValue());
                            planing.setApr2022(mois);
                            break;
                        case 6:
                            System.out.println(currentCell.getStringCellValue());
                            planing.setMay2022(mois);
                            break;
                        case 7:
                            System.out.println(currentCell.getStringCellValue());
                            planing.setS22(currentCell.getStringCellValue());
                            break;
                        case 8:
                            System.out.println(currentCell.getStringCellValue());
                            planing.setJui22(mois);
                            break;
                        case 9:
                            System.out.println(currentCell.getStringCellValue());
                            planing.setJuil22(mois);
                            break;
                        case 10:
                            System.out.println(currentCell.getStringCellValue());
                            planing.setAug22(mois);
                            break;
                        case 11:
                            System.out.println(currentCell.getStringCellValue());
                            planing.setS35(currentCell.getStringCellValue()); ;
                            break;
                        case 12:
                            System.out.println(currentCell.getStringCellValue());
                            planing.setSep22(mois);
                            break;
                        case 13:
                            System.out.println(currentCell.getStringCellValue());
                            planing.setOct22(mois);
                            break;
                        case 14:
                            System.out.println(currentCell.getStringCellValue());
                            planing.setS44(currentCell.getStringCellValue()); ;
                            break;
                        case 15:
                            System.out.println(currentCell.getStringCellValue());
                            planing.setNov22(mois);
                            break;
                        case 16:
                            System.out.println(currentCell.getStringCellValue());
                            planing.setDec22(mois);
                            break;


                        default:
                            break;
                    }
                    cellIdx++;
                }
                planings.add(planing);
            }
            workbook.close();
            return planings;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
        }
    }

}


