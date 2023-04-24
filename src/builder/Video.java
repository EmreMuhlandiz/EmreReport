package builder;

public class Video extends Post {
	int id;
	public Video() {
		this.link = "https:/...";
	}
	public Video(String link) {
		this.link = link;
	}
	public void setId(int n) {
		this.id = n;
	}
	public int getId() {
		return this.id;
	}
	public String getLink() {
		return "link " + this.link;
	}
}
