package quiz;

import java.util.*;

public class Quiz {
      
    static int tentativas;
    // para contabilizar as chances de cada questão
    static int acertos;
    // para contralizar a quantidar de acertos
    static boolean acertou = false;
    // Para passar para outra questão assim que a pessoa dar a resposta
    static Scanner entrada = new Scanner(System.in);
    // Scanner para interagir com todos
    
    // FUNÇÃO PARA A INTRODUÇÃO
    static void intrucoes() {
        System.out.println("____________________________________________________________________________________");
        
        System.out.println("-E UM JOGO QUE POSSUE 10 PERGUNTAS DE MULTIPLA ESCOLHA, SO TENDO 1 CHANCE POR QUESTAO-");
        System.out.println("-               AO FINAL, SERA CONTADO O NUMERO DE ACERTOS QUE OBTEVE!             -");
        System.out.println("_____________________________________________________________________________________");
    }
    
    // FUNÇÃO PARA OS CREDITOS
    static void creditos() {
        System.out.println("_________________________________________________________");
        System.out.println("Jogo criado por: LUCAS M, MAYCON M, THIAGO E  GABRIEL S");
        System.out.println("                    _____2023_____                        ");
        System.out.println("              Esse jogo e baseado no quiz              ");
        System.out.println("__________________________________________________________");
    }
    
    // FUNÇÃO PARA SAIR DO JOGO
    static void sair() {
        System.out.println("----------------------------");
        System.out.println("VOCE ESCOLHEU SAIR DO JOGO :( ");
        System.out.println("----------------------------");
    }
    
    // FUNÇÃO PARA A PAUSA DE CADA AÇÃO
    static void pausa() {
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("Tecle o enter para continuar...");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        try {
            System.in.read();
            entrada.nextLine();
        } catch (Exception e) {
        }
    }
    
    // FUNÇÃO PARA A PERGUNTA
    static void pergunta1() {
        String alternativa;
        int contador = 0;
        do {
            System.out.println("PERGUNTA 1:");
            System.out.println("Quem foi o primeiro hokage?");
            System.out.println("a) Minato Namikaze");
            System.out.println("b) Naruto Uzumaki");
            System.out.println("c) Tsunade Senju");
            System.out.println("d) Kakashi Hatake");
            System.out.println("e) Hashirama Senju"); // resposta correta
            System.out.println("DIGITE A ALTERNATIVA: ");
            alternativa = entrada.next();
            switch (alternativa) {
                case "e":
                case "E":
                    acertou = true;
                    contador = contador + 1;
                    acertos = acertos + 1;
                    tentativas = tentativas + 1;
                    break;
                case "b":
                case "B":
                case "c":
                case "C":
                case "d":
                case "D":
                case "a":
                case "A":
                    contador = contador + 1;
                    break;
                default:
                    System.out.println("Escolha invalida!");
                    contador = contador + 1;
            }
        } while (!acertou && contador < 1);
    }
    
    // FUNÇÃO PARA A PERGUNTA
    static void pergunta2() {
        String alternativa2;
        int contador = 0;
        do {
            System.out.println("PERGUNTA 2:");
            System.out.println("Quem Matou Haku?");
            System.out.println("a) Sasuke Uchiha");
            System.out.println("b) Naruto Uzumaki");
            System.out.println("c) Kakashi Hatake"); // resposta correta
            System.out.println("d) Zabuza Momochi");
            System.out.println("e) Sakura Haruno");
            System.out.println("DIGITE A ALTERNATIVA: ");
            alternativa2 = entrada.next();
            switch (alternativa2) {
                case "c":
                case "C":
                    acertou = true;
                    contador = contador + 1;
                    acertos = acertos + 1;
                    tentativas = tentativas + 1;
                    break;
                case "b":
                case "B":
                case "a":
                case "A":
                case "d":
                case "D":
                case "e":
                case "E":
                    contador = contador + 1;
                    break;
                default:
                    System.out.println("Escolha invalida!");
                    contador = contador + 1;
            }
        } while (!acertou && contador < 1);

    }
    
    // FUNÇÃO PARA A PERGUNTA
    static void pergunta3() {
        String alternativa3;
        int contador = 0;
        do {
            System.out.println("PERGUNTA 3:");
            System.out.println("Quem se ofereceu para dar as resposta da prova chunin para Naruto?");
            System.out.println("a) Sasuke Uchiha");
            System.out.println("b) Sakura Haruno");
            System.out.println("c) Shikamaru Nara");
            System.out.println("d) Hinata Hyuuga"); // resposta correta
            System.out.println("e) Ino Yamanaka");
            System.out.println("DIGITE A ALTERNATIVA: ");
            alternativa3 = entrada.next();
            switch (alternativa3) {
                case "d":
                case "D":
                    acertou = true;
                    contador = contador + 1;
                    acertos = acertos + 1;
                    break;
                case "a":
                case "A":
                case "c":
                case "C":
                case "b":
                case "B":
                case "e":
                case "E":
                    contador = contador + 1;
                    break;
                default:
                    System.out.println("Escolha invalida!");
                    contador = contador + 1;
            }
        } while (!acertou && contador < 1);

    }
    
