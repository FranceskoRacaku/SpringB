package mutual.funds.tables.funds;

public class FundNotFoundException extends RuntimeException{

    FundNotFoundException(Integer id) {
        super("Could not find Fund" + id);
    }

}
