package Case_Study.FuramaResort.model.repository.classIplm;

import Case_Study.FuramaResort.model.model.Facility;
import Case_Study.FuramaResort.model.model.extend_facility.Room;
import Case_Study.FuramaResort.model.model.extend_facility.Villa;
import Case_Study.FuramaResort.model.repository.itf.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepositoryIplm implements IFacilityRepository {
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
    static {
        facilityMap.put(new Room("SVRO-1234",100,200,2,"Date", "FreeMassage"),5);
        facilityMap.put(new Room("SVRO-6789",150,350,4,"Date","FreeBuffet"),3);
        facilityMap.put(new Room("SVRO-5678",100,4000,2,"Month","FreeMassage"),4);
        facilityMap.put(new Room("SVRO-5432",100,35000,2,"Year","FreeMassage"),1);
        facilityMap.put(new Villa("SVVL-2345",300,700,4,"Date","4*", 55,2),5);
        facilityMap.put(new Villa("SVVL-0012",400,1000,8,"Date","5*",100,3),1);
        facilityMap.put(new Villa("SVVL-8483",300,18000,4,"Month","4*",55,2),1);
    }
    @Override
    public void displayList() {
        for (Map.Entry<Facility,Integer> entry: facilityMap.entrySet()){
            if(entry.getValue()<5){
            System.out.println(entry.getKey()+" : Số lần sử dụng "+entry.getValue());
            }
        }
    }
    @Override
    public void addList(Object object) {
        Facility facility = (Facility) object;
        facilityMap.put(facility,0);
    }
    @Override
    public void displayListFacilityMaintenance() {
        System.out.println("List Facility Maintenance");
        for (Map.Entry<Facility,Integer> entry: facilityMap.entrySet()){
            if(entry.getValue()>=5){
                System.out.println(entry.getKey()+" : Số lần sử dụng "+entry.getValue());
            }
        }
    }
}
