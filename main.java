
import java.util.Scanner;

public class Main {
    
    public static char menu(){
        String msg;
        System.out.println("### Mini Projeto ###");
        System.out.println("1: Cadastrar Aluno");
        System.out.println("2: Listar Alunos");
        System.out.println("3: Procurar Aluno");
        System.out.println("4: Remover Aluno");
        System.out.println("0: Sair");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ListaSimples lista = new ListaSimples();
        Aluno a;
        char opcao;
        
        do {
            opcao = menu();
            switch(opcao){
                case '1':
                    a = new Aluno();
                    System.out.print("Digite o RGM: ");
                    a.setRgm(ler.nextInt());
                    lista.inserirPrimeiro(a);
                break;
                case '2':
                    System.out.println("Listar");
                    System.out.println("[ "+lista.imprimirLista()+" ]");
                break;
                case '3':
                    System.out.println("procurar");
                break;
                case '4':
                    System.out.println("remover");
                break;
                case '0':
                    System.out.println("sair");
                break;
                default:
                    System.out.println("Digite uma opção valida");
            }
            
        } while (opcao != '0');
        
    }
    
}
