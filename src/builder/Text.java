package builder;

public class Text extends Post {
	int id;
	public Text() {
		this.link = "https:/...";
	}
	public Text(String link) {
		this.link = link;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	@Override
	public String getLink() {
		return null;
	}
}
