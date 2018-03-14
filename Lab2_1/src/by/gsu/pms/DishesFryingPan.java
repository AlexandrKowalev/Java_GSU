package by.gsu.pms;
public class DishesFryingPan extends Dishes {
    private double hanndleLength;
    private String coating;

    public DishesFryingPan(String manufacturer, int price, String style, double hanndleLength, String coating) {
        super(manufacturer, price, style);
        this.hanndleLength = hanndleLength;
        this.coating = coating;
    }

    public DishesFryingPan(String manufacturer, int price, String style, String coating) {
        super(manufacturer, price, style);
        this.coating = coating;
    }

    public DishesFryingPan() {
    }

    public double getHanndleLength() {
        return hanndleLength;
    }

    public void setHanndleLength(double hanndleLength) {
        this.hanndleLength = hanndleLength;
    }

    public String getCoating() {
        return coating;
    }

    public void setCoating(String coating) {
        this.coating = coating;
    }

    @Override
    protected String WriterInfo() {
        return "Frying Pan";
    }

    @Override
    protected String fieldsToString() {
        return super.fieldsToString()+";"+hanndleLength+';'+coating;
    }

    @Override
    public String toString() {
        return WriterInfo()+": "+fieldsToString();
    }

}

