package ReportDecorator;

public abstract class User {
	String name = "Name";
  
	public String getName() {
		return name;
	}
 
	public abstract boolean acces();
}
