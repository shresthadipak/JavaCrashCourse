package MethodOverloadingPackage;

public class EmployeeMain {
    String name;
    String address;
    long phone;
    String mail;
    String nationality;

    public  EmployeeMain(String name, String address, long phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public EmployeeMain(String mail, String nationality){
        this.mail = mail;
        this.nationality = nationality;
    }

    public String employeeDetails(String name, String address, long phone){
        return (name +" "+ address +" "+ phone);
    }

    public String employeeDetails(String mail, String nationality){
        return (mail+" "+nationality);
    }

    public static void main(String[] args){
        EmployeeMain infoObj1 = new EmployeeMain("Dipak Shrestha", "Chabahil", 906896876);
        String res1 = infoObj1.employeeDetails("Dipak Shrestha", "Chabahil", 906896876);
        System.out.println(res1);

        EmployeeMain infoObj2 = new EmployeeMain("shresthadipa471@gmail.com", "Nepalese");
        String res2 = infoObj2.employeeDetails("shresthadipa471@gmail.com", "Nepalese");
        System.out.println(res2);

    }
}
