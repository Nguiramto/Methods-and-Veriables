package Business;

public class Entreprise {

    public String entrepriseName = "Nguiramto";
    protected String ownerName = "Mbainaissem Douglas";
    int entrepriseId = 1516;
    private double salary = 10000.50;


    public void entrepriseName() {
        System.out.println("Entreprise Name is :"+ entrepriseName);
    }

    protected void ownerName() {
        System.out.println("Owner Name is :"+ ownerName);
    }

    void entrepriseId() {
        System.out.println("entrepriseId is :"+ entrepriseId);
    }

    private void salary() {
        System.out.println("Salary is :"+ salary);
    }

    public void displaySalary() {
        salary();
    }

}
