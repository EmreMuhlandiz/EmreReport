package ReportDecorator;

public class Admin extends User {
  
	public Admin() {
		name = "Admin";
	}
  
	public boolean acces() {
		return true;
	}
}

