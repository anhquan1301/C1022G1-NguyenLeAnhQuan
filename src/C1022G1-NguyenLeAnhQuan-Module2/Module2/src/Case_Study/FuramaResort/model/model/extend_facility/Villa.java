package Case_Study.FuramaResort.model.model.extend_facility;

import Case_Study.FuramaResort.model.model.Facility;

public

class Villa extends Facility {
    String quality;
    String areaPool;
    String numberFloors;

    public Villa() {
    }

    public Villa(String quality, String areaPool, String numberFloors) {
        this.quality = quality;
        this.areaPool = areaPool;
        this.numberFloors = numberFloors;
    }

    public Villa(String serviceCode, String name, String area, String price, String maxPeople,
                 String typeRent, String quality, String areaPool, String numberFloors) {
        super(serviceCode, name, area, price, maxPeople, typeRent);
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

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }

    public String getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(String numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                ", quality='" + quality + '\'' +
                ", areaPool='" + areaPool + '\'' +
                ", numberFloors='" + numberFloors + '\'' +
                "} ";
    }
    public String formatCSVVilla(){
       final String COMMA = ",";
        return super.convertLineFacility()+COMMA+this.quality+COMMA+areaPool+COMMA+numberFloors;

    }
}
