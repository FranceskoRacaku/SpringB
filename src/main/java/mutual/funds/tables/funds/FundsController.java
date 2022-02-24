package mutual.funds.tables.funds;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "funds")

public class FundsController {

    private final FundsService fundsService;

    @Autowired
    public FundsController(FundsService fundsService){
        this.fundsService = fundsService;
    }

    @GetMapping
    public List<Funds> getFunds(){
        return fundsService.getFunds();

    }
}
