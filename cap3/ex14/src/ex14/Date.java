package ex14;

public class Date {
	
	private int dia, mes, ano;
	
	public Date(int dia, int mes, int ano) {
		if(mes >= 1 && mes <= 12) {
			this.mes = mes;
			this.ano = ano;
			if(dia >= 1) {
				if((mes % 2 == 0 && mes <= 7) || (mes % 2 == 1 && mes >= 8)) {
					if(mes == 2) {
						if((ano % 4) == 0) {
							if(dia <= 29)
								this.dia = dia;
							else {
								setMes(0);
								setAno(0);
							}
						}
						else {
							if(dia <= 28)
								this.dia = dia;
							else {
								setMes(0);
								setAno(0);
							}
						}
					}
					else {
						if(dia <= 30)
							this.dia = dia;
						else {
							setMes(0);
							setAno(0);
						}
					}
				}
				else {
					if(dia <= 31)
						this.dia = dia;
					else {
						setMes(0);
						setAno(0);
					}
				}		
			}
			else {
				setMes(0);
				setAno(0);
			}
		}
	}
	
	public void displayDate() {
		System.out.println(dia + "/" + mes + "/" + ano);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
