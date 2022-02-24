package mutual.funds.tables.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsersService {

    private final UsersRepository usersRepository;

    @Autowired

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

//    public List<Users> getUsers(){
//        return List.of(
//                new Users(
//                        1,
//                        "test",
//                        "test@ok.com",
//                        6
//
//                )
//        );
//    }
}