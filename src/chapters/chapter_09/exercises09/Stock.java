package chapters.chapter_09.exercises09;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;


    Stock(String newSymbol, String newName) {
        this.symbol = newSymbol;
        this.name = newName;
    }


    double getChangePercent() {
        return ((currentPrice - previousClosingPrice) /
                previousClosingPrice) * 100;
    }
}

