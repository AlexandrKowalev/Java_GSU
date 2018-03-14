package by.gsu.pms;
public class DishesPan extends Dishes {
    private double amount;
    private boolean cap;

    public DishesPan(String manufacturer, int price, String style, double amount, boolean cap) {
        super(manufacturer, price, style);
        this.amount = amount;
        this.cap = cap;
    }

    public DishesPan(String manufacturer, int price, double amount, boolean cap) {
        super(manufacturer, price);
        this.amount = amount;
        this.cap = cap;
    }

    public DishesPan() {
    }

    @Override
    protected String fieldsToString() {
        return super.fieldsToString()+";"+amount+';'+cap;
    }
    @Override
    public void writeInfo() {
        System.out.println("Pan:"+fieldsToString());
    }

    }


