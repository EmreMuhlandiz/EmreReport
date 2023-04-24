package builder;

public class ParentProfileBuilder extends ProfileBuilder {
	public ParentProfileBuilder() {
		this.input = "parent profile";
	}

	@Override
	public ProfileBuilder addPost(String input) {
		return null;
	}

}
