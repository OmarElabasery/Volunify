package AFP;

public class Demo {
	public static void main(String args[]) {
		String OReport= "Feedback Report\n" +
                "-----------------\n" +
                "Event: Annual Charity Run\n" +
                "Date: May 25, 2024\n\n" +
                "Total Volunteers Participated: 150\n" +
                "Percentage of Satisfied Volunteers: 85%\n" +
                "Percentage of Unsatisfied Volunteers: 15%\n\n" ;
		SendFeedback trialReport = new CsvReport(OReport);
		OrganizationReport CsvOReport= trialReport.generateOReport();
		CsvOReport.export();
		//System.out.println("hello");
		
		
		
		
	}
	
	

}
