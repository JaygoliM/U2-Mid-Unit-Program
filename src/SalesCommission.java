/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

 */

import javax.swing.*;
import java.text.DecimalFormat;

public class SalesCommission {

    public static void main(String[] args) {
        double rate = getInput("What's your hourly rate?");
        double hoursWorked = getInput("How many hours worked?");
        double ComPercent = getInput("Whats the sales Commission?");
        double Totalsales = getInput("What's the total sales?");

        double hourlyPay = hourlyPay(hoursWorked,rate);
       double salesCom = salesCom(ComPercent,Totalsales);
       double TotalPay = TotalPay(salesCom,hourlyPay);
        output(TotalPay);

    }

    public static double getInput(String prompt){

        return  Double.parseDouble(JOptionPane.showInputDialog(prompt));


    }
    public static double hourlyPay(double hoursWorked, double rate){
        double hourlyPay = rate * hoursWorked;
        return hourlyPay;
    }




public static double salesCom(double ComPercent, double TotalSales){

        return TotalSales * ComPercent/100.0;
}

public static double TotalPay(double salesCom,double hourlyPay){
        return  hourlyPay + salesCom;
}


public static void output(double getSales){

    DecimalFormat round = new DecimalFormat("$#,###.00");

    JOptionPane.showMessageDialog(null,"Total Sales: " + round.format(getSales));
}



}
