package mutual.funds.tables.users;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "users")

public class UsersController {

    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService){
        this.usersService = usersService;
    }

    @GetMapping
    public List<Users> getUsers(){
        return usersService.getUsers();

    }

    @PostMapping
    public void addUsers(@RequestBody Users users) {
        usersService.addUsers(users);
    }


    @DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId") Integer userId) {
        usersService.deleteUser(userId);
    }

    @PutMapping(path = "{userId}")
    public void updateUser(
            @PathVariable("userId") Integer userId,
            @RequestParam(required = false) String userName,
            @RequestParam(required = false) String userEmail,
            @RequestParam(required = false) Integer userAge){
        usersService.updateUser(userId, userName, userEmail, userAge);
    }
}