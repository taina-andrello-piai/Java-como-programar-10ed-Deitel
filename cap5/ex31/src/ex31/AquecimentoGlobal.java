package ex31;

public class AquecimentoGlobal {
	
	private int alternativaEscolhida,
				numeroQuestao,
				pontuacaoFinal;
	
	public void zeraPontuacaoFinal() {
		pontuacaoFinal = 0;
	}
	
	public void confereAlternativa(int numeroQuestao, int alternativaEscolhida) {
		
		this.numeroQuestao = numeroQuestao;
		this.alternativaEscolhida = alternativaEscolhida;
		
		switch(numeroQuestao) {
		case 1:
			if(alternativaEscolhida == 2)
				pontuacaoFinal++;
			break;
		case 2:
			if(alternativaEscolhida == 3)
				pontuacaoFinal++;
			break;
		case 3:
			if(alternativaEscolhida == 1)
				pontuacaoFinal++;
			break;
		case 4:
			if(alternativaEscolhida == 1)
				pontuacaoFinal++;
			break;
		case 5:
			if(alternativaEscolhida == 4)
				pontuacaoFinal++;
			break;
		default:
			break;
		}
	}
	
	public void resultadoFinal() {
		switch(pontuacaoFinal) {
			case 0: case 1: case 2: case 3:
				System.err.println("\nSua pontua??o foi " + pontuacaoFinal 
						+ ". \n? o momento de aprimorar seu conhecimento sobre o aquecimento global."
						+ "\nConsulte alguns sites: "
						+ "\nhttps://pt.wikipedia.org/wiki/Aquecimento_global#O_aquecimento_global"
						+ "\nhttps://www.greenpeace.org/brasil/blog/ou-agimos-agora-ou-sera-tarde-demais"
						+ "/?utm_term=efeito%20estufa%20e%20aquecimento%20global&utm_campaign=%5BMAIO/20%"
						+ "5D+Mudan%C3%A7as+Clim%C3%A1ticas+(Estudantes)&utm_source=adwords&utm_medium=ppc&"
						+ "hsa_acc=7235609613&hsa_cam=10031418915&hsa_grp=102655853242&hsa_ad=437616318408&"
						+ "hsa_src=g&hsa_tgt=kwd-309365741491&hsa_kw=efeito%20estufa%20e%20aquecimento%20"
						+ "global&hsa_mt=b&hsa_net=adwords&hsa_ver=3&gclid=CjwKCAjw1ej5BRBhEiwAfHyh1HopAinc"
						+ "WfWmUAtGDER198XWtxGQSwCVYaWqIDhu_7higk_5Zmi7yRoCbDYQAvD_BwE"
						+ "\n");
				break;
			case 4:
				System.out.println("\nSua pontua??o final foi " + pontuacaoFinal + ". Muito bom.");
				break;
			case 5:
				System.out.println("\nSua pontua??o final foi " + pontuacaoFinal + ". Excelente!");
				break;
			default:
				break;
		}
	}
	
	public void questoes(int numeroQuestao) {
		this.numeroQuestao = numeroQuestao;
		switch(numeroQuestao) {
			case 1:
				System.out.println("\n(QUEST?O 1) Uma das principais causas do aquecimento global"
						+ " ? a queima de combust?veis f?sseis. S?o exemplos de combust?veis f?sseis, "
						+ "exceto: \n(1) G?s natural\n(2) Hidrog?nio\n(3) Petr?leo\n(4) Carv?o");
				break;
			case 2:
				System.out.println("\n(QUEST?O 2) Nas alternativas abaixo, a ?nica que n?o representa"
						+ " um impacto causado pelo aquecimento global ?: \n(1) Secas severas prolongadas"
						+ "\n(2) Tempestades com for?a recorde\n(3) Diversidade da fauna e flora nos"
						+ " diversos ecossistemas\n(4) Aumento da temperatura m?dia do planeta e popula??es"
						+ " enfrentando ondas de calor");
				break;
			case 3:
				System.out.println("\n(QUEST?O 3) O setor agropecu?rio responde por cerca de 70% das "
						+ "emiss?es brasileiras de gases do efeito estufa. As causas dessa emiss?o "
						+ "s?o, exceto: \n(1) A restaura??o das florestas degradadas"
						+ "\n(2) O ?pum? dos rebanhos\n(3) O uso de fertilizantes"
						+ "\n(4) O desmatamento de novas ?reas");
				break;
			case 4:
				System.out.println("\n(QUEST?O 4) S?o causas b?sicas do aquecimento global, exceto: "
						+ "\n(1) Uso de energia sustent?vel e renov?vel\n(2) Lixo e polui?ao"
						+ "\n(3) Urbaniza??o e desmatamento\n(4) Explos?o populacional e consumismo");
				break;
			case 5:
				System.out.println("\n(QUEST?O 5) O aquecimento verificado n?o ? globalmente uniforme."
						+ " Qual a regi?o que est? sendo apontada como a mais afetada?"
						+ "\n(1) Alpes Andinos\n(2) Deserto do Saara\n(3) Amaz?nia\n(4) Polo ?rtico");
				break;
			default:
				break;
			}
	}

	public int getAlternativaEscolhida() {
		return alternativaEscolhida;
	}

	public void setAlternativaEscolhida(int alternativaEscolhida) {
		this.alternativaEscolhida = alternativaEscolhida;
	}

	public int getNumeroQuestao() {
		return numeroQuestao;
	}

	public void setNumeroQuestao(int numeroQuestao) {
		this.numeroQuestao = numeroQuestao;
	}

	public int getPontuacaoFinal() {
		return pontuacaoFinal;
	}

	public void setPontuacaoFinal(int pontuacaoFinal) {
		this.pontuacaoFinal = pontuacaoFinal;
	}
}
