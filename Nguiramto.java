public class Nguiramto {

    private static int uniqueValue = 234;
    public int countryCode;
    String name;

    {
        countryCode = ++ uniqueValue;
    }

    public Nguiramto(String name) {
        this.name = name;
    }

    public static int getUniqueValue() {
        return uniqueValue;
    }

    public Nguiramto(int countryCode) {
        this.countryCode = countryCode;
    }

    public static void main(String[]args) {

        Nguiramto nguiramto1 = new Nguiramto("Mbainaissem");
        Nguiramto nguiramto2 = new Nguiramto("Douglas");
        Nguiramto nguiramto3 = new Nguiramto("Kessely");
        Nguiramto nguiramto4 = new Nguiramto("Kamiski");



        System.out.println("The Country Code is :" + nguiramto1.countryCode +  ", The Name is :" + nguiramto1.name);
        System.out.println("The Country Code is :" + nguiramto2.countryCode +  ", The Name is :" + nguiramto2.name);
        System.out.println("The Country Code is :" + nguiramto3.countryCode +  ", The Name is :" + nguiramto3.name);
        System.out.println("The Country Code is :" + nguiramto4.countryCode +  ", The Name is :" + nguiramto4.name);



    }
}
