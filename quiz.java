public class quiz {
    public static void main(String[] args) {
        student student1 = new student(65, "nontaphat", 2002, 3.4);
        student1.showDetails();
    }
}

class student{
    private int ID;
    private String name;
    private int AddmissionYear;
    private double GPA;

    student(int ID, String name,int AddmissionYear,double GPA){
        this.ID = ID;
        this.name = name;
        this.AddmissionYear = AddmissionYear;
        this.GPA = GPA;
    }


public void showDetails(){
    System.out.println("ID" +this.ID);
    System.out.println("name" +this.name);
    System.out.println("AddmissionYear" +this.AddmissionYear);
    System.out.println("GPA" +GPA);
}

}