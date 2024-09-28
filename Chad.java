public class Chad {

    private static int populationNumber;
    static int CitizenAge;
    String CitizenName;

    static {
        populationNumber =17720000;
        CitizenAge =22;

        System.out.println("The Population number is : " + populationNumber);
        System.out.println("The Citizen Age is : " + CitizenAge);
    }


    public Chad(String citizenName) {
        CitizenName = citizenName;
        populationNumber ++;
        CitizenAge ++;
    }

    public static int getPopulationNumber () {
        return populationNumber;
    }
    public static int getCitizenAge () {
        return CitizenAge;
    }

    public String getCitizenName () {
        return CitizenName;
    }

    public static void main (String[] args) {

        Chad chad = new Chad("Mbainaissem");
        Chad chad2 = new Chad("Douglas");
        Chad chad3 = new Chad("Kessely");


        System.out.println("The Citizen Name is " + chad.getCitizenName());
        System.out.println("The Population number is " + chad.getPopulationNumber());
        System.out.println("The Citizen Name is " + chad2.getCitizenName());
        System.out.println("The Citizen Age is " + chad3.getCitizenAge());

    }

}