    // FUNÇÃO PARA A PERGUNTA
    static void pergunta4() {
        String alternativa4;
        int contador = 0;
        do {
            System.out.println("PERGUNTA 4:");
            System.out.println("Qual membro da Akatsuki possui mais chakra?");
            System.out.println("a) Pain");
            System.out.println("b) Obito Uchiha");
            System.out.println("c) Kisame Hoshikage"); // resposta correta
            System.out.println("d) Itache Uchina");
            System.out.println("e) Deidara");
            System.out.println("DIGITE A ALTERNATIVA: ");
            alternativa4 = entrada.next();
            switch (alternativa4) {
                case "c":
                case "C":
                    acertou = true;
                    contador = contador + 1;
                    acertos = acertos + 1;
                    break;
                case "b":
                case "B":
                case "a":
                case "A":
                case "d":
                case "D":
                case "e":
                case "E":
                    contador = contador + 1;
                    break;
                default:
                    System.out.println("Escolha invalida!");
                    contador = contador + 1;
            }
        } while (!acertou && contador < 1);

    }
    
    // FUNÇÃO PARA A PERGUNTA
    static void pergunta5() {
        String alternativa5;
        int contador = 0;
        do {
            System.out.println("PERGUNTA 5:");
            System.out.println("Qual o nome da espada do Kisame Hoshigake?");
            System.out.println("a) Kabutowari");
            System.out.println("b) Kubikiribocho");
            System.out.println("c) Shibuki");
            System.out.println("d) Hiramekarei");
            System.out.println("e) Samehada"); // resposta correta
            System.out.println("DIGITE A ALTERNATIVA: ");
            alternativa5 = entrada.next();
            switch (alternativa5) {
                case "e":
                case "E":
                    acertou = true;
                    contador = contador + 1;
                    acertos = acertos + 1;
                    break;
                case "b":
                case "B":
                case "c":
                case "C":
                case "d":
                case "D":
                case "a":
                case "A":
                    contador = contador + 1;
                    break;
                default:
                    System.out.println("Escolha invalida!");
                    contador = contador + 1;
            }
        } while (!acertou && contador < 1);

    }
    
    // FUNÇÃO PARA A PERGUNTA
    static void pergunta6() {
        String alternativa6;
        int contador = 0;
        do {
            System.out.println("PERGUNTA 6:");
            System.out.println(" Quem são os integrantes da equipe 7 ? ");
            System.out.println("a) Gaara, Kakuro e Temari ");
            System.out.println("b) Sasuke, Naruto e Sakura "); // Resposta Correta
            System.out.println("c) Neji, Rock Lee e Tentei ");
            System.out.println("d) Shikamaru, Choji e Ino ");
            System.out.println("e) Kiba, Shino e Hinata ");
            System.out.println("DIGITE A ALTERNATIVA: ");
            alternativa6 = entrada.next();
            switch (alternativa6) {
                case "b":
                case "B":
                    acertou = true;
                    contador = contador + 1;
                    acertos = acertos + 1;
                    break;
                case "a":
                case "A":
                case "c":
                case "C":
                case "d":
                case "D":
                case "e":
                case "E":
                    contador = contador + 1;
                    break;
                default:
                    System.out.println("Escolha invalida!");
                    contador = contador + 1;
            }
        } while (!acertou && contador < 1);

    }
    
    // FUNÇÃO PARA A PERGUNTA
    static void pergunta7() {
        String alternativa7;
        int contador = 0;
        do {
            System.out.println("PERGUNTA 7:");
            System.out.println(" Quem recebeu o título de demônio da nevoa oculta ? ");
            System.out.println("a) Kakashi Hatake ");
            System.out.println("b) Kisame Hoshigaki ");
            System.out.println("c) Itachi Uchiha ");
            System.out.println("d) Zabuza Momochi "); // Resposta Correta
            System.out.println("e) Suigetsu ");
            System.out.println("DIGITE A ALTERNATIVA: ");
            alternativa7 = entrada.next();
            switch (alternativa7) {
                case "d":
                case "D":
                    acertou = true;
                    contador = contador + 1;
                    acertos = acertos + 1;
                    break;
                case "b":
                case "B":
                case "c":
                case "C":
                case "a":
                case "A":
                case "e":
                case "E":
                    contador = contador + 1;
                    break;
                default:
                    System.out.println("Escolha invalida!");
                    contador = contador + 1;
            }
        } while (!acertou && contador < 1);

    }
    
