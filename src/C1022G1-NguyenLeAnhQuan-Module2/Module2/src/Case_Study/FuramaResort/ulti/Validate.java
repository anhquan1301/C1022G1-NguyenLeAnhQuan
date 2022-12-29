package Case_Study.FuramaResort.ulti;

public class Validate {
    public static final String REGEX_SERVICE_CODE_VILLA = "^SVVL-[0-9]{4}$";
    public static final String REGEX_SERVICE_CODE_ROOM = "^SVRO-[0-9]{4}$";
    public static final String REGEX_SERVICE_NAME = "^[A-Z][a-z0-9]+$";
    public static final String REGEX_AREA = "^0*([3-9]\\d|[1-9]\\d{2,})[.]\\d+$";
    public static final String REGEX_PRICE = "^0*[0-9]+$";
    public static final String REGEX_MAX_PEOPLE = "^0*1*\\d$";
    public static final String REGEX_NUMBER_FLOORS = "^0*[0-9]+$";
    public static final String REGEX_TYPE_RENT = "^Date|Month|Year$";
    public static final String REGEX_QUALITY = "^Standard|Suite|Deluxe|Superior$";

    public static String getRegexServiceCodeVilla() {
        return REGEX_SERVICE_CODE_VILLA;
    }

    public static String getRegexServiceCodeRoom() {
        return REGEX_SERVICE_CODE_ROOM;
    }

    public static String getRegexServiceName() {
        return REGEX_SERVICE_NAME;
    }

    public static String getRegexArea() {
        return REGEX_AREA;
    }

    public static String getRegexPrice() {
        return REGEX_PRICE;
    }

    public static String getRegexMaxPeople() {
        return REGEX_MAX_PEOPLE;
    }

    public static String getRegexNumberFloors() {
        return REGEX_NUMBER_FLOORS;
    }

    public static String getRegexTypeRent() {
        return REGEX_TYPE_RENT;
    }

    public static String getRegexQuality() {
        return REGEX_QUALITY;
    }
}
