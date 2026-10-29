import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        System.out.println("*** Jogador 1 ***");
        Scanner sc = new Scanner(System.in);

        Jogador j1 = new Jogador();
        System.out.println("Digite o nome do jogador: ");
        j1.nome = sc.nextLine();
        System.out.println("Digite o nick do jogador: ");
        j1.nick = sc.nextLine();
        System.out.println("Digite o idade: ");
        j1.idade = sc.nextInt();
        System.out.println("Digite o jogo favorito: ");
        sc.nextLine();
        j1.jogoFavorito = sc.nextLine();
        while (j1.nivel < 1 || j1.nivel > 100) {
            System.out.println("Digite o nivel: ");
            j1.nivel = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("=== FICHA DO JOGADOR 1 ===" + "\n");
        System.out.println("Nome: " + j1.nome + "\n");
        System.out.println("Nick: " + j1.nick + "\n");
        System.out.println("Idade: " + j1.idade + "\n");
        System.out.println("Jogo favorito: " + j1.jogoFavorito + "\n");
        System.out.println("Nivel: " + j1.nivel + "\n");
        System.out.println("================");



        System.out.println("*** Jogador 2 ***");

        Jogador j2 = new Jogador();
        System.out.println("Digite o nome do jogador: ");
        j2.nome = sc.nextLine();
        System.out.println("Digite o nick do jogador: ");
        j2.nick = sc.nextLine();
        System.out.println("Digite o idade: ");
        j2.idade = sc.nextInt();
        System.out.println("Digite o jogo favorito: ");
        sc.nextLine();
        j2.jogoFavorito = sc.nextLine();
        while (j2.nivel < 1 || j2.nivel > 100) {
            System.out.println("Digite o nivel: ");
            j2.nivel = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("=== FICHA DO JOGADOR 2 ===" + "\n");
        System.out.println("Nome: " + j2.nome + "\n");
        System.out.println("Nick: " + j2.nick + "\n");
        System.out.println("Idade: " + j2.idade + "\n");
        System.out.println("Jogo favorito: " + j2.jogoFavorito + "\n");
        System.out.println("Nivel: " + j2.nivel + "\n");
        System.out.println("================");

    }

}

