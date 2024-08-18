package edu.pedro.desafioControleFluxo;


import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Digite o primeiro número:");
        int parametroUm = input.nextInt();

        System.out.println("Digite o segundo número:");
        int parametroDois = input.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }
        catch(ParametroInvalidosException exception){
            exception.printStackTrace();
            System.err.println("O segundo parâmetro " + parametroDois + " deve ser maior do que o primeiro.");

        }
    }

    static void contar(int parametroUm, int parametroDois) throws  ParametroInvalidosException{

        if (parametroUm > parametroDois){
            throw new ParametroInvalidosException();
        }

        int quantidade_de_interacoes;
        quantidade_de_interacoes = parametroDois - parametroUm;

        for (int i = 0; i <= quantidade_de_interacoes; i++){
            System.out.println("Imprimindo o número " + parametroUm++);

        }





    }



}
