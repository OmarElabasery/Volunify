package BP;

public class EventReport extends Report{
	public EventReport(ReportFormat format) {
        super(format);
    }

    @Override
    public void generate() {
        String content = "Event Report Content";
        System.out.println("Generating Event Report");
        format.generate(content);
    }
}