    // FUNÇÃO PARA A PERGUNTA
    static void pergunta8() {
        String alternativa8;
        int contador = 0;
        do {
            System.out.println("PERGUNTA 8:");
            System.out.println(" A Frase: *Aqueles que quebram as regras são chamados de lixo, mas aqueles que abandonam os seus amigos são piores que lixo.* É dita por qual personagem ? ");
            System.out.println("a) Obito Uchiha "); // Resposta Correta
            System.out.println("b) Naruto Uzumaki ");
            System.out.println("c) Kakashi Hatake ");
            System.out.println("d) Hashirama Senju ");
            System.out.println("e) Gaara ");
            System.out.println("DIGITE A ALTERNATIVA: ");
            alternativa8 = entrada.next();
            switch (alternativa8) {
                case "a":
                case "A":
                    acertou = true;
                    contador = contador + 1;
                    acertos = acertos + 1;
                    break;
                case "b":
                case "B":
                case "c":
                case "C":
                case "d":
                case "D":
                case "e":
                case "E":

                    contador = contador + 1;
                    break;
                default:
                    System.out.println("Escolha invalida!");
                    contador = contador + 1;
            }
        } while (!acertou && contador
                < 1);

    }
    
    // FUNÇÃO PARA A PERGUNTA
    static void pergunta9() {
        String alternativa9;
        int contador = 0;
        do {
            System.out.println("PERGUNTA 9:");
            System.out.println(" Quem foi o ninja que aniquilou o clã Uchiha ? ");
            System.out.println("a) Hashirama Senju ");
            System.out.println("b) Sasuke Uchiha ");
            System.out.println("c) Madara Uchiha ");
            System.out.println("d) Itachi Uchiha "); // Resposta Correta
            System.out.println("e) Nagato Uzumaki ");
            System.out.println("DIGITE A ALTERNATIVA: ");
            alternativa9 = entrada.next();
            switch (alternativa9) {
                case "d":
                case "D":
                    acertou = true;
                    contador = contador + 1;
                    acertos = acertos + 1;
                    break;
                case "b":
                case "B":
                case "c":
                case "C":
                case "a":
                case "A":
                case "e":
                case "E":
                    contador = contador + 1;
                    break;
                default:
                    System.out.println("Escolha invalida!");
                    contador = contador + 1;
            }
        } while (!acertou && contador < 1);

    }
    
    // FUNÇÃO PARA A PERGUNTA
    static void pergunta10() {
        String alternativa10;
        int contador = 0;
        do {
            System.out.println("PERGUNTA 10:");
            System.out.println(" Qual o maior sonho do Naruto Uzumaki ? ");
            System.out.println("a) Ser igual o Gabriel ");
            System.out.println("b) Lutar com o Sasuke ");
            System.out.println("c) Se tornar hokage "); // Resposta Correta
            System.out.println("d) Se casar com a Sakura ");
            System.out.println("e) Se tornar um Ninja ");
            System.out.println("DIGITE A ALTERNATIVA: ");
            alternativa10 = entrada.next();
            switch (alternativa10) {
                case "c":
                case "C":
                    acertou = true;
                    contador = contador + 1;
                    acertos = acertos + 1;
                    break;
                case "b":
                case "B":
                case "a":
                case "A":
                case "d":
                case "D":
                case "e":
                case "E":
                    contador = contador + 1;
                    break;
                default:
                    System.out.println("Escolha invalida!");
                    contador = contador + 1;
            }
        } while (!acertou && contador < 1);

    }
    
    // FUNÇÃO MAIN PARA JUNÇÕES DAS OUTRAS FUNÇÕES
    public static void main(String[] args) {

        String nome;
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        while (!nome.toLowerCase().equals("menu")) {

            System.out.println("Bem Vindo " + nome + "!");
            System.out.println("Digite menu para acessar");
            nome = entrada.nextLine();

        }

        System.out.println("_____________________________________");
        System.out.println("                                     ");
        System.out.println("___SEJA BEM VINDO AO QUIZ NARUTO___");
        System.out.println("_____________________________________");
        int opcao;
        do {
            System.out.println("(1) JOGAR");
            System.out.println("(2) INSTRUÇÕES");
            System.out.println("(3) CREDITOS");
            System.out.println("(4) SAIR");

            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    jogar();
                    break;
                case 2:
                    intrucoes();
                    pausa();
                    break;
                case 3:
                    creditos();
                    pausa();
                    break;
                case 4:
                    sair();
                    break;
                default:
                    System.out.println("**Opção inválida!**");
            }
        } while (opcao != 4);
    }

    static void jogar() {
        pergunta1();
        System.out.println("\n");
        pergunta2();
        System.out.println("\n");
        pergunta3();
        System.out.println("\n");
        pergunta4();
        System.out.println("\n");
        pergunta5();
        System.out.println("\n");
        pergunta6();
        System.out.println("\n");
        pergunta7();
        System.out.println("\n");
        pergunta8();
        System.out.println("\n");
        pergunta9();
        System.out.println("\n");
        pergunta10();
        System.out.println("\n");
        System.out.println("____________________________________________ ");
        System.out.println("                                              ");
        System.out.println("VOCE ACERTOU= " + acertos + " QUESTOES DE 10!");
        System.out.println("FIM DO JOGO! Obrigado por jogar!");
        System.out.println("_____________________________________________");
        pausa();
    }

}
 	