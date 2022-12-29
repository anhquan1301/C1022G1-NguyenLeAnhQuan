package Case_Study.FuramaResort.model.service.classIplm;

import Case_Study.FuramaResort.model.model.extend_facility.Room;
import Case_Study.FuramaResort.model.model.extend_facility.Villa;
import Case_Study.FuramaResort.model.repository.classIplm.FacilityRepositoryIplm;
import Case_Study.FuramaResort.model.repository.itf.IFacilityRepository;
import Case_Study.FuramaResort.model.service.itf.IFacilityService;

public class FacilityServiceIplm implements IFacilityService {
    private static IFacilityRepository iFR = new FacilityRepositoryIplm();
    @Override
    public void displayList() {
        iFR.displayList();
    }

    @Override
    public void addList(Object object) {
//        iFR.addList(object);
    }

    @Override
    public void displayListFacilityMaintenance() {
        iFR.displayListFacilityMaintenance();
    }

    @Override
    public void addVilla(Villa villa) {
        iFR.addVilla(villa);
    }

    @Override
    public void addRoom(Room room) {
        iFR.addRoom(room);
    }
}
