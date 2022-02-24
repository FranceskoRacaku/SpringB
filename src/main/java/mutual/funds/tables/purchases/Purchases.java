package mutual.funds.tables.purchases;

import javax.persistence.*;


@Entity
@Table
public class Purchases {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Float amount;
    private Integer fundId;
    private Integer userId;


    public Purchases() {
    }

    public Purchases(Integer id,
                     Float amount,
                     Integer fundId,
                     Integer userId ) {
        this.id = id;
        this.amount = amount;
        this.fundId = fundId;
        this.userId = userId;
    }

    public Purchases(Float amount,
                     Integer fundId,
                     Integer userId ) {
        this.amount = amount;
        this.fundId = fundId;
        this.userId = userId;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Integer getFundId() {
        return fundId;
    }

    public void setFundId(Integer fundId) {
        this.fundId = fundId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    @Override
    public String toString() {
        return "Purchases{" +
                "id=" + id +
                ", amount='" + amount + '\'' +
                ", fundId='" + fundId + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
