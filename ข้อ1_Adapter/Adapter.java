public class Adapter implements CSVParser {
    private StockMarketDataParser stockMarketDataParser;

    public Adapter(StockMarketDataParser stockMarketDataParser) {
        this.stockMarketDataParser = stockMarketDataParser;
    }

    @Override
    public void parseCSV() {
        stockMarketDataParser.parseFromCSV();
    }
}
