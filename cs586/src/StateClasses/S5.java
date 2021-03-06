package StateClasses;

import OutputClasses.*;
/*
 * At this State only Pump(),StartPump(),StopPump() is Invoked.
 */

public class S5 extends State {
	
	public int id = 5;
	
	public S5(Output op) {
		super(op);
	}


	public void Activate() {
		notatthisstatemsg();
	}
	
	public void PayCash() {
		notatthisstatemsg();
	}
	
	public void PayCredit() {
		notatthisstatemsg();
	}
	
	public void PayDebit() {
		notatthisstatemsg();
	}
	
	public void CorrectPin() {
		notatthisstatemsg();
	}
	
	public void InCorrectPin() {
		notatthisstatemsg();
	}
	
	public void TooManyAttempts() {
		notatthisstatemsg();
	}
	
	public void SelectGas(int g) {
		notatthisstatemsg();
	}
	
	//invokes PumpGasUnit and GasAckMsg in Output class
	public void Pump() {
		this.op.PumpGasUnit();
		this.op.GasAckMsg();
	}
	
	public void Approved() {
		notatthisstatemsg();
	}
	
	public void Reject() {
		notatthisstatemsg();
	}
	
	public void Cancel() {
		notatthisstatemsg();
	}
	
	//invokes SetInitialValues and ReadyMsg in Output class
	public void StartPump() {
		this.op.SetInitialValues();
	}
	
	public void PumpLiter() {
		notatthisstatemsg();
	}
	
	//invokes StopMsg and PrintReceipt and ReturnCash() in Output class
	public void StopPump() {
		this.op.PrintReceipt();
	}
	
	public void Start() {
		notatthisstatemsg();
	}
	
	public int getStateId() {
		return this.id;
	} 
	

}