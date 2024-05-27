package BP;

public class Demo {
	public static void main(String[] args) {
        ReportFormat pdf = new PDFReportFormat();
        ReportFormat csv = new CSVReportFormat();

        Report financialReport = new FinancialReport(pdf);
        financialReport.generate();

        Report eventReport = new EventReport(csv);
        eventReport.generate();
    }
}
