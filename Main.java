import java.util.Scanner;

public class Main {
	
	public static char menu(Scanner scanner){
        String msg;
        System.out.println("### Mini Projeto ###");
        System.out.println("1: Cadastrar Aluno");
        System.out.println("2: Listar Alunos");
        System.out.println("3: Procurar Aluno");
        System.out.println("4: Remover Aluno");
        System.out.println("0: Sair");
        System.out.print("=> ");
		msg = scanner.next();
        return msg.charAt(0);
    }
	
	public static void main(String[] args) {   
        ListaAluno lista = new ListaAluno();
        Scanner ler = new Scanner(System.in);
        Aluno a;
        char opcao;
        
        do {
            opcao = menu(ler);
            switch(opcao){
            	case '1':
                	boolean add = true;
                    a = new Aluno();
                    System.out.print("Digite o RGM: ");
                    int x = ler.nextInt();
                    a.setRgm(x);
                    lista.addAluno(a);
                    while(add) {	
						@SuppressWarnings("resource")
						Scanner dados = new Scanner(System.in); 
                    	Disciplina disc = new Disciplina();
                    	int nota;
                    	int op;
                    	String materia;
                    	System.out.println("Mais disciplina?? 1:Sim 0:Não ");
                    	System.out.print("=> ");
                    	op = ler.nextInt();
                    	         	
                    	if(op == 0) {
                    			add = false;
                    			//dados.close();
                    		}else if(op == 1) {
	                    		System.out.print("Digite uma matéria: ");                  		
	                    		materia = dados.nextLine();
	                    		System.out.print("Insira uma nota: ");   
	                    		nota = dados.nextInt();
	                    		disc.setMaterias(materia);
	                    		disc.setNota(nota);
	                    		a.addDisciplina(disc);
                    		}else {
                    			System.out.println("Digite 1 ou 0.");
                    	}
                    }
                    System.out.println("-----------------------");
                    System.out.println("CADASTRADO COM SUCESSO!");
                    System.out.println("-----------------------");
                break;
                case '2':
                    lista.showList();
                break;
                case '3':
                    System.out.print("Digite o RGM que deseja procurar:");
                    int rg = ler.nextInt();
                    lista.search(rg);
                break;
                case '4':       
                    System.out.print("Digite o RGM que deseja remover: ");
                    int r = ler.nextInt();              
                    lista.delAluno(r);
                    System.out.println("---------------------");
                    System.out.println("DELETADO COM SUCESSO!");
                    System.out.println("---------------------");
                    System.out.println();
                    lista.showList();
                break;
                case '0':
                	System.out.println("---------------------");
                    System.out.println("   FIM DO PROGRAMA!");
                    System.out.println("---------------------");
                break;
                default:
                    System.out.println("Digite uma opção valida");
            }
            
        } while (opcao != '0');
        ler.close();
    }

}
