package builder;

import java.util.ArrayList;
import java.util.List;

public class Profile {
	String name;
	List<Post> posts = new ArrayList<Post>();

	public void setName(String name) {
		this.name = name;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + this.name + " ----\n");
		for (Post a : posts) {
			display.append(a);
		}
		return display.toString();
	}
}

 
 
