package ex13;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Tain�","Andrello Piai",15000.00);
		Employee employee2 = new Employee("Leonardo","Di Caprio",1000000.00);
		
		System.out.printf("Sal�rio mensal de  %s %s: $ %.2f%nSal�rio mensal de %s %s: $ %.2f%n%n"
				+ "Sal�rio anual de %s %s: $ %.2f%nSal�rio anual de %s %s: $ %.2f"
				+ "%n%nAumento salarial de 10%%"
				+ "%n%nSal�rio anual de %s %s: $ %.2f%nSal�rio anual de %s %s: $ %.2f",
				employee1.getNome(),employee1.getSobrenome(),
				employee1.getSalario(),
				employee2.getNome(),employee2.getSobrenome(),
				employee2.getSalario(),
				employee1.getNome(),employee1.getSobrenome(),
				employee1.salarioAnual(),
				employee2.getNome(),employee2.getSobrenome(),
				employee2.salarioAnual(),
				employee1.getNome(),employee1.getSobrenome(),
				employee1.aumentoSalario(),
				employee2.getNome(),employee2.getSobrenome(),
				employee2.aumentoSalario());
	}
}
