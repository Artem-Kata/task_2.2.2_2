package web.models;

public class Car {

    private int id;
    private String model;
    private String marka;


    public Car(int id, String marka, String model) {
        this.id = id;
        this.marka = marka;
        this.model = model;

    }

    public String getModel() {return model;}

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
