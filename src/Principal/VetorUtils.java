package Principal;

public class VetorUtils {
    private VetorUtils() {}


    //SOMA
    public static double[] soma(double[] vetorA, double[] vetorB){
        if (vetorA.length != vetorB.length){
            throw new IllegalArgumentException ("Os vetores devem ter o mesmo tamanho");
        }

        double [] resultadoSoma = new double[vetorA.length];
        for (int i =0; i< vetorA.length; i++){
        resultadoSoma[i] = vetorA[i] + vetorB[i];
    }
    return resultadoSoma;
    }


    //SUBTRAÇÃO
    public static double[] subtracao(double [] vetorA, double [] vetorB){
        if (vetorA.length != vetorB.length){
            throw new IllegalArgumentException("OS vetores são de tamanhos diferentes!");
        }

        double [] resultadoSub = new double[vetorA.length];

        for (int i =0; i< vetorA.length; i++){
            resultadoSub[i] = vetorA[i] - vetorB[i];
        }
        return resultadoSub;
    }

    //PRODUTO ESCALAR

    public static double produtoEscalar(double[] vetorA, double[] vetorB){
        if (vetorA.length != vetorB.length){
            throw new IllegalArgumentException("Os vetores possuem tamanhos distintos.");
        }

        double resultadoProduto = 0;
        for (int i = 0; i< vetorA.length; i++){
            resultadoProduto += (vetorA[i] * vetorB[i]);
        }
        return resultadoProduto;
    }


}
