package by.gsu.pms;
public class DishesPlate extends Dishes {
    private double diameter;

    public DishesPlate(String manufacturer, int price, String style, double diameter) {
        super(manufacturer, price, style);
        this.diameter = diameter;
    }

    public DishesPlate(String manufacturer, int price, double diameter) {
        super(manufacturer, price);
        this.diameter = diameter;
    }

    public DishesPlate() {
    }

    @Override
    protected String WriterInfo() {
        return "Plate";
    }

    @Override
    protected String fieldsToString() {
        return super.fieldsToString()+";"+diameter;
    }
    @Override
    public String toString() {
        return WriterInfo()+": "+fieldsToString();
    }

}

