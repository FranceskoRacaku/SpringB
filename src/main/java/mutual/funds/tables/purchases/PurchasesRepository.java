package mutual.funds.tables.purchases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchasesRepository
        extends JpaRepository<Purchases, Integer> {
}
