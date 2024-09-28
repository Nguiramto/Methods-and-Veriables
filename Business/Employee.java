package Business;

public class Employee extends Entreprise {

    public String Fullname = "Rolf Kessely";

    public void displayInfo() {
        System.out.println("Entreprise Name is : " + entrepriseName);

        System.out.println("The Owner Name is : " + ownerName);

        System.out.println("The Entreprise Id is : " + entrepriseId);

        entrepriseName();
        entrepriseId();
        ownerName();
    }

}
