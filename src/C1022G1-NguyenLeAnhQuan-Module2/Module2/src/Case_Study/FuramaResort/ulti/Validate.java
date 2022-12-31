package Case_Study.FuramaResort.ulti;

public class Validate {
    public static final String REGEX_SERVICE_CODE_VILLA = "^SVVL-[0-9]{4}$";
    public static final String REGEX_SERVICE_CODE_ROOM = "^SVRO-[0-9]{4}$";
    public static final String REGEX_SERVICE_NAME = "^[A-Z][a-z0-9]+$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})[.]\\d+$";
    public static final String REGEX_PRICE = "^[1-9]\\d*$";
    public static final String REGEX_MAX_PEOPLE = "^(1?[1-9]|10)$";
    public static final String REGEX_NUMBER_FLOORS = "^[1-9]\\d*$";
    public static final String REGEX_TYPE_RENT = "^(Date|Month|Year)$";
    public static final String REGEX_QUALITY = "^(Standard|Suite|Deluxe|Superior)$";
}
