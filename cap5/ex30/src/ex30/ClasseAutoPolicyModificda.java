package ex30;

/*(Classe AutoPolicy modificada) Modifique a classe AutoPolicy na Figura 5.11 para validar os c?digos 
 * de estado de duas letras para os estados do nordeste dos EUA. Os c?digos s?o: CT para Connecticut, 
 * MA para Massachusetts, ME para Maine, NH para New Hampshire, NJ para New Jersey, NY para Nova York, 
 * PA para Pensilv?nia e VT para Vermont. No m?todo AutoPolicy setState use o operador l?gico OU (||) 
 * (Se??o 5.9) para criar uma condi??o composta em uma instru??o if...else que compara o argumento do m?todo
 * com cada c?digo de duas letras. Se o c?digo estiver incorreto, a parte else da instru??o if...else 
 * deve exibir uma mensagem de erro. Nos pr?ximos cap?tulos, voc? aprender? a usar o tratamento de exce??es
 * para indicar que um m?todo recebeu um valor inv?lido.
 */

public class ClasseAutoPolicyModificda {

	private int accountNumber; // policy account number
	private String makeAndModel; // car that the policy applies to
	private String state; // two-letter state abbreviation

	public ClasseAutoPolicyModificda(int accountNumber, String makeAndModel, String state) {
		this.accountNumber = accountNumber;
	    this.makeAndModel = makeAndModel;
	    this.state = state;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	} 
	
	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}
	
	public String getMakeAndModel() {
		return makeAndModel;
	} 
	   
	public void setState(String state) {
		this.state = state;
		if (((((((state == "MA" || state == "NJ") || state == "NY") || state == "PA") 
			  || state == "CT") || state == "ME") || state == "NH") || state == "VT"){
		}else
			System.out.println(state +" ? um Estado inv?lido");
	}

	public String getState() {
		return state;
	}
	
	public boolean isNoFaultState() {
		boolean noFaultState; 
		switch (getState()) 
	    {
	    	case "MA": case "NJ": case "NY": case "PA": case "CT": case "ME": case "NH": case "VT":
	    		noFaultState = true;
	            break;
	         default:
	            noFaultState = false;
	            break;
	    }
		return noFaultState;
	} 
}