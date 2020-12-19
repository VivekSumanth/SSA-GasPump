package OutputClasses;

import DataStore.*;

public class PrintReceipt1 extends PrintReceipt {

	public PrintReceipt1(Data data) {
		super(data);
	}
	
	public void PrintReceipt() {
		Data1 d = (Data1) data;
		System.out.println("");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Receipt ");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("price of the fuel							: " + d.getPrice());
		System.out.println("The Total Fuel Pumped							: " + d.getL());
		System.out.println("Total Amount to be paid							: " + d.getTotal());
		if(d.getW() == 1){
			System.out.println("You get back " + (d.getCash() - d.getTotal()));
		}
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------------------");
	}
}


