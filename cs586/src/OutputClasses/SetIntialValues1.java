package OutputClasses;
import DataStore.*;

public class SetIntialValues1 extends SetInitialValues {

	public SetIntialValues1(Data data) {
		super(data);
		
	}

	// Set Initial values.
	@Override
	public void SetInitialValues() {
		Data1 d = (Data1) data;
		d.setL(0);
		d.setTotal(0);
		System.out.println("");
		System.out.println("~~~~~ GasPump is  Ready to Pump ~~~~~");
		System.out.println("Your selected gas price is : " + d.getPrice() + "/Liter");
		System.out.println("8 : 1 Liter of Gas");
		System.out.println("9 : Stop Pump");
	}

}
