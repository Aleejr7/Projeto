package charada;

import java.util.Scanner;

public class jogo_textual {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner (System.in);
        String nome;
        System.out.println("|----------------------------------|");
        System.out.println("|                                  |");
        System.out.println("|            A Charada             |");
        System.out.println("|                                  |");
        System.out.println("|----------------------------------|\n");
        System.out.println(" Um jogo RPG Textual. \n");
        System.out.println("Digite o nome do personagem: ");
        nome = input.next();
        System.out.println("");

        System.out.println("                                    .:::!!!!!!!!!!::                                                           \n"
                + "                                       .:!!!!!!!!!!!!!!!!!!!!!!!:                                                       \n"
                + "                                   .:!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!.                                                    \n"
                + "                                .!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!.                                                  \n"
                + "                              :!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                 \n"
                + "                            :!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!.                                               \n"
                + "                          .!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                               \n"
                + "                        .!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!:                                              \n"
                + "                       :!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!.                                             \n"
                + "                     .:!!!!!!!!!!!!!!!!!!!!::..:!!!!!!!!!!!!!!!!!!!!!!!!!!:                                             \n"
                + "                    .!!!!!!!!!!!!!!!!:.           .!!!!!!!!!!!!!!!!!!!!!!!!                                             \n"
                + "                   :!!!!!!!!!!!!!!!:                :!!!!!!!!!!!!!!!!!!!!!!.                                            \n"
                + "                  :!!!!!!!!!!!!!!:                   !!!!!!!!!!!!!!!!!!!!!!:                                            \n"
                + "                 .!!!!!!!!!!!!!:.                    !!!!!!!!!!!!!!!!!!!!!!:                                            \n"
                + "                .!!!!!!!!!!!!!:                      !!!!!!!!!!!!!!!!!!!!!!.                                            \n"
                + "                :!!!!!!!!!!!!:                       !!!!!!!!!!!!!!!!!!!!!!                                             \n"
                + "                !!!!!!!!!!!!!                       :!!!!!!!!!!!!!!!!!!!!!:                                             \n"
                + "               .::::::::::::     ..                 ::::::::::::::::::::::                                              \n"
                + "               ::::::::::::: .::::::::.            ::::::::::::::::::::::.              ....                            \n"
                + "               ::::::::::::::::::::::::.          .:::::::::::::::::::::.          .:::::::::::::                       \n"
                + "               :::::::::::::::::::::::::         .:::::::::::::::::::::         .:::::::::::::::::::.                   \n"
                + "               :::::::::::::::::::::::::         ::::::::::::::::::::.        .::::::::::::::::::::::::                 \n"
                + "               :::::::::::::::::::::::::        ::::::::::::::::::::         :::::::::::::::::::::::::::.               \n"
                + "               .:::::::::::::::::::::::.       :::::::::::::::::::          ::::::::::::::::::::::::::::::              \n"
                + "                :::::::::::::::::::::::       ::::::::::::::::::.          ::::::::::::::::::::::::::::::::             \n"
                + "                ::::::::::::::::::::::       .::::::::::::::::.           .:::::::::::::::::::::::::::::::::.           \n"
                + "                 ::::::::::::::::::::        :::::::::::::::.             :::::::::::::::::::::::::::::::::::.          \n"
                + "                  :::::::::::::::::         :::::::::::::::               ::::::::::::::.    :::::::::::::::::.         \n"
                + "                     ::::::::::..          ::::::::::::::                 :::::::::::::::      .:::::::::::::::         \n"
                + "                                          .::::::::::::.                  .::::::::::::::       .::::::::::::::.        \n"
                + "                                          ::::::::::::                     :::::::::::::.        .::::::::::::::        \n"
                + "                                         .:::::::::::                       ::::::::::::         .::::::::::::::.       \n"
                + "                                         .::::::::::                          :::::::::.         .:::::::::::::::       \n"
                + "                                         ::::::::::                            ..::::.           ::::::::::::::::       \n"
                + "                                         :::::::::                                             .:::::::::::::::::       \n"
                + "                                         ::::::::                                           .::::::::::::::::::::       \n"
                + "                                         ::::::::                                        :::::::::::::::::::::::.       \n"
                + "                   ..:::::::.            ::::::::                                   ..::::::::::::::::::::::::::        \n"
                + "                .::::::::::::::          .:::::::.                               .:::::::::::::::::::::::::::::         \n"
                + "              ::::::::::::::::::.         ::::::::                             .:::::::::::::::::::::::::::::.          \n"
                + "            :::::::::::::::::::::.         ::::::::.                          :::::::::::::::::::::::::::::             \n"
                + "          .:::::::::::::::::::::::          :::::::::                        .::::::::::::...:::::::::...               \n"
                + "         ::::::::::::....:::::::::           .:::::::::::.                   :::::::::.                                 \n"
                + "        ::::::::::.       .:::::::             .:::::::.                     .:::::::                                   \n"
                + "       .::::::::.         .::::::.                                            .::::::                                   \n"
                + "       ::::::::.          :::::::                                              .::::::                                  \n"
                + "       ::::::::          :::::::                         ..:::::::::::.           ....                                  \n"
                + "       .:::::::.        :::::::.                       .:::::::::::::::.                                                \n"
                + "        .:::::::::     :::::::.                      ::::::::::::::::::.                                                \n"
                + "           .....      .::::::.                     .:::::::::::::::::::.                                                \n"
                + "                      ::::::.                     .:::::::::::::::::::.                                                 \n"
                + "                      .:::::                     .::::::::::::::::::::                                                  \n"
                + "                       :::::.                    .::::::::::::::::::.                                                   \n"
                + "                         ..::.   ..              .::::::::::::::::.                                                     \n"
                + "                             .::::::              :::::::::::::..                                                       \n"
                + "                            .:::::::               .:::::::..                                                           \n"
                + "                            ::::::::                                                                                    \n"
                + "                            ::::::.                                                                                     \n"
                + "                             ...                                                                                        \n"
                + "                                                                                                                        \n");
        System.out.println("Bem vindo ao jogo 'A Charada', " + nome + "\n \nO jogo acontece no espa??o do Senac, no qual voc?? ir?? ter intera????es com o espa??o da Universidade.\n");
        System.out.println("Ser?? apresentado charadas a voc??, os seus resultados ir??o definir o seu futuro. \nDica: usufrua do espa??o, para interagir melhor com o jogo \n \n");
        Thread.sleep(3000);
        
