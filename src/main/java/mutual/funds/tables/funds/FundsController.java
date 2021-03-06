package mutual.funds.tables.funds;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
// @CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://springfrontend.herokuapp.com")
@RequestMapping(path = "funds")

public class FundsController {

    private final FundsService fundsService;

    @Autowired
    public FundsController(FundsService fundsService) {
        this.fundsService = fundsService;
    }

    @GetMapping
    public List<Funds> getFunds() {
        return fundsService.getFunds();

    }

    @GetMapping(path = "{id}")
    public Optional<Funds> getFund(@PathVariable Integer id){
        return fundsService.getFund(id);
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
