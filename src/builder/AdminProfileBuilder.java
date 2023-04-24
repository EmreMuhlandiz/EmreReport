package builder;

public class AdminProfileBuilder extends ProfileBuilder {
	public AdminProfileBuilder() {
		this.input = "admin profle";
	}

	@Override
	public ProfileBuilder addPost(String input) {
		this.posts.add(new Text());
		return this;
	}
}
