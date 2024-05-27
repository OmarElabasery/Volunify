package BP;

public class PDFReportFormat implements ReportFormat {

	@Override
	public void generate(String content) {
        System.out.println("Generating PDF Report: " + content);
    }

}
