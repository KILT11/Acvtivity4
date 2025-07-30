/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecsonapp;
import java.util.Scanner;
/**
 *
 * @author PC 17
 */
public class TecsonApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
        float rs, hr;
        double contri, wage;
        int work;
        String name;
        
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Hourly Rate: ");
        hr = sc.nextFloat();
        System.out.print("Enter Total Hours Worked This Week: ");
        work = sc.nextInt();
       
        System.out.println("-----Wage Summary------");
        System.out.println("Employee: "+name);
        System.out.println("Hourly Rate: ₱"+hr);
        System.out.println("Hours Worked: "+work);
        
       
        rs  = hr * work;
        System.out.println("Gross Weekly Wage: ₱"+rs);
        
        contri = rs * 0.10;
        System.out.println("SSS Contribution (10%): ₱"+contri);
        System.out.println("------------------------------");
        wage = rs - contri;
        System.out.println("Net Weekly Wage: ₱"+wage);
    }
    
}

   
