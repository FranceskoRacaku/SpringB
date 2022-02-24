package mutual.funds.tables.funds;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "funds")

public class FundsController {

    private FundsRepository fundsRepository;
    private final FundsService fundsService;

    @Autowired
    public FundsController(FundsService fundsService) {
        this.fundsService = fundsService;
    }

    @GetMapping
    public List<Funds> getFunds() {
        return fundsService.getFunds();

    }

    @GetMapping("{id}")
    Funds fund(@PathVariable Integer id){
        return fundsRepository.findById(id)
                .orElseThrow(() -> new FundNotFoundException(id));
    }

    @PostMapping
    public void addFund(@RequestBody Funds funds) {
        fundsService.addFunds(funds);
    }


    @DeleteMapping(path = "{fundId}")
    public void deleteFund(@PathVariable("fundId") Integer fundId) {
        fundsService.deleteFund(fundId);
    }

    @PutMapping(path = "{fundId}")
    public void updateFund(
            @PathVariable("fundId") Integer fundId,
            @RequestParam(required = false) String symbol,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String inceptionDate,
            @RequestParam(required = false) String categoryOne,
            @RequestParam(required = false) String categoryTwo,
            @RequestParam(required = false) String categoryThree,
            @RequestParam(required = false) String marketCap,
            @RequestParam(required = false) String currentDividendYield,
            @RequestParam(required = false) String historicalAverageDividendYield,
            @RequestParam(required = false) String everageFactor,
            @RequestParam(required = false) String averageVolume,
            @RequestParam(required = false) String action){
        fundsService.updateFund(fundId, symbol, name, inceptionDate, categoryOne, categoryTwo, categoryThree,
                marketCap, currentDividendYield, historicalAverageDividendYield,everageFactor,averageVolume,action);
    }

}
