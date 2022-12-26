package Case_Study.FuramaResort.model.model.extend_facility;

import Case_Study.FuramaResort.model.model.Facility;

public class Room extends Facility {
    String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String name, double area, int price, int maxPeople, String typeRent, String freeService) {
        super(name, area, price, maxPeople, typeRent);
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
        return "Room{" +
                "freeService='" + freeService + '\'' +
                "} " + super.toString();
    }
}
