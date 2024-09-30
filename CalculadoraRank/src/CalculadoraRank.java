import java.util.Scanner;

public class CalculadoraRank {
    public static void main(String[] args) {

        Scanner imputTela = new Scanner(System.in);

        System.out.println("Calculadora de Rank Hero!!\n");

        System.out.println("Digite o Nome do Heroi: ");
        String nomeHero = imputTela.next();

        System.out.println("Digite a quantidade de Vitoria: ");
        int quantidadeDeVitoria = imputTela.nextInt();

        System.out.println("Digite a quantidade de Derrota: ");
        int quantidadeDeDerrota = imputTela.nextInt();

        int saldo = quantidadeDeVitoria - quantidadeDeDerrota;

        if(saldo <=10){
            System.out.println("O heroi "+ nomeHero + "tem o saldo de " + saldo +"está no rank Ferro");

        }else if(saldo >= 11 && saldo <=20 ){
            System.out.println("O heroi "+ nomeHero + " tem o saldo de " + saldo +" está no rank Bronze");
        } else if (saldo >=21 && saldo <= 50) {
            System.out.println("O heroi "+ nomeHero + " tem o saldo de " + saldo +" está no rank Prata");
        } else if (saldo >=51 && saldo <=80) {
            System.out.println("O heroi "+ nomeHero + " tem o saldo de " + saldo +" está no rank Ouro");
        } else if (saldo >=81 && saldo <= 90) {
            System.out.println("O heroi "+ nomeHero + " tem o saldo de " + saldo +" está no rank Diamante");
        } else if (saldo >=91 && saldo <=100) {
            System.out.println("O heroi "+ nomeHero + " tem o saldo de " + saldo +" está no rank lendario");
        } else{
            System.out.println("O heroi "+ nomeHero + " tem o saldo de " + saldo +" está no rank Imortal");
        }
    }
}

/*
* Se vitórias for menor do que 10 = Ferro
Se vitórias for entre 11 e 20 = Bronze
Se vitórias for entre 21 e 50 = Prata
Se vitórias for entre 51 e 80 = Ouro
Se vitórias for entre 81 e 90 = Diamante
Se vitórias for entre 91 e 100= Lendário
Se vitórias for maior ou igual a 101 = Imortal

## Saída

Ao final deve se exibir uma mensagem:
"O Herói tem de saldo de **{saldoVitorias}** está no nível de **{nivel}***/