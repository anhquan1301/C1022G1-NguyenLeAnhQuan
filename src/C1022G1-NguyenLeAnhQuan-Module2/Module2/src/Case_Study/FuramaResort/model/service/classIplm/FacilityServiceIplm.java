package Case_Study.FuramaResort.model.service.classIplm;

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
        iFR.addList(object);
    }

    @Override
    public void displayListFacilityMaintenance() {
        iFR.displayListFacilityMaintenance();
    }
}
