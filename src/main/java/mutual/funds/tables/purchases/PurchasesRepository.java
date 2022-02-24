package mutual.funds.tables.purchases;

import mutual.funds.tables.funds.Funds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PurchasesRepository
        extends JpaRepository<Purchases, Integer> {
    List<Purchases> findAllById(Integer userId);

//    @Query("SELECT s FROM Purchases s WHERE s.userId = ?1")
//    Optional<Purchases> findPurchasesByUserId(String userId);
//
//    @Query("SELECT s FROM Purchases s WHERE s.fundId = ?1")
//    Optional<Purchases> findPurchasesByFundId(String fundId);
}
