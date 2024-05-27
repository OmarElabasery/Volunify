package AFP;
//Concrete Manufacturer
public class CsvReport extends SendFeedback{
	private String data;
	public CsvReport(String data) {
		this.data = data;
	}
	@Override 
	public VolunteerReport generateVReport() {
		return new CsvVReport(data);
	}
	@Override 
	public OrganizationReport generateOReport() {
		return new CsvOReport(data);
	}

}
