package ReportDecorator;

public class FullAcces extends UserDecorator {
	public FullAcces(User user) {
		this.user = user;
	}
 
	public String getName() {
		return user.getName();
	}
 
	public boolean acces() {
		return user.acces();
	}

	public String administration() {
		return "administration";
	}
}
