package Case_Study.FuramaResort.model.service.itf;

import Case_Study.FuramaResort.model.model.extend_facility.Room;
import Case_Study.FuramaResort.model.model.extend_facility.Villa;
import Case_Study.FuramaResort.model.service.IFuramaService;

public interface IFacilityService extends IFuramaService {
    void displayListFacilityMaintenance();
    void addVilla(Villa villa);
    void addRoom(Room room);
}
