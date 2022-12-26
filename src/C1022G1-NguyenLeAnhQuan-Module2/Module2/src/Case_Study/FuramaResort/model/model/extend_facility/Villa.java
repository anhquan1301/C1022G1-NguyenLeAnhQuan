package Case_Study.FuramaResort.model.model.extend_facility;

import Case_Study.FuramaResort.model.model.Facility;

public

class Villa extends Facility {
    String quality;
    double areaPool;
    int numberFloors;

    public Villa() {
    }

    public Villa(String quality, double areaPool, int numberFloors) {
        this.quality = quality;
        this.areaPool = areaPool;
        this.numberFloors = numberFloors;
    }

    public Villa(String name, double area, int price, int maxPeople, String typeRent, String quality, double areaPool, int numberFloors) {
        super(name, area, price, maxPeople, typeRent);
        this.quality = quality;
        this.areaPool = areaPool;
        this.numberFloors = numberFloors;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "quality='" + quality + '\'' +
                ", areaPool=" + areaPool +
                ", numberFloors=" + numberFloors +
                "} " + super.toString();
    }
}
