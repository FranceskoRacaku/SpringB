package mutual.funds.tables.purchases;


import mutual.funds.tables.funds.Funds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
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

    @GetMapping(path = "{id}")
    public Optional<Purchases> getPurchase(@PathVariable Integer id){
        return purchasesService.getPurchase(id);
    }

    @GetMapping(path = "user/{userId}")
    public Optional<Purchases> getPurchaseByUserId(@PathVariable Integer userId){
        return purchasesService.getPurchase(userId);
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
