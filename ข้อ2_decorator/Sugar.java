//นาย กิติภูมิ หน่อเนื้อ
public class Sugar implements Beverage {

    private Beverage beverage; 

    public Sugar(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return beverage.getCost() + 1;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + "sugar ";
    }
    
}
