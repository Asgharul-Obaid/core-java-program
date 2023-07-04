package readFile;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatabaseToExcelExporter {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT id, name, age, number FROM your_table_name";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                // Create a new workbook
                XSSFWorkbook workbook = new XSSFWorkbook();
                // Create a new sheet
                org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet("Data");

                int rowNum = 0;
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    String number = resultSet.getString("number");

                    // Create a new row in the sheet
                    Row row = sheet.createRow(rowNum++);

                    // Create cells and set values
                    Cell idCell = row.createCell(0);
                    idCell.setCellValue(id);

                    Cell nameCell = row.createCell(1);
                    nameCell.setCellValue(name);

                    Cell ageCell = row.createCell(2);
                    ageCell.setCellValue(age);

                    Cell numberCell = row.createCell(3);
                    numberCell.setCellValue(number);
                }

                // Write the workbook to a file
                FileOutputStream outputStream = new FileOutputStream("data.xlsx");
                workbook.write(outputStream);
                workbook.close();

                System.out.println("Data exported successfully!");

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
