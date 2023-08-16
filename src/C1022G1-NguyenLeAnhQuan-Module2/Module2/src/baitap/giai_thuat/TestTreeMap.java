package baitap.giai_thuat;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeMap {
    private int id;
    private String name;

    public TestTreeMap() {
    }

    public TestTreeMap(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        TestTreeMap that = (TestTreeMap) o;
//        return id == that.id && Objects.equals(name, that.name);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
}
 class TestTreeMap2{
     public static void main(String[] args){
         Set<TestTreeMap> testTreeMaps = new TreeSet<>();
         testTreeMaps.add(new TestTreeMap(1,"abc"));
         testTreeMaps.add(new TestTreeMap(1,"abc"));
         System.out.println(testTreeMaps.size());
     }
}
