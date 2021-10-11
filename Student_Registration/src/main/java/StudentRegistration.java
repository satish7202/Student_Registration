package PACKAGE_NAME;
import java.util.Scanner;

public class StudentRegistration {
   static int Sr = 0;

    private static StudentRegistration[] StuObj = new StudentRegistration[2];
    private String Name;
    private int Roll;
    private String Address;
    private String mobile;
    StudentRegistration(String Name, int Roll, String Address, String mobile)
    {
        this.Name=Name;
        this.Roll=Roll;
        this.Address=Address;
        this.mobile=mobile;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int ch;


        do {
            System.out.println("1: Student Registration.");
            System.out.println("2:Get Student Data.");
            System.out.println("3:Delete Student.");
            System.out.println("0:For Exit");
            System.out.println("Select Choice:");
            ch= sc.nextInt();

                   if(ch==1) {


                      AddStudent();
                   }
                   else if (ch==2)
                   {
                       GetStudent();
                   }
                   else
                   {
                       System.out.println("Wrong Input");
                   }

            }while(ch != 0);

    }



    private static void GetStudent() {


         for (int i=0 ; i<Sr ; i++)
         {
             System.out.println("Name:"+StuObj[i].Name);
             System.out.println("Roll No:"+StuObj[i].Roll);
             System.out.println("Address:"+StuObj[i].Address);
             System.out.println("Mob No:"+StuObj[i].mobile);
             System.out.println("*******************************");
         }

    }

     static void AddStudent()
    {
        Scanner sc = new Scanner(System.in);
        String Name;
        int Roll;
        String Address;
        String mobile;
        Boolean Valid = null;
        System.out.println("Enter Name:");
        Name=sc.nextLine();
        System.out.println("Enter Roll No:");
        Roll=sc.nextInt();
        System.out.println("Enter Address:");
        Address=sc.next();
        System.out.println("Enter Mob Number:");
        mobile=sc.next();
        String regex = "(0/91)?[7-9][0-9]{9}";
        Valid = mobile.matches(regex);
        if(Valid == true)
        {
            StuObj[0] = new StudentRegistration(Name,Roll,Address,mobile);
            System.out.println("Student Successfully Register");
            Sr++;
        }
        else
        {
            System.out.println("Number is Not Valid...");
        }


    }

}

