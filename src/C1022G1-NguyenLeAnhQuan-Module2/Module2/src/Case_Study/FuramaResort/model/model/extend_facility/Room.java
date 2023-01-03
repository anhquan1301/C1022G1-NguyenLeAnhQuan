package Case_Study.FuramaResort.model.model.extend_facility;

import Case_Study.FuramaResort.model.model.Facility;

public class Room extends Facility {
    String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceCode, String name, String area, String price, String maxPeople, String typeRent, String freeService) {
        super(serviceCode, name, area, price, maxPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                ", freeService='" + freeService + '\'' +
                "} ";
    }
    public String formatRoomCSV(){
       final String COMMA = ",";
        return super.convertLineFacility()+COMMA+this.freeService;
    }
}
