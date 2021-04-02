package ex30;

public class AutoPolicyTest {

	public static void main(String[] args) {
		
		ClasseAutoPolicyModificda policy1 = new ClasseAutoPolicyModificda(11111111, "Toyota Camry", "NJ");
		ClasseAutoPolicyModificda policy2 = new ClasseAutoPolicyModificda(22222222, "Ford Fusion", "ME");
		ClasseAutoPolicyModificda policy3 = new ClasseAutoPolicyModificda(33333333, "Fiat Uno", "AA");
		
		policyInNoFaultState(policy1);
		policy3.setState("NJ");
		policyInNoFaultState(policy2);
		policy3.setState("ME");
		policyInNoFaultState(policy3);
		policy3.setState("AA");
	}

	public static void policyInNoFaultState(ClasseAutoPolicyModificda policy) {
		System.out.println("The auto policy:");
		System.out.printf("Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n", 
		         policy.getAccountNumber(), policy.getMakeAndModel(), 
		         policy.getState(),(policy.isNoFaultState() ? "is": "is not"));
	}
}
