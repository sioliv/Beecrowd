package Projeto;

public class FormulaMatematicaUtil {

    static double pi = 3.14;

   static double calcularAreaQuadrado(final double lado){
       double areaQuadrado  = lado * lado;
       return areaQuadrado;
    }

   static double calcularAreaCirculo(double raio){

       double areaCirculo = (raio * raio) * FormulaMatematicaUtil.pi;

       return areaCirculo;

   }

}