        do {
            System.out.println("----- MENU ----- \n");
            System.out.println("Digite 1 para jogar");
            System.out.println("Digite 2 para ver as instru????es");
            System.out.println("Digite 3 para ver os Cr??ditos");
            System.out.println("Digite 4 para sair \n");

            
            int entrada = cenarios.lerEntradaInt(sc);
            System.out.println("");
            
            switch (entrada) {
                case 1:
                    System.out.println(nome + " ?? um aluno desinteressado nos estudos, at?? que um dia sua familia resolve cobra-lo para come??ar a estudar.");
                    System.out.println("Avisaram o " + nome + ", caso ele seja reprovado ir?? sofrer consequ??ncias.");
                    System.out.println("Diante deste cen??rio, " + nome + " se encontra em uma situa????o horr??vel, pois j?? estamos na reta final e as provas j?? se passaram.");
                    System.out.println(nome + " vai para o SENAC correndo para tentar uma salva????o, chegando la se encontra com um de seus professores na biblioteca,");
                    System.out.println(nome + " explica seu caso para o professor e o mesmo d?? uma solu????o inusitada para o aluno(a)");
                    System.out.println("O professor f?? de charadas, d?? um livro com uma sequ??ncia de charadas, caso " + nome + " conseguir responder todas corretamente, o professor hackeia o sistema do SENAC e aprova o aluno\n");
                    System.out.println(nome + " passa a noite toda estudando o livro e volta no dia seguinte para tentar resolver as charadas.");
                    System.out.println("Chegando ao SENAC voc?? abre o livro na primeira charada:\n \n ");
                    Thread.sleep(3000);
                    String resposta;
                    int contador = 1;

                    // CHARADAS
                    while (contador < 7) {
                        switch (contador) {
                            case 1:
                                System.out.println("-------------------------------------Charada------------------------------------------------------------------------\n");
                                System.out.println("   |Fica dentro de um pequeno espa??o, entretanto seu tamanho tende ao infinito,");
                                System.out.println("   |mas nada ?? ao acaso, precisa ser preparado, treinado e exercitado.");
                                System.out.println("   |Do que estamos falando  ? \n ");
                                System.out.println("--------------------------------------------------------------------------------------------------------------------");
                                Thread.sleep(3000);
                                break;
                            case 2:
                              System.out.println("-------------------------------------Charada------------------------------------------------------------------------\n");
                                System.out.println("   |Durante o dia sou visto no mar");
                                System.out.println("   |a noite sobre o luar,");
                                System.out.println("   |ninguem consegue me alcan??ar, ");
                                System.out.println("   |se voc?? nasceu entre fevereiro e mar??o,");
                                System.out.println("   |contigo posso estar ");
                                System.out.println("   |v??rios vem antes de mim ");
                                System.out.println("   |mas no fim sempre estou l??. \n");
                                System.out.println("   |Quem sou ? \n");
                                System.out.println("--------------------------------------------------------------------------------------------------------------------");
                                Thread.sleep(3000);
                                break;
                            case 3:
                                System.out.println("-------------------------------------Charada------------------------------------------------------------------------\n");
                                System.out.println("   |Sou um s??, p??rem posso me revelar em tr??s pessoas consubstanciais, ");
                                System.out.println("   |express??es ou hip??stases. As tr??s pessoas s??o distintas, ");
                                System.out.println("   |mas s??o uma subst??ncia, ess??ncia ou natureza. ");
                                System.out.println("   |Do que estamos falando ? \n \n");
                                System.out.println("--------------------------------------------------------------------------------------------------------------------");
                                Thread.sleep(3000);
                                break;
                            case 4:
                                System.out.println("-------------------------------------Charada------------------------------------------------------------------------\n");
                                System.out.println("   |Tem uma capivara no centro esportivo... ");
                                System.out.println("   |Qual o nome dela? \n\n");
                                System.out.println("--------------------------------------------------------------------------------------------------------------------");
                                Thread.sleep(3000);
                                break;
                            case 5:
                                System.out.println("-------------------------------------Charada------------------------------------------------------------------------\n");
                                System.out.println("   |Uma arvore sem raizes, um discurso sem som, uma espinha sem ossos. ");
                                System.out.println("   |O que eu sou?");
                                System.out.println("--------------------------------------------------------------------------------------------------------------------");
                                Thread.sleep(3000);
                                break;
                            case 6:
                                System.out.println("-------------------------------------Charada------------------------------------------------------------------------\n");
                                System.out.println("   |Como fica o inimigo do Superman depois da morte dele? rs ");
                                System.out.println("--------------------------------------------------------------------------------------------------------------------");
                                Thread.sleep(3000);
                                break;
                        }

                        // RESPONDER A CHARADA OU USAR O ESPA??O SENAC
                        System.out.println("Para responder a charada voc?? pode escolher: ");
                        System.out.println("*Dica: use o espa??o do SENAC \n");
                        System.out.println("Digite 1 para ir a Entrada");
                        System.out.println("Digite 2 para ir a Biblioteca");
                        System.out.println("Digite 3 para ir ao Predio 1");
                        System.out.println("Digite 4 para ir ao Centro Esportivo");
                        System.out.println("Digite 5 para ir a Lanchonete");
                        System.out.println("Digite 6 para responder a charada \n");
                        
                        int alter = cenarios.lerEntradaInt(sc);
                        System.out.println("");

                        switch (alter) {
                            case 1:
                                cenarios.entrada();
                                break;
                            case 2:
                                cenarios.biblioteca(args);
                                break;
                            case 3:
                                cenarios.predio1(args);
                                break;
                            case 4:
                                cenarios.centroEsportivo(args);
                                break;
                            case 5:
                                cenarios.lanchonete(args);
                                break;
                            case 6:
                                System.out.println("Digite sua resposta: ");
                                resposta = input.next();
                                if (contador == 1) {
                                    if (resposta.toLowerCase().equals("mente")) {
                                        System.out.println("Resposta correta, voc?? ir?? ser direcionado a pr??xima charada\n");
                                        Thread.sleep(2000);
                                        contador++;
                                        break;
                                    } else {
                                        System.out.println("*******Resposta errada!*********");
                                        Thread.sleep(2000);
                                        break;
                                    }

                                } else if (contador == 2) {
                                    if (resposta.toLowerCase().equals("peixes")) {
                                        System.out.println("Resposta correta, voc?? ir?? ser direcionado a pr??xima charada\n");
                                        Thread.sleep(2000);
                                        contador++;
                                        break;
                                    } else {
                                        System.out.println("*******Resposta errada!*********");
                                        Thread.sleep(2000);
                                        break;
                                    }

                                } else if (contador == 3) {
                                    if (resposta.toLowerCase().equals("deus")) {
                                        System.out.println("Resposta correta, voc?? ir?? ser direcionado a pr??xima charada\n");
                                        Thread.sleep(2000);
                                        contador++;
                                        break;
                                    } else {
                                        System.out.println("*******Resposta errada!*********");
                                        Thread.sleep(2000);
                                        break;
                                    }

                                } else if (contador == 4) {
                                    if (resposta.toLowerCase().equals("kapiva")) {
                                        System.out.println("Resposta correta, voc?? ir?? ser direcionado a pr??xima charada\n");
                                        System.out.println("");
                                        Thread.sleep(2000);
                                        contador++;
                                        break;
                                    } else {
                                        System.out.println("*******Resposta errada!*********");
                                        Thread.sleep(2000);
                                        break;
                                    }
                                } else if (contador == 5) {
                                    if (resposta.toLowerCase().equals("livro")) {
                                       System.out.println("Resposta correta, voc?? ir?? ser direcionado a pr??xima charada\n");
                                        System.out.println("");
                                        Thread.sleep(2000);
                                        contador++;
                                        break;
                                    } else {
                                        System.out.println("*******Resposta errada!*********");
                                        Thread.sleep(2000);
                                        break;
                                    }
                                } else if (contador == 6) {
                                    if (resposta.toLowerCase().equals("deluthor")) {
                                        System.out.println("");
                                        Thread.sleep(2000);
                                        contador++;
                                        break;
                                    } else {
                                        System.out.println("*******Resposta errada!*********");
                                        System.out.println("N??o pode ter espa??o entre as palavras!!!!!");
                                        Thread.sleep(2000);
                                        break;
                                    }
                                }
                            default:
                                System.out.println("Op????o Inv??lida\n");
                                break;
                        }
                    }
                    System.out.println(" ...... .. ......... .. ......... .. ......... ^B@@B^ ..... ......... .. ......... .. ......... .. .\n" +
"............................................. ~#@@@@#~ .............................................\n" +
"............................................ ~&@@@@@@&! ............................................\n" +
"........................................... !&@@@#B@@@&! ...........................................\n" +
".......................................... 7@@@@B::B@@@@7 ..........................................\n" +
"......................................... 7@@@@G:  :G@@@@? .........................................\n" +
"........................................ ?@@@@G:.....P@@@@J ........................................\n" +
"....................................... J@@@@P.      .P@@@@Y .......................................\n" +
"...................................... Y@@@@5...755?...5@@@@5.......................................\n" +
".................................... .5@@@@Y.. !@@@@7 . Y@@@@5. ....................................\n" +
"................................... .P@@@@J .. 7@@@@? ...Y@@@@P. ...................................\n" +
".................................. .P@@@@? ... 7@@@@? ... J@@@@G: ..................................\n" +
"................................. :G@@@@? .... 7@@@@? .... ?@@@@G: .................................\n" +
"................................ :B@@@@7 ..... 7@@@@? ..... 7@@@@B^ ................................\n" +
"............................... ^B@@@&! ...... 7@@@@? ...... !@@@@#^ ...............................\n" +
".............................. ^#@@@&~ ....... 7@@@@? ....... !&@@@#~ ..............................\n" +
"............................. ~#@@@#~ .........~#@@&~......... ~&@@@&! .............................\n" +
"............................ ~&@@@#^ ............~~. .......... ^#@@@&! ............................\n" +
"........................... !&@@@B^ ............!JJ!............ ^#@@@@7 ...........................\n" +
".......................... 7@@@@G: ........... !@@@@7 ........... ^B@@@@? ..........................\n" +
"......................... 7@@@@G. ............ ~@@@@! ............ :G@@@@J .........................\n" +
"........................ ?@@@@P.................^77~................:G@@@@J ........................\n" +
"........................J@@@@5.  .  .  ..  .  .     ..  .  .  .  ..  .P@@@@Y. ......................\n" +
".......................Y@@@@G^^~~^~~^~~^~~~^~~^~~^~~~~~~^~~^~~^~~~^~~^~B@@@@5.......................\n" +
"..................... Y@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@5 .....................\n" +
".. .. ...... .. .. .. ?&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&?.. ...... .. .. ......\n");
                    Thread.sleep(2000);
                    System.out.println("Parab??ns voc?? conseguiu concluir todas charadas!");
                    System.out.println("Agora voc?? est?? aprovado e dara 'orgulho' para sua familia\n");
                    Thread.sleep(2000);
                    break;

                case 2:
                    System.out.println("--------------- Como jogar \"A charada\" ---------------\n"
                            + "\n"
                            + "1 - Aproveite o m??ximo de todos ambientes para obter dicas!\n"
                            + "\n"
                            + "2 - Coloque em pratica seu raciocinio l??gico.\n"
                            + "\n"
                            + "3 - Preste aten????o em cada detalhe, pois vai fazer a diferen??a.\n"
                            + "\n"
                            + "4 - Todos nossos cenarios foram pesquisados diretamente dentro do Centro universitario Senac.\n"
                            + "\n"
                            + "5 - As respostas podem ser escritas em mai??sculo ou min??sculo. \n"
                            +"\n"
                            + "6 - Se sua resposta houver mais de uma palavra, n??o utilizar o espa??o entre elas.\n");
                    Thread.sleep(3000);
                    break;

                case 3:
                    System.out.println("Idealizado e Desenvolvido por : Alesandro da Rocha; Augusto Brito; Brenno Lima e Deive Oliveira.\n");
                    System.out.println("Alunos do Curso: An??lise e Desenvolvimento de Sistemas.\n");
                    Thread.sleep(3000);
                    break;

                case 4:
                    System.out.println("At?? mais!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Op????o Inv??lida\n");
                    break;
            }
        } while (true);
        }
    }
