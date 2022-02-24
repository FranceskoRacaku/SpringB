package mutual.funds.tables.funds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.OptionPaneUI;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


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

    public void addFunds(Funds funds){
        Optional<Funds> fundsBySymbol = fundsRepository
                .findFundsBySymbol(funds.getSymbol());
        Optional<Funds> fundsByName = fundsRepository
                .findFundsByName(funds.getName());
        if(fundsBySymbol.isPresent()){
            throw new IllegalStateException("Symbol Taken");
        }
        else if(fundsByName.isPresent()){
            throw new IllegalStateException("Name Taken");
        }
        fundsRepository.save(funds);

    }

    public void deleteFund(Integer fundId) {
        boolean exists = fundsRepository.existsById(fundId);
        if (!exists){
            throw new IllegalStateException(
                    "Fund with id "+ fundId + " does not exists!!");
        }
        fundsRepository.deleteById(fundId);
    }


    @Transactional
    public void updateFund(Integer fundId, String symbol, String name, String inceptionDate, String categoryOne,
                           String categoryTwo, String categoryThree, String marketCap, String currentDividendYield,
                           String historicalAverageDividendYield, String everageFactor, String averageVolume,
                           String action) {
        Funds funds = fundsRepository.findById(fundId)
                .orElseThrow(() -> new IllegalStateException(
                        "fund with id " + fundId + " does no exist!!")
                );


        if(symbol != null &&
                symbol.length()> 0 &&
                !Objects.equals(funds.getSymbol(),symbol)){
            Optional<Funds> fundsOptional = fundsRepository
                    .findFundsBySymbol(symbol);
            if(fundsOptional.isPresent()){
                throw new IllegalStateException("Symbol Taken");
            }
            funds.setSymbol(symbol);
        }

        if(name != null &&
                name.length()> 0 &&
                !Objects.equals(funds.getName(),name)){
            Optional<Funds> fundsOptional = fundsRepository
                    .findFundsByName(name);
            if(fundsOptional.isPresent()){
                throw new IllegalStateException("Name Taken");
            }
            funds.setName(name);
        }


        if(inceptionDate != null &&
                inceptionDate.length()> 0 &&
                !Objects.equals(funds.getInceptionDate(),inceptionDate)){
            funds.setInceptionDate(inceptionDate);
        }

        if(categoryOne != null &&
                categoryOne.length()> 0 &&
                !Objects.equals(funds.getCategoryOne(),categoryOne)){
            funds.setCategoryOne(categoryOne);
        }

        if(categoryTwo != null &&
                categoryTwo.length()> 0 &&
                !Objects.equals(funds.getCategoryTwo(),categoryTwo)){
            funds.setCategoryTwo(categoryTwo);
        }

        if(categoryThree != null &&
                categoryThree.length()> 0 &&
                !Objects.equals(funds.getCategoryThree(),categoryThree)){
            funds.setCategoryThree(categoryThree);
        }

        if(marketCap != null &&
                marketCap.length()> 0 &&
                !Objects.equals(funds.getMarketCap(),marketCap)){
            funds.setMarketCap(marketCap);
        }

        if(currentDividendYield != null &&
                currentDividendYield.length()> 0 &&
                !Objects.equals(funds.getCurrentDividendYield(),currentDividendYield)){
            funds.setCurrentDividendYield(currentDividendYield);
        }


        if(historicalAverageDividendYield != null &&
                historicalAverageDividendYield.length()> 0 &&
                !Objects.equals(funds.getHistoricalAverageDividendYield(),historicalAverageDividendYield)){
            funds.setHistoricalAverageDividendYield(historicalAverageDividendYield);
        }


        if(everageFactor != null &&
                everageFactor.length()> 0 &&
                !Objects.equals(funds.getEverageFactor(),everageFactor)){
            funds.setEverageFactor(everageFactor);
        }


        if(averageVolume != null &&
                averageVolume.length()> 0 &&
                !Objects.equals(funds.getAverageVolume(),averageVolume)){
            funds.setAverageVolume(averageVolume);
        }


        if(action != null &&
                action.length()> 0 &&
                !Objects.equals(funds.getAction(),action)) {
            funds.setAction(action);
        }

    }

}
