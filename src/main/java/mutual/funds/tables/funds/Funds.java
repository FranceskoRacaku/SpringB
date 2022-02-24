package mutual.funds.tables.funds;

import javax.persistence.*;


@Entity
@Table
public class Funds {
    @Id
    @SequenceGenerator(
            name = "funds_sequence",
            sequenceName = "funds_sequence",
            allocationSize = 1
    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "funds_sequence"
//    )
    private Integer id;
    private String symbol;
    private String name;
    private String inceptionDate;
    private String categoryOne;
    private String categoryTwo;
    private String categoryThree;
    private String marketCap;
    private String currentDividendYield;
    private String historicalAverageDividendYield;
    private String everageFactor;
    private String averageVolume;
    private String action;


    public Funds() {
    }

    public Funds(Integer id,
                 String symbol,
                 String name,
                 String inceptionDate,
                 String categoryOne,
                 String categoryTwo,
                 String categoryThree,
                 String marketCap,
                 String currentDividendYield,
                 String historicalAverageDividendYield,
                 String everageFactor,
                 String averageVolume,
                 String action) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.inceptionDate = inceptionDate;
        this.categoryOne = categoryOne;
        this.categoryTwo = categoryTwo;
        this.categoryThree = categoryThree;
        this.marketCap = marketCap;
        this.currentDividendYield = currentDividendYield;
        this.historicalAverageDividendYield = historicalAverageDividendYield;
        this.everageFactor = everageFactor;
        this.averageVolume = averageVolume;
        this.action = action;
    }

    public Funds(String symbol,
                 String name,
                 String inceptionDate,
                 String categoryOne,
                 String categoryTwo,
                 String categoryThree,
                 String marketCap,
                 String currentDividendYield,
                 String historicalAverageDividendYield,
                 String everageFactor,
                 String averageVolume,
                 String action) {
        this.symbol = symbol;
        this.name = name;
        this.inceptionDate = inceptionDate;
        this.categoryOne = categoryOne;
        this.categoryTwo = categoryTwo;
        this.categoryThree = categoryThree;
        this.marketCap = marketCap;
        this.currentDividendYield = currentDividendYield;
        this.historicalAverageDividendYield = historicalAverageDividendYield;
        this.everageFactor = everageFactor;
        this.averageVolume = averageVolume;
        this.action = action;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInceptionDate() {
        return inceptionDate;
    }

    public void setInceptionDate(String inceptionDate) {
        this.inceptionDate = inceptionDate;
    }

    public String getCategoryOne() {
        return categoryOne;
    }

    public void setCategoryOne(String categoryOne) {
        this.categoryOne = categoryOne;
    }

    public String getCategoryTwo() {
        return categoryTwo;
    }

    public void setCategoryTwo(String categoryTwo) {
        this.categoryTwo = categoryTwo;
    }

    public String getCategoryThree() {
        return categoryThree;
    }

    public void setCategoryThree(String categoryThree) {
        this.categoryThree = categoryThree;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    public String getCurrentDividendYield() {
        return currentDividendYield;
    }

    public void setCurrentDividendYield(String currentDividendYield) {
        this.currentDividendYield = currentDividendYield;
    }

    public String getHistoricalAverageDividendYield() {
        return historicalAverageDividendYield;
    }

    public void setHistoricalAverageDividendYield(String historicalAverageDividendYield) {
        this.historicalAverageDividendYield = historicalAverageDividendYield;
    }

    public String getEverageFactor() {
        return everageFactor;
    }

    public void setEverageFactor(String everageFactor) {
        this.everageFactor = everageFactor;
    }

    public String getAverageVolume() {
        return averageVolume;
    }

    public void setAverageVolume(String averageVolume) {
        this.averageVolume = averageVolume;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Funds{" +
                "id=" + id +
                ", symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", inceptionDate='" + inceptionDate + '\'' +
                ", categoryOne='" + categoryOne + '\'' +
                ", categoryTwo='" + categoryTwo + '\'' +
                ", categoryThree='" + categoryThree + '\'' +
                ", marketCap='" + marketCap + '\'' +
                ", currentDividendYield='" + currentDividendYield + '\'' +
                ", historicalAverageDividendYield='" + historicalAverageDividendYield + '\'' +
                ", everageFactor='" + everageFactor + '\'' +
                ", averageVolume='" + averageVolume + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
