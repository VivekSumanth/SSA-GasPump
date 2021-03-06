package StateClasses;
import OutputClasses.*;

/*
 * At this State only PayMsg() is Invoked.
 */
public class S0 extends State{
	
	public int id = 1;
	
	public S0(Output op) {
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
	
	public void Pump() {
		notatthisstatemsg();
	}
	
	public void Approved() {
		notatthisstatemsg();;
	}
	
	public void Reject() {
		notatthisstatemsg();
	}
	
	public void Cancel() {
		notatthisstatemsg();
	}
	
	public void StartPump() {
		notatthisstatemsg();
	}
	
	public void PumpLiter() {
		notatthisstatemsg();
	}
	
	public void StopPump() {
		notatthisstatemsg();
	}
	// Invokes PayMsg of Output Class
	public void Start() {
		this.op.PayMsg();
	}
	
	public int getStateId() {
		return this.id;
	} 
	

}
