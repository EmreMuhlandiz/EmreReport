package ReportDecorator;

public class GuardianAcces extends UserDecorator {
	public GuardianAcces(User user) {
		this.user = user;
	}

	public String getName() {
		return user.getName();
	}

	public boolean acces() {
		return false;
	}

	public String protection() {
		return "protection";
	}
}
