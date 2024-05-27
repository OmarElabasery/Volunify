package OP;

public class Demo {
	public static void main(String args[])
	{
		//Creating a volunteer subscriber 
		Application application= new Application();
		Event newEvent= Event.NEW_EVENT;
		application.getService().subscribe(newEvent, new EmailMsgListener("volunteer1@gmail.com"));
		//application.getService().subscribe(newEvent, new EmailMsgListener("volunteer2@gmail.com"));
		//Notifying the volunteer of a new event
		application.newNotification(newEvent);
		
	}

}
