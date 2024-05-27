package OP;

public class EmailMsgListener implements EventListener {
	private final String email;
	
	public EmailMsgListener(String email)
	{
		this.email= email;
	}
	@Override
	public void update(Event eventType)
	{
	       if (eventType == Event.NEW_EVENT) {
	            System.out.println("There is a new event, check it out!");
	        } else if (eventType == Event.PROMOTE) {
	            System.out.println("Maximize participation, promote your event with Volunify. Join us!");
	        }
	}
	
	

}
