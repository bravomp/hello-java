public class HardCodedPW {
    static String password = "mypassword";
    public static String LoginUser(String user, String password) {
        System.out.println("It's a password");
        return null;
    }
    public static void main(String [] args) {
        String pw = LoginUser("user", password );
    }
}
