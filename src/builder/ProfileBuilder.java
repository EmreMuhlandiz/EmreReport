package builder;

import java.util.ArrayList;
import java.util.List;

public abstract class ProfileBuilder {
	String input;
	List<Post> posts = new ArrayList<Post>();

	public abstract ProfileBuilder addPost(String input);

	public Profile getProfile() {
		Profile profile = new Profile();
		profile.setName(input);
		profile.setPosts(posts);
		return profile;
	}
}
