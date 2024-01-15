//64050030 นาย กิติภูมิ หน่อเนื้อ
public class App {

	public static void main(String[] args) {
		
		CSVParser realEstate = new RealEstateMarketDataParser();
		CSVParser machineLearning = new MachineLearningDataParser();
		CSVParser stockMartket = new Adapter(new StockMarketDataParser());
		 
		parse(realEstate);
		parse(machineLearning);
		parse(stockMartket);
		
	}
	public static void parse(CSVParser parser) {
		parser.parseCSV();
	}
}
