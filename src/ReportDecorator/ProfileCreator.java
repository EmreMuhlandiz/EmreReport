package ReportDecorator;

public class ProfileCreator {
    public static void main(String args[]) {
        User kid = new Child();
        kid = new RestrictedAcces(kid);
        kid = new FullAcces(kid);
        kid = new GuardianAcces(kid);
        System.out.println(kid.getName() + ' ' + kid.acces());
    }
}
