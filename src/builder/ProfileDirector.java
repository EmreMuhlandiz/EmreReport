package builder;

public class ProfileDirector {
    public static void main(String[] args) {
        ProfileBuilder adminProfileBuilder = new AdminProfileBuilder();
        Profile adminProfile = adminProfileBuilder
                .addPost("").getProfile();
        System.out.println(adminProfile);

        ProfileBuilder parentProfileBuilder = new ParentProfileBuilder();
        Profile parentProfile = parentProfileBuilder
                .addPost("").getProfile();
        System.out.println(parentProfile);
    }
}
