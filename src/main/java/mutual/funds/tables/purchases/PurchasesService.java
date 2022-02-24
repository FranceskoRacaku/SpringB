package mutual.funds.tables.purchases;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PurchasesService {

    private final PurchasesRepository purchasesRepository;

    @Autowired

    public PurchasesService(PurchasesRepository purchasesRepository) {
        this.purchasesRepository = purchasesRepository;
    }

    public List<Purchases> getPurchases() {
        return purchasesRepository.findAll();
    }
//    public List<Purchases> getPurchases(){
//        return List.of(
//                new Purchases(
//                        1,
//                        3F,
//                        4,
//                        6
//
//                )
//        );
//    }
}
