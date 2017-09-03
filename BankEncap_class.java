
public class BankEncap_class {
	private int pinfrombank =1234;
	public void pinnum(int userpin){
		if(pinfrombank==userpin){
			System.out.println("Pin is correct!");
		}
		else{
			System.out.println("Wrong Pin!");
		}
	}

}
