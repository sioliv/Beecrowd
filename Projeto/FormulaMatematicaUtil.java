package Projeto;

public class FormulaMatematicaUtil {

    static double pi = 3.14;

   static double calcularAreaQuadrado(final double lado){
       var areaQuadrado  = lado * lado;
       return areaQuadrado;
    }

   static double calcularAreaCirculo(double raio){

      var areaCirculo = (raio * raio) * FormulaMatematicaUtil.pi;

       return areaCirculo;

   }

}
