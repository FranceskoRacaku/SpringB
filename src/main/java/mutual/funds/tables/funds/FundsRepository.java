package mutual.funds.tables.funds;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundsRepository
        extends JpaRepository<Funds, Integer> {
}
