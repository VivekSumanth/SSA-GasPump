package OutputClasses;
import DataStore.*;

public class SetInitalValues2 extends SetInitialValues{
	
	public SetInitalValues2(Data data) {
		super(data);
	}

	//Ste iniital values for g and total
	public void SetInitialValues() {
		Data2 d = (Data2) data;
		d.setG(0);
		d.setTotal(0);
		System.out.println("");
		System.out.println("~~~~~ GasPump is  Ready ~~~~~");
		System.out.println("Your selected gas price is : " + d.getPrice() + "/Gallon");
		System.out.println("11 : 1 Gallon of Gas");
		System.out.println("12 : Stop Pump");
		System.out.println("	13 : FullTank");
	}

}
