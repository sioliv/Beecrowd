package Projeto;

public class Principal {

    public static void main(String[] args) {

        System.out.printf("Area do circulo: %.2f%n",
                FormulaMatematicaUtil.calcularAreaCirculo(10));
        System.out.printf("Area do quadrado: %.2f%n"
                ,FormulaMatematicaUtil.calcularAreaQuadrado(20));

    }
}
