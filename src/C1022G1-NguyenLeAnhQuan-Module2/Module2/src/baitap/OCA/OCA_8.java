package baitap.OCA;
public class OCA_8 {
    void readCard(int cardNo)throws Exception{
        System.out.println("Reading Card");
    }
    
    void checkCard(int cardNo)throws RuntimeException{
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {
        OCA_8 oca8 = new OCA_8();
        int cardNo = 12344;
        oca8.checkCard(cardNo);
        try {
            oca8.readCard(cardNo);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
