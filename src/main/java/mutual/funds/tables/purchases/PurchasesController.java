package mutual.funds.tables.purchases;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "purchases")

public class PurchasesController {

    private final PurchasesService purchasesService;

    @Autowired
    public PurchasesController(PurchasesService purchasesService){
        this.purchasesService = purchasesService;
    }

    @GetMapping
    public List<Purchases> getPurchases(){
        return purchasesService.getPurchases();
    }

    @PostMapping
    public void addPurchase(@RequestBody Purchases purchases) {
        purchasesService.addPurchase(purchases);
    }


    @DeleteMapping(path = "{purchaseId}")
    public void deletePurchase(@PathVariable("purchaseId") Integer purchaseId) {
        purchasesService.deletePurchase(purchaseId);
    }

    @PutMapping(path = "{purchaseId}")
    public void updatePurchase(
            @PathVariable("purchaseId") Integer purchaseId,
            @RequestParam(required = false) Float amount,
            @RequestParam(required = false) Integer fundId,
            @RequestParam(required = false) Integer userId){
        purchasesService.updatePurchase(purchaseId, amount, fundId, userId);
    }
}
