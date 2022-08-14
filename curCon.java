package currencyCon;

import java.util.Scanner;

public class curCon {

	public static void main(String[] args) {
		double rupees,dollar,euros,dinar;
		int code;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the currency code \n1:Rupees\n2:Dollar\n3:Euro2\n4:Dinar");
		code = sc.nextInt();
		
		if(code == 1)
		{
			System.out.println("Enter the amount in rupees: ");
			rupees = sc.nextFloat();
			dollar = rupees / 79.63;
			System.out.println("Dollar: " + dollar);
			euros = rupees / 81.72;
			System.out.println("Euro: " + euros);
			dinar = rupees / 259.73;
			System.out.println("Dinar: " + dinar);
		}
		else if(code == 2) 
		{
			System.out.println("Enter the amount in dollars: ");
			dollar = sc.nextFloat();
			rupees = dollar * 79.63;
			System.out.println("Rupees: " + rupees);
			euros = dollar * 0.97;
			System.out.println("Euro: " + euros);
			dinar = dollar * 0.31;
			System.out.println("Dinar: " + dinar);
		}
		else if(code == 3) 
		{
			System.out.println("Enter the amount in euros: ");
			euros = sc.nextFloat();
			rupees = euros * 81.72;
			System.out.println("Rupees: " + rupees);
			dollar = euros * 0.97;
			System.out.println("Dollar: " + dollar);
			dinar = euros * 0.31;
			System.out.println("Dinar: " + dinar);
		}
		else if(code == 4) 
		{
			System.out.println("Enter the amount in Dinar: ");
			dinar = sc.nextFloat();
			rupees = dinar * 259.73;
			System.out.println("Rupees: " + rupees);
			dollar = dinar * 3.26;
			System.out.println("Dollar: " + dollar);
			euros = dinar * 3.18;
			System.out.println("Euro: " + euros);
		}
		else
		{
			System.out.println("Invalid Code");
		}
		

	}

}
