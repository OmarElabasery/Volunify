package OP;

public class Application {
	private final NotificationService notificationService;
	public Application() {
		notificationService = new NotificationService();
	}
	public void newNotification(Event eventType) {
		Event newEvent= eventType;
		notificationService.notifyListeners(newEvent);
	}
	public NotificationService getService() {
		return notificationService;
	}

}
 