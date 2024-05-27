package AFP;

import java.io.FileWriter;
import java.io.IOException;

public class CsvOReport implements OrganizationReport {
	
	private String reportData; //The organization's report
    public CsvOReport(String reportData) {
        this.reportData = reportData;
        //System.out.println("hello");
        //export();
    }
    
	
	
	@Override
	public
	void export(){
		String csvData = convertToCsv(reportData);
        saveToCsvFile(csvData, "OrganizationReport.csv");
		
	}
    /*private String convertToCsv(String data) {
        // Assuming the data is in some structured format. For simplicity, 
        // we'll split by lines and commas. This part can be customized 
        // based on actual data format.
        
        StringBuilder csvBuilder = new StringBuilder();
        String[] lines = data.split("\n");

        for (String line : lines) {
            String[] columns = line.split(",");
            for (int i = 0; i < columns.length; i++) {
                csvBuilder.append(columns[i].trim());
                if (i < columns.length - 1) {
                    csvBuilder.append(",");
                }
            }
            csvBuilder.append("\n");
        }

        return csvBuilder.toString();
    }*/
	private String convertToCsv(String data) {
        StringBuilder csvBuilder = new StringBuilder();
        
        // Add the CSV headers
        csvBuilder.append("Event,Date,Total Volunteers Participated,Percentage of Satisfied Volunteers,Percentage of Unsatisfied Volunteers\n");
        
        // Extract the relevant data from the report
        String event = extractData(data, "Event");
        String date = extractData(data, "Date");
        String totalVolunteers = extractData(data, "Total Volunteers Participated");
        String percentageSatisfied = extractData(data, "Percentage of Satisfied Volunteers");
        String percentageUnsatisfied = extractData(data, "Percentage of Unsatisfied Volunteers");
        
        // Add the extracted data as a CSV row
        csvBuilder.append(event).append(",")
                  .append(date).append(",")
                  .append(totalVolunteers).append(",")
                  .append(percentageSatisfied).append(",")
                  .append(percentageUnsatisfied).append("\n");

        return csvBuilder.toString();
    }

    private String extractData(String data, String fieldName) {
        String[] lines = data.split("\n");
        for (String line : lines) {
            if (line.startsWith(fieldName)) {
                return line.split(":")[1].trim();
            }
        }
        return "";
    }
    private void saveToCsvFile(String csvData, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(csvData);
            System.out.println("CSV file saved successfully: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	

}