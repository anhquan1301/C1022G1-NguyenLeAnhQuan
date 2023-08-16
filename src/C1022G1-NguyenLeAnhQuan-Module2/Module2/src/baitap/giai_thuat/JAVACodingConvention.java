package baitap.giai_thuat;

public class JAVACodingConvention {
    public static void main(String[] args) {
        String name = "AnhQuan";
        String typeFile = "CLASS";
        boolean check = false;
        switch (typeFile.toLowerCase()){
            case "package":
                if(!Character.isLetter(name.charAt(0))){
                    check = false;
                    break;
                }
                if(name.indexOf('_')!=-1){
                    check = true;
                }
                break;
            case "class":
                String nameCheckToUp= name.toUpperCase();
                if(nameCheckToUp.charAt(0)==name.charAt(0)){
                    check = true;
                }
                break;
            case "method":
            case "field":
                String nameCheckToLow= name.toLowerCase();
                if(nameCheckToLow.charAt(0)==name.charAt(0)){
                    check = true;
                }
                break;
            default:
                break;
        }
        System.out.println(check);
    }
}
