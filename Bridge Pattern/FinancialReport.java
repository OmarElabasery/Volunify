package BP;

public class FinancialReport extends Report {
	public FinancialReport(ReportFormat format) {
        super(format);
    }

    @Override
    public void generate() {
        String content = "Financial Report Content";
        System.out.println("Generating Financial Report");
        format.generate(content);
    }
}
