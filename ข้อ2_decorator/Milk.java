//นาย กิติภูมิ หน่อเนื้อ
public class Milk implements Beverage{

    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return beverage.getCost() + 3;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + "milk ";
    }
    
}
