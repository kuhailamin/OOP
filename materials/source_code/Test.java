/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuhail
 */
public class Test {

    public static void main(String[] args) {

        //testing Rectangle
        Rectangle rec = new Rectangle(5, 4);
        int area = rec.getArea();
        //area is 20
        System.out.println("Area of Rectangle is: " + area);
        
        //testing Student
        
        Student Amir=new Student("Amir Salman","1605885421");
	System.out.println("First Student’s Name is: "+Amir.getName());
	Student David=new Student("David Lauesen","1811703313");
	System.out.println("Second Student’s Name is: "+David.getName());


        //testing checking account
        BankAccount account = new CheckingAccount(
                "Adam Green", 500.00);
        try {
            account.withdraw(200);
            account.withdraw(400);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
