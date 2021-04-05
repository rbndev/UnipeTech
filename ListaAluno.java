public class ListaAluno {
	Aluno[] alunos = new Aluno[60];
	int size = 0;
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public boolean isFull() {
		return (size == alunos.length);
	}

	public int sizeList(){
		return size;
	}
	
	public boolean compare(String c1, String c2) {
		return (c1.equals(c2));
	}
	
	public int positionRgm(int rgm) {
		for(int i = 0; i < size; i++) {
			if(alunos[i].getRgm() == rgm) {
				return i;
			}
		}
		return -1;
	}
	
	public void moveRight(int index) {
		for (int i = size; i > index; i--) {
			alunos[i] = alunos[i-1];
		}
	}
	
	public void moveLeft(int index) {
		for (int i = index; i < (size - 1); i++) {
			alunos[i] = alunos[i+1];
		}
	}
	
	public int addAluno(Aluno aluno) {
		
		if (isFull()) {
			return -1;
		}
		
		if (size == 0) {
			alunos[0] = aluno;
			size++;
		} else {
			if(alunos[0].getRgm() < aluno.getRgm()) {
				for(int j = 0; j < size; j++) {
					if(alunos[j].getRgm() > aluno.getRgm() && alunos[j-1].getRgm() < aluno.getRgm()) {
						moveRight(j);
						alunos[j] = aluno;
						size++;
					}
					else if(alunos[j].getRgm() < aluno.getRgm() && alunos[j+1] == null) {
						alunos[size] = aluno;
						size++;
					}
				}
			}else {
				moveRight(0);
				alunos[0] = aluno;
				size++;
			}
			
			return 1;			
		}
		return size;
	}

	
	public void delAluno(int index)	{
		if(positionRgm(index) > -1) {
			moveLeft(positionRgm(index));
			size--;
		}else {
			System.out.println("RGM não encontrado.");
		}
	}
	
	public void search(int rgm) {
		System.out.println("##########################");
		System.out.println("####   BUSCAR ALUNO   ####");
		System.out.println("##########################\n");
		if ((positionRgm(rgm) >= size) || (positionRgm(rgm) < 0)){
			System.out.println("Aluno não cadastrado\n");
		}else {
			System.out.println("RGM: " + alunos[positionRgm(rgm)].getRgm());
			System.out.println(alunos[positionRgm(rgm)].listadisciplina.showDisciplinas());
		}
	}
	
	public void showList() {
		System.out.println("##########################");
		System.out.println("#### LISTA DOS ALUNOS ####");
		System.out.println("##########################\n");
		if(size == 0) {
			System.out.println("Não existe alunos cadastrados.\n");
			System.out.println("------------------------------");
		}else {
			for (int i = 0; i < size; i++){
				System.out.println("RGM: " + alunos[i].getRgm());
				System.out.println(alunos[i].listadisciplina.showDisciplinas());
			}
		}
	}
	
}
