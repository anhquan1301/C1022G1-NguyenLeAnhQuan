package baitap.OCA;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Cycle> myList = new ArrayList<>();
        myList.add(new MotorCycle());
    }
}
interface Cycle{

}

class MotorCycle implements Cycle {

}