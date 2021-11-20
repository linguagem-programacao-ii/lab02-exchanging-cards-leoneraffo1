package lab02;

import java.util.*;

public class ECJava {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String str;
        int ncartasA;
        int ncartasB;

        while (true) {
            //define numero de cartas
            System.out.println("Quantas cartas cada uma tem? - Para encerrar o programa digite 0 0");
            str = ler.nextLine();
            List<String> itens = Arrays.asList(str.split("\\s* \\s*"));
            ncartasA = Integer.parseInt(itens.get(0));
            ncartasB = Integer.parseInt(itens.get(1));
            
            if(ncartasA == 0 && ncartasB == 0) {//Para o programa
                break;
            }
            //define quais cartas cada uma tem
            System.out.println("Quais cartas Alice tem?");
            str = ler.nextLine();
            Set<String> colecaoA = new HashSet(Arrays.asList(str.split("\\s* \\s*")));
            System.out.println("Quais cartas Betty tem?");
            str = ler.nextLine();
            Set<String> colecaoB = new HashSet(Arrays.asList(str.split("\\s* \\s*")));

            Set<String> c = colecaoB;


            if (colecaoA.size() < colecaoB.size()){//condicao de troca
                c = colecaoA;
                colecaoA = colecaoB;
            }

            int count = 0;
            for (String x : c){//total de cartas trocadas
                if (!colecaoA.contains(x)) count++;
            }
            System.out.println(count);
        }
    }
}

