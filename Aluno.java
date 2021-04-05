public class Aluno {
	private int rgm;
	ListaDisciplina listadisciplina;
	
	public Aluno() {
		this.rgm = getRgm();
		listadisciplina = new ListaDisciplina();
	}

	public int getRgm() {
		return rgm;
	}

	public void setRgm(int rgm) {
		this.rgm = rgm;
	}
	
	public void addDisciplina(Disciplina disc) {
		listadisciplina.addDisc(disc);
	}
	
	public void showDisciplina() {
		listadisciplina.showDisciplinas();
	}
		
}
