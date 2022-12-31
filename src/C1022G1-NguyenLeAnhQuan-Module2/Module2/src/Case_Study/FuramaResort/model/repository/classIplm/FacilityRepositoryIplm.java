package Case_Study.FuramaResort.model.repository.classIplm;

import Case_Study.FuramaResort.model.model.Facility;
import Case_Study.FuramaResort.model.model.extend_facility.Room;
import Case_Study.FuramaResort.model.model.extend_facility.Villa;
import Case_Study.FuramaResort.model.repository.itf.IFacilityRepository;
import Case_Study.FuramaResort.ulti.IOTEXT.RWRoom;
import Case_Study.FuramaResort.ulti.IOTEXT.RWVilla;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepositoryIplm implements IFacilityRepository {
    private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
//    static {
//        facilityMap.put(new Room("SVRO-1234","Room402","100.0","200","2","Date", "FreeMassage"),5);
//        facilityMap.put(new Room("SVRO-6789","Room301","150.0","350","4","Date","FreeBuffet"),3);
//        facilityMap.put(new Room("SVRO-5678","Room505","100.0","4000","2","Month","FreeMassage"),4);
//        facilityMap.put(new Room("SVRO-5432","Room305","100.0","40000","2","Year","FreeMassage"),1);
//        facilityMap.put(new Villa("SVVL-2345","Villa102","325.5","700","4","Date","Standard", "55","2"),5);
//        facilityMap.put(new Villa("SVVL-0012","Villa203","425.5","1000","8","Date","Suite","100","3"),1);
//        facilityMap.put(new Villa("SVVL-8483","Villa305","330.8","18000","4","Month","Deluxe","55","2"),1);
//    }
    @Override
    public void displayList() {
        Map<Villa,Integer> vM = RWVilla.readFile();
        Map<Room, Integer> rM = RWRoom.readFile();
        System.out.println("List Facility");
        for (Map.Entry<Villa,Integer> entry: vM.entrySet()){
            if(entry.getValue()<5){
            System.out.println(entry.getKey()+" : Số lần sử dụng "+entry.getValue());
            }
        }
        for (Map.Entry<Room,Integer> entry: rM.entrySet()){
            if(entry.getValue()<5){
                System.out.println(entry.getKey()+" : Số lần sử dụng "+entry.getValue());
            }
        }
    }
    @Override
    public void addVilla(Villa villa) {
        Map<Villa,Integer> vlMap = RWVilla.readFile();
        vlMap.put(villa,0);
        RWVilla.writeFile(vlMap);
    }
    @Override
    public void addRoom(Room room) {
        Map<Room,Integer> rMap = RWRoom.readFile();
        rMap.put(room,0);
        RWRoom.writeFile(rMap);
    }
    @Override
    public void addList(Object object) {
//        Facility facility = (Facility) object;
//        facilityMap.put(facility,0);
    }
    @Override
    public void displayListFacilityMaintenance() {
        Map<Villa,Integer> vM = RWVilla.readFile();
        Map<Room, Integer> rM = RWRoom.readFile();
        System.out.println("List Facility Maintenance");
        for (Map.Entry<Villa,Integer> entry: vM.entrySet()){
            if(entry.getValue()>=5){
                System.out.println(entry.getKey()+" : Số lần sử dụng "+entry.getValue());
            }
        }
        for (Map.Entry<Room,Integer> entry: rM.entrySet()){
            if(entry.getValue()>=5){
                System.out.println(entry.getKey()+" : Số lần sử dụng "+entry.getValue());
            }
        }
    }


}
