
package piproject;


import java.util.Random;
import java.util.Scanner;



public class PI {
    
    static Scanner entrada =  new Scanner(System.in);
    
    static int[] questoes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,15,16};
    static int i = 1, hist = 1;
    static String correta, resposta;

    public static void embaralhaQuestoes() {

        Random random = new Random();

        for (int i = 0; i < (questoes.length - 1); i++) {

            //sorteia um índice
            int j = random.nextInt(questoes.length);

            //troca o conteúdo dos índices i e j do vetor
            int temp = questoes[i];
            questoes[i] = questoes[j];
            questoes[j] = temp;
        }

    }
    public static void historia(){
    	//imprime uma parte da historia
        switch(hist){
            case 1:
                System.out.println("Programa de cumprimentos!\n" +
                        " O MCP, um programa criado para dominação, assumiu o controle de muitos dos sistemas e programas do mundo. No mundo real, a ENCOM\n" +
                        "é uma enorme mega-corp, devorando muitas empresas menores em uma tentativa de controlar a economia mundial.\n" +
                        "O MCP secretamente executa o ENCOM, enquanto se esconde na sombra do Senior\n" +
                        "VP executivo Edward Dillinger. No entanto, existe outro mundo, um mundo virtual onde os\n" +
                        "os programas trabalham em um estado prisional sob as regras do Programa de Controle Mestre; um mundo onde programas\n" +
                        "são feitos para lutar e desistir em uma arena de combate. Alguns dos programas mais rebeldes surgiram\n" +
                        "contra a tirania do MCP. Este é o mundo em que você vive, programa.\n" +
                        "O mundo de TRON.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Existem dois mundos, o mundo real e o mundo virtual.\n" +
                        "No mundo real, você está tentando invadir o mainframe da ENCOM para tentar encontrar a prova de que precisa, acusar o vice-presidente executivo sênior de roubar suas ideias de videogame. As mesmas ideias de jogos que colocaram Dillinger no lugar em que ele está atualmente.\n" +
                        "Com a ajuda de Allen, o criador do programa TRON e Lora, cientista, ele invade a ENCOM para acessar o computador principal. No entanto, o MCP tem outros planos e usa um\n" +
                        "laser experimental de transferência de dados, que transforma material orgânico em um\n" +
                        "fluxo de dados e vice-versa, para transferir você para o mundo virtual do MCP. Enquanto isso, Allen começa a executar o TRON, um programa de vigilância que desligará qualquer atividade não programada entre a ENCOM e outros sistemas no restante do mundo. Uma vez lá dentro, você deve sair da grade do jogo e ajudar TRON a derrotar o MCP. Só então, você será capaz de retornar ao mundo real.\n");
                break;
            case 2:
                System.out.println("Após ser transferido para um mundo virtual, você acorda assustado com alguém gritando e em     seguida sente uma pancada na nuca, desmaiando.\n" +
                        "\n" +
                        "Acorda em uma prisão com outras pessoas e até mesmo você vestindo roupas futuristas com luzes de neon azuis, logo ouve uma pancada na sua cela, um guarda truculento com um bastão comprido em mãos.\n" +
                        "\n" +
                        "O guarda abre a cela e praticamente te arrasta juntamente com outros prisioneiros até um campo  de treinamento onde o comandante Sark lhes recepciona e entrega um disco onde todos os seus dados serão armazenados. O programa que perder seu disco, será destruído. Os programas serão colocados para duelar uns com os outros até a morte ou até que abram mão da fé nos usuários, se ajoelhando perante o MCP.\n" +
                        "\n" +
                        "Um guarda ordena que o acompanhe junto com outro programa até uma sala de combate, você e o outro programa são colocados para duelar.\n");
                break;
            case 3:
                System.out.println("O duelo para com seu oponente prestes a cair em um precipício,  Sark ordena que você o elimine, mas você não obedece suas ordens, Sark imediatamente mata seu oponente.\n" +
                        "\n" +
                        "Guardas entram na sala de combate e o arrastam até uma arena de motos, o colocando juntamente com RAM e TRON, dando início a um combate contra seguidores do MCP.");
                break;
            case 4:
                System.out.println("Vocês vencem, com o combate parte da parede da arena é destruída e vocês conseguem escapar, se refugiando em uma caverna. TRON começa a falar sobre os planos para destruir o MCP, vocês precisam chegar até uma torre de comunicação para baixar no disco os dados necessários para destruir o MCP.\n" +
                        "\n" +
                        "\n" +
                        "O som de tanques se aproximando os alertam, vocês imediatamente correm para as motos, mas um tanque os avista na saída e dispara.");
                 break;
            case 5:
                System.out.println("Você consegue desviar do tiro, mas RAM é atingido e não sobrevive.\n" +
                        "\n" +
                        "Você e TRON conseguem chegar até uma torre de comunicação e logo na entrada veem uma tropa se aproximando, se escondam e tentam capturar dois guardas para roubar seus trajes e se infiltrar.\n" +
                        "\n" +
                        "Vocês conseguem chegar até o guardião da torre, será necessário o convencer a deixa-los passar.\n");
                break;
            case 6:
                System.out.println("O guardião os deixa passar, mas vocês tem que ser rápidos, porque Sark está tentando entrar na sala. Tron chama pelo seu usuário, ergue seu disco e uma luz o atinge transferindo os dados necessários para destruir o MCP.\n" +
                        "\n" +
                        "Minutos antes de Sark conseguir derrubar o portão, você e TRON conseguem fugir da sala, correndo até um hangar de aeronaves. Tron inicia a decolagem da aeronave, porém você  que atrasar os guardas.");
                break;
            case 7:
                System.out.println("Vocês escapam das garras de Sark e partem para longe do domínio do MCP. Sark começa a perseguí-lo e o captura. A nave de Sark o leva até MCP, você e TRON conseguem se soltar, entram em confronto com Sark.");
                break;
            case 8:
                System.out.println("Após a vitória contra Sark parte em direção ao MCP onde deverá deté-lo.\n");
                break;
            case 9:
                System.out.println("Você se joga dentro da torre de energia do MCP tomando controle temporariamente e permitindo que TRON destrua o MCP.");
                break;
        }
    }
    public static void questoes(){
    	//imprime uma questão
        switch (questoes[i]){
            case 1:
                System.out.println("1) Qual o valor de 255 decimal em binários?");
                System.out.println("a) 1111 1111");
                System.out.println("b) 1010 1110");
                System.out.println("c) 1110 1010");
                System.out.println("d) 1001 0101");
                System.out.println("e) 1011 1110");
                //atribui a alternativa correta de acordo com cada questão
                correta = "a";
                break;
                
            case 2:
                System.out.println("2) Qual o valor de 0001 1110 1100 binário em decimal");
                System.out.println("a) 122");
                System.out.println("b) 392");
                System.out.println("c) 332");
                System.out.println("d) 500");
                System.out.println("e) 492");
                correta = "e";
                break;
                
            case 3:
                System.out.println("3) Qual o valor de 456 decimal em octal?");
                System.out.println("a)710");
                System.out.println("b)700");
                System.out.println("c)610");
                System.out.println("d)350");
                System.out.println("e)800");
                correta = "a";
                break;
                
            case 4:
                System.out.println("4) Qual o valor de 712 em octal para decimal?");
                System.out.println("a)492");
                System.out.println("b)450");
                System.out.println("c)458");
                System.out.println("d)712");
                System.out.println("e)112");
                correta = "c";
                break;
                
            case 5:
                System.out.println("5) Qual o valor de 3212 em decimal para decimal?");
                System.out.println("a)12000");
                System.out.println("b)12818");
                System.out.println("c)32000");
                System.out.println("d)7500");
                System.out.println("e)3122");
                correta = "b";
                break;
                
            case 6:
                System.out.println("6) Qual o valor máximo que podemos obter com 4 bits?");
                System.out.println("a)15");
                System.out.println("b)12");
                System.out.println("c)16");
                System.out.println("d)24");
                System.out.println("e)4");
                correta = "a";
                break;
                
            case 7:
                System.out.println("7) Converta 0,82328 em binário: ");
                System.out.println("a)11100100001");
                System.out.println("b)111000010100");
                System.out.println("c)0011000111100");
                System.out.println("d)10100000110011000");
                System.out.println("e)01010000111110");
                correta = "d";
                break;
                
            case 8:
                System.out.println("8) Qual o resultado da adição binária de 10010 + 10011");
                System.out.println("a)101001");
                System.out.println("b)100101");
                System.out.println("c)100111");
                System.out.println("d)11101");
                System.out.println("e)111001");
                correta = "b";
                break;
                
            case 9:
                System.out.println("9)O resultado da multipicação binaria de 11001 x 1010: ");
                System.out.println("a)10001011");
                System.out.println("b)11010011");
                System.out.println("c)11111010");
                System.out.println("d)10001111");
                System.out.println("e)11110001");
                correta = "c";
                break;
                
                case 10:
                System.out.println("10)O resultado da subtração binaria de 100111 - 10110: ");
                System.out.println("a)1111");
                System.out.println("b)1011");
                System.out.println("c)11");
                System.out.println("d)10001");
                System.out.println("e)1001");
                correta = "d";
                break;
                      case 11:
                System.out.println("11)O resultado da divisão binaria de 100110/101000 : ");
                System.out.println("a)1000");
                System.out.println("b)1011");
                System.out.println("c)110");
                System.out.println("d)101");
                System.out.println("e)11101");
                correta = "a";
                break;  
                
                case 12:
                System.out.println("12)Qual a porta responsável pela inversão de nível lógico: ");
                System.out.println("a)XNOR");
                System.out.println("b)XOR");
                System.out.println("c)OR");
                System.out.println("d)NOT");
                System.out.println("e)AND");
                correta = "d";
                break;
                case 13:
                System.out.println("13)Qual a porta responsável por verificar se todas as suas unidades tem nível lógico igual a 1: ");
                System.out.println("a)XNOR");
                System.out.println("b)XOR");
                System.out.println("c)OR");
                System.out.println("d)NOT");
                System.out.println("e)AND");
                correta = "e";
                break;
                case 14:
                System.out.println("14)Qual a porta é responsável por verificar se pelo menos uma entrada tem o seu o nível lógico 1: ");
                System.out.println("a)XNOR");
                System.out.println("b)XOR");
                System.out.println("c)OR");
                System.out.println("d)NOT");
                System.out.println("e)AND");
                correta = "c";
                break;
                case 15:
                System.out.println("15)Qual a porta responsável por verificar se somente 1 de seus componentes tem seu nível lógico 1: ");
                System.out.println("a)XNOR");
                System.out.println("b)XOR");
                System.out.println("c)OR");
                System.out.println("d)NOT");
                System.out.println("e)AND");
                correta = "b";
                break;
                case 16:
                System.out.println("15)Qual a porta responsável por verificar se todas as entradas tem o mesmo nível lógico: ");
                System.out.println("a)XNOR");
                System.out.println("b)XOR");
                System.out.println("c)OR");
                System.out.println("d)NOT");
                System.out.println("e)AND");
                correta = "a";
                break;
                        
        }
    }
    public static void alternativas(){
        //recebe uma das alternativas escolhidas pelo jogador
        resposta = entrada.next();
        //verifica a resposta dada pelo jogador
                if(resposta.equals(correta)){
                    System.out.println("Resposta correta!!!");
                    System.out.println("Resposta correta!!!");
                    System.out.println("Resposta correta!!!");
                } else{
                    System.out.println("Resposta incorreta!!!/nTente novamente!!!");
                    System.out.println("Resposta incorreta!!!/nTente novamente!!!");
                    System.out.println("Resposta incorreta!!!/nTente novamente!!!");
                }
    }
    public static void dicas(){
    	//imprime uma dica de acordo com cada questão
        switch(questoes[i]){
            case 1:
                System.out.println("Para converter um número decimal para binário, basta realizar divisões sucessivas do número decimal por 2 (base do sistema binário), obtendo o resto de cada divisão e colocando na ordem da última divisão para a primeira. 1337 decimal é igual 0101 0011 1001 binário.\n" +
                        "\n" +
                        "\n" +
                        "Ex.: 1337/2 | resto 1     /\\ \n" +
                        "\t    668/2 | resto 0     |\n" +
                        "\t    334/2 | resto 0     |\n" +
                        "\t    167/2 | resto 1     |\n" +
                        "\t     83/2 | resto 1     |\n" +
                        "\t     41/2 | resto 1     |\n" +
                        "\t     20/2 | resto 0     |\n" +
                        "\t     10/2 | resto 0     |\n" +
                        "\t      5/2 | resto 1     |\n" +
                        "\t      2/2 | resto 0     |\n" +
                        "\t      1/2 | resto 1     |\n" +
                        "\t      0/2 | resto 0     |\n" +
                        "\n");
                break;
            case 2:
                System.out.println("o sistema binário só possui 2 algarismos. Cada posição tem um peso de uma potência de 2 (base do sistema binário). Sendo assim, para se converter um número de binário para decimal, deve-se multiplicar cada bit pela potência de sua posição e somar os resultados.\n" +
                        " \n" +
                        "Por exemplo, a conversão do número 10112  para decimal é feita da seguinte forma:\n" +
                        "\n" +
                        "    Binário      |                        1                             |   0    |    1     |    1    |\n" +
                        "Valor da posição |                     1 X 2³                           | 0 X 2² |   1 X 2¹ |  1 X 20 |\n" +
                        "\t\t             |                        8                             |     0  |     2    |    1    |\n" +
                        "    Resultado    |        8+0+2+1 = 11 decimal                          |        |          |         |");
                break;
            case 3:
                System.out.println("Para converter um número decimal para octal, basta realizar divisões sucessivas do número decimal por 8 (base do sistema binário), obtendo o resto de cada divisão e colocando na ordem da última divisão para a primeira. 1337 decimal é igual a 02471 octal\n" +
                        "\n" +
                        "\n" +
                        "Ex.:  1337/8 | resto 1     /\\\n" +
                        "     \t167/8 | resto 7     |\n" +
                        "    \t  20/8 | resto 4     |\n" +
                        "   \t    2/8 | resto 2     |\n" +
                        "         0/8 | resto 0     |");
                break;
            case 4:
                System.out.println("o sistema octal possui 8 algarismos. Cada posição tem um peso de uma potência de 8 (base do sistema octal). Sendo assim, para se converter um número de octal para decimal, deve-se multiplicar cada bit pela potência de sua posição e somar os resultados.\n" +
                        " \n" +
                        "Por exemplo, a conversão do número 10112  para decimal é feita da seguinte forma:\n" +
                        " \n" +
                        "\n" +
                        "        Binário      |                      2                      |    4   |      7     |    1   |\n" +
                        "    Valor da posição |                    2 X 8³                   | 4 X 8² |   7 X 8¹   | 1 X 80 |\n" +
                        "\t\t                 |                    1024                     |   256  |     56     |    1   |\n" +
                        "        Resultado    |        1024+256+56+1 = 1337 decimal         |        |            |        |");
                break;
            case 5:
                System.out.println("o sistema hexadecimal possui 16 algarismos, sendo 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A(10), B(11), C(12), D(13), E(14), F(15). Cada posição tem um peso de uma potência de 16 (base do sistema hexadecimal). Sendo assim, para se converter um número de hexadecimal para decimal, deve-se multiplicar cada bit pela potência de sua posição e somar os resultados.\n" +
                        " \n" +
                        "Por exemplo, a conversão do número 53910  para decimal é feita da seguinte forma:\n" +
                        "\n" +
                        "\n" +
                        "    \tBinário     |                    5                      |     3     |     9     |\n" +
                        " Valor da posição |                  5 X 16²                  |  3 X 16¹  |   9 X 160 |\n" +
                        "\t\t\t            |                   1280                    |    48     |     9     |\n" +
                        "    Resultado     |    1280+48+9 = 1337 decimal|              |           |           |");
                break;
            case 6:
                System.out.println("Com n bits podemos contar até um número\n" +
                        "igual a (2^n)-1\n" +
                        "\n" +
                        "Ex.: O número decimal máximo obtido com um número binário de 4 dígitos(1111) é (2^4)-1 que resulta em 15.");
                break;
            case 7:
                System.out.println("Exemplo:\n" +
                        "Converta 0,7812510 para binário\n" +
                        "\n" +
                        "0,78125 x 2 = 1,5625\n" +
                        "0,5625 x 2 = 1,125\n" +
                        "0,125 x 2 = 0,25\n" +
                        "0,25 x 2 = 0,5\n" +
                        "0,5 x 2 = 1\n" +
                        "\n" +
                        "E então temos 0,110012");
                break;
            case 8:
                System.out.println("*As quatro regras básicas para adição de números binários são:\n" +
                        "\t\n" +
                        "\t0+0=0    Resultado: 0; carry: 0\n" +
                        "\t0+1=1    Resultado: 1; carry: 0\n" +
                        "\t1+0=1    Resultado: 1; carry: 0\n" +
                        "\t1+1=10  Resultado: 0; carry: 1\n" +
                        "\n" +
                        "\n" +
                        "      1    <--|       \n" +
                        "  1001    |     Soma 1+1=0 e  resta 1.\n" +
                        "+0101    |     O resto sobe para a\n" +
                        "---------   |     soma da próxima casa.\n" +
                        "  1110    |\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "  1 1 1                      Observe o caso da primeira e\n" +
                        "  1011            segunda colunas, 1+1=0\n" +
                        "+0111           e resta 1, na próxima ficaria\n" +
                        "----------         1+1+1=3, nesse caso será 1\n" +
                        "  10010         e restará 1 para a próxima casa.");
                break;
            case 9:
                System.out.println("*As quatro regras básicas para multiplicação de números binários são:\n" +
                        "\n" +
                        "0x0=0\n" +
                        "0x1=0\n" +
                        "1x0=0\n" +
                        "1x1=1\n" +
                        "\n" +
                        "Exemplo:\n" +
                        "\n" +
                        "\t11\n" +
                        "      X  11\n" +
                        "   -------------\n" +
                        "         1 11\n" +
                        "     +  11\n" +
                        "     -----------\n" +
                        "        1001");
                break;
            case 10:
                System.out.println("As quatro regras básicas para subtração de números binários são:\n" +
                        "\n" +
                        "0-0=0\n" +
                        "1-1=0\n" +
                        "1-0=1\n" +
                        "0-1=1 sendo o empréstimo igual a 1\n" +
                        "\n" +
                        "Exemplo:\n" +
                        "\n" +
                        "       1011\n" +
                        "-> -  1101\n" +
                        "|    -----------\n" +
                        "|     0110\n" +
                        "-------|\n" +
                        "Transporte");
                break;
            case 11:
                System.out.println("*A divisão binária segue as mesmas regras da divisão decimal.\n" +
                        "\n" +
                        "\n" +
                        "1101 |1101\n" +
                        "101    ------------\n" +
                        "------        10");
                break;
            case 12:
                System.out.println("*Porta NãO ou NOT\n" +
                        "*É a porta lógica mais básica e simples\n" +
                        "*Ela é composta de apenas uma entrada e uma saída.\n" +
                        "*Ela inverte o estado lógico da sua entrada\n" +
                        "*Se colocarmos um nível lógico 1 na entrada a saída será zero, isto é, ela faz a inversão lógica da sua entrada.");
                break;
            case 13:
                System.out.println("A porta AND que é composta por duas ou mais entradas e uma saída tem a função de verificar se todos seus componentes tem o nível lógico 1.");
                break;
            case 14:
                System.out.println("A porta OR que é composta por duas ou mais entradas e uma saída tem a função de verificar se ao menos um de seus componentes tem o nível lógico 1.\n");
                break;
            case 15:
                System.out.println("A porta XOR que é composta por duas ou mais entradas e uma saída tem a função de verificar se somente um de seus componentes tem o nível lógico 1.\n");
                break;
            case 16:
                System.out.println("A porta XNOR que é composta por duas ou mais entradas e uma saída tem a função de verificar se todos  os seus componentes tem o nível lógico 1.");
                break;
        }
    }
    public static void main(String[] args) {
        
        int opcao = 1;
        //inicializa o menu
        do {
            System.out.println("\n\n ### TRON ### \n");

            System.out.println(" 1 - Start       |");

            System.out.println(" 2 - Instruções    |");

            System.out.println(" 3 - Créditos      |");

            System.out.println(" 4 - Sair          |");

            opcao = entrada.nextInt();

            System.out.print("\n");

            switch (opcao) {
                case 1:

                    System.out.println("Loading...\n\n");
                    opcao = 0;
                            

                    break;

                case 2:
                    
                    System.out.println("Para jogar este jogo, você deverá ter conhecimento brévio na matéria de Conceitos de computação, do Professor Marcelo Marcelino"
                            + " já que as questões sobre o jogo são relacionados a números binários e portas lógicas.");

                    
                    break;

                case 3:
                    
                     System.out.println("Desenvolvido por Saulo Almeida, Rodrigo Santana, Igor Oliveira !");
                    break;
                    
                case 04:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);
        //inicio o jogo
        embaralhaQuestoes();
        for(int a = 1; a < (questoes.length); i++) {
            historia();
         do {
             questoes();
             alternativas();
             for(a = 4; a>0;a--) {
            	 System.out.println("--------------------------------------------------------------------------------------------------------------");
             }
             dicas();
             for(a = 4; a>0;a--) {
            	 System.out.println("--------------------------------------------------------------------------------------------------------------");
             }
         } while(!resposta.equals(correta));
         i++;
         hist++;
        }
    }
}   