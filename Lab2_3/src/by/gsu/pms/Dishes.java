package by.gsu.pms;

public abstract class Dishes implements Write {
    private String manufacturer;
    private int price;
    private String style;

    public Dishes(String manufacturer, int price, String style) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.style = style;
    }

    public Dishes(String manufacturer, int price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public Dishes() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    protected String fieldsToString() {
        return manufacturer+";"+price+";"+style;
    }
    @Override
    public void writeInfo() {
        System.out.println("Dishes:"+fieldsToString());
    }


}
