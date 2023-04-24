package ReportDecorator;

public class RestrictedAcces extends UserDecorator {
	public RestrictedAcces(User user) {
		this.user = user;
	}

	public String getName() {
		return user.getName();
	}

	public boolean acces() {
		return false;
	}
}
