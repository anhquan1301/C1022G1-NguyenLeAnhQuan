package Case_Study.FuramaResort.model.repository.itf;

import Case_Study.FuramaResort.model.model.Facility;
import Case_Study.FuramaResort.model.model.extend_facility.Room;
import Case_Study.FuramaResort.model.model.extend_facility.Villa;
import Case_Study.FuramaResort.model.repository.IFuramaRepository;

import java.util.Map;

public interface IFacilityRepository extends IFuramaRepository {
	void displayListFacilityMaintenance();
	void addVilla(Villa villa);
	void addRoom(Room room);
}
