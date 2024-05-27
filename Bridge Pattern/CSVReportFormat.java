package BP;

public class CSVReportFormat implements ReportFormat {

	@Override
    public void generate(String content) {
        System.out.println("Generating CSV Report: " + content);
    }

}
