package Principal;

import java.util.Arrays;

public class TesteCalculadoraVetores {
    public static void main(String[] args) {

        double [] vetor1 = {1.0, 2.0, 3.0, 4.0};
        double [] vetor2 = {5.0, 6.0, 7.0, 8.0};

        System.out.println();
        System.out.println("Vetor 1: " + Arrays.toString(vetor1));
        System.out.println("Vetor 2: " + Arrays.toString(vetor2));
        System.out.println();

        //Soma

        double [] soma = VetorUtils.soma(vetor1, vetor2);
        System.out.println("Soma dos vetores: " + Arrays.toString(soma));
        System.out.println();

        //Subtração

        double [] sub = VetorUtils.subtracao(vetor1, vetor2);
        System.out.println("Subtração dos vetores" + Arrays.toString(sub));
        System.out.println();

        //Produtos escalar

        double prodEscalar = VetorUtils.produtoEscalar(vetor1, vetor2);
        System.out.println("Produto escalar: " + prodEscalar);
        System.out.println();

        // Testando exceção com array de tamanho diferente

        double [] vetor3 = {1.0};
        System.out.println("Testando exceção com vetores de tamanhos diferentes...");
        System.out.println();

        try{
            VetorUtils.soma(vetor1, vetor3);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro so somar vetores: " + e.getMessage());
        }
    }
}
