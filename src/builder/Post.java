package builder;

public abstract class Post {
	String link;
	Type type = null;
	
	public void setType(Type type) {
		this.type = type;
	}
	public Type getType() {
		return this.type;
	}
	public abstract String getLink();
	public String toString() {
		return "Go to " + link + "\n";
	}
}
