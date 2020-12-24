package layered;

import layered.impl.UserService;

public class UserController {


    public String saveUser(User user){
        Service service = new UserService();
        service.save(user);
        return "User Saved!";
    }
}
