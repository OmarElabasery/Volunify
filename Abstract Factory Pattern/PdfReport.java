package AFP;
//Concrete Manufacturer
public class PdfReport extends SendFeedback {
	@Override 
	public VolunteerReport generateVReport() {
		return new PdfVReport();
	}
	@Override 
	public OrganizationReport generateOReport() {
		return new PdfOReport();
	}
	

}
