package mutual.funds.tables.funds;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FundsRepository
        extends JpaRepository<Funds, Integer> {


    @Query("SELECT s FROM Funds s WHERE s.symbol = ?1")
    Optional<Funds> findFundsBySymbol(String symbol);

    @Query("SELECT s FROM Funds s WHERE s.name = ?1")
    Optional<Funds> findFundsByName(String name);
}
