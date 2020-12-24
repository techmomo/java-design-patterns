package layered;

public class LayeredApp {
    public static void main(String[] args) {
        UserController controller = new UserController();
        String response = controller.saveUser(new User());
        System.out.println(response);
    }
}
