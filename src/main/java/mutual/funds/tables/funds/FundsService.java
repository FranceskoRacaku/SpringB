package mutual.funds.tables.funds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FundsService {

    private final FundsRepository fundsRepository;

    @Autowired

    public FundsService(FundsRepository fundsRepository) {
        this.fundsRepository = fundsRepository;
    }

    public List<Funds> getFunds() {
        return fundsRepository.findAll();
    }

//    public List<Funds> getFunds(){
//        return List.of(
//                new Funds(
//                        1,
//                        "test",
//                        "test1",
//                        "test2",
//                        "test3",
//                        "test4",
//                        "test5",
//                        "test6",
//                        "test7",
//                        "test8",
//                        "test9",
//                        "test10"
//
//                )
//        );
//    }
}
