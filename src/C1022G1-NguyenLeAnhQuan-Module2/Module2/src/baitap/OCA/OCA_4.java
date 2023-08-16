package baitap.OCA;

import java.io.IOException;


 class X {
    public void printFileContent() throws IOException {
            throw new IOException("ABC");
    }
}
public class OCA_4 {
    public static void main(String[] args) throws IOException {
        X xobj = new X();
        xobj.printFileContent();
    }
}