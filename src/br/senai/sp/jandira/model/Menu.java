package br.senai.sp.jandira.model;

import br.senai.sp.jandira.model.VooDelta;
import br.senai.sp.jandira.model.VooEmirates;
import br.senai.sp.jandira.model.VooGol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    List<Voo> listVoo = new ArrayList<>();



    public void executarMenu() {

        VooGol vooGol1 = new VooGol("GL-2530", "São Paulo", "Minas Gerais", "2023-11-07", 600);
        VooGol vooGol2 = new VooGol("GL-4350", "Bahia", "Ceara", "2023-11-26", 600);
        VooGol vooGol3 = new VooGol("GL-7898", "Rio de Janeiro", "Fortaleza", "2023-11-30", 600);

        VooDelta vooDelta1 = new VooDelta("DL-8844", "França", "Londres", "2023-11-29", 500);
        VooDelta vooDelta2 = new VooDelta("DL-4499", "Roma", "Espanha", "2023-11-26", 450);
        VooDelta vooDelta3 = new VooDelta("DL-7766", "Paris", "Dubai", "2023-12-15", 400);

        VooEmirates vooEmirates1 = new VooEmirates("ET-0046", "Londres", "Costa Amalfitana", "2023-12-12", 550);
        VooEmirates vooEmirates2 = new VooEmirates("ET-0760", "Dubai", "Maldivas", "2023-12-23", 460);
        VooEmirates vooEmirates3 = new VooEmirates("ET-0877", "Miami", "Londres", "2023-11-29", 480);

        listVoo.add(vooGol1);
        listVoo.add(vooGol2);
        listVoo.add(vooGol3);
        listVoo.add(vooDelta1);
        listVoo.add(vooDelta2);
        listVoo.add(vooDelta3);
        listVoo.add(vooEmirates1);
        listVoo.add(vooEmirates2);
        listVoo.add(vooEmirates3);

        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);

        while (continuar) {
            System.out.println("============== Bem Vindo ==============");
            System.out.println("1- Listar Voo");
            System.out.println("2- Pesquisar Voo");
            System.out.println("3- Sair");
            System.out.println("=======================================");

            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser) {
                case 1:
                    listarVoos();
                    break;

                case 2:
                    System.out.println("Informe o número do voo: ");
                    String numero = scanner.nextLine();
                    pesquisarVoo(numero);
                    break;

                case 3:
                    continuar = false;
                    break;
            }
        }
    }

    public void listarVoos() {
        for (Voo voo : listVoo) {
            System.out.println(voo.getNumeroVoo());
            System.out.println(voo.getOrigem());
            System.out.println(voo.getDestino());
            System.out.println(voo.getDataPartida());
        }
    }

    public void pesquisarVoo(String numeroVoo){
        for (Voo voo : listVoo){
            String vooReal = voo.getNumeroVoo();
            if (vooReal.equalsIgnoreCase(numeroVoo)){
                System.out.println(voo.getNumeroVoo());
                System.out.println(voo.getOrigem());
                System.out.println(voo.getDestino());
                System.out.println(voo.getDataPartida());
                System.out.println("===========================");
            } else {
                System.out.println("Voo não encontrado");
            }
        }
    }

}
