import java.io.*;

import LIST.LINKEDLIST.Employee;
class Employee
{
    String id,name,post;
    double fees;

    Employee()throws IOException
    {
      DataInputStream sc =new DataInputStream(System.in);
        System.out.println("Enter Id:");
        id = sc.readLine();
        System.out.println("Enter Name:");
        name = sc.readLine();
        System.out.println("Enter Post:");
        post = sc.readLine();
        System.out.println("Enter Fees:");
        fees = Double.parseDouble(sc.readLine());
    }

    void display()
    {
        System.out.println("_______________________________________________________");
        System.out.println("Id : "+ id);
        System.out.println("Name : "+name);
        System.out.println("Post : "+post);
        System.out.println("Fees : "+fees);
        System.out.println("_______________________________________________________");
        
    }
}

class EmployeeList
{
    public static void main(String args[])    throws IOException
    {

        DataInputStream sc =new DataInputStream(System.in);
    
        ArrayList <EmployeeList>students = new ArrayList <EmployeeList>();
        System.out.println("enter the no.of employee");
        int n= Integer.parseInt(sc.readLine());
        for(int x=0; x<n; x++)
        {
        EmployeeList studsobjEmployee=new EmployeeList();
        Employee.add(empobjEmployee);
        }
        for(int x=0; x<students.size(); x++)
        {
        Employee.get(x).display();
        }
    }
}
