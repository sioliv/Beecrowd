package companiaAerea;

public class Principal {

    public static void main(String[] args) {
        Aeronave aviaogol = new Aeronave();
        aviaogol.totalAssentos = 100;

        //aviaogol.ativo = false;
        //aviaogol.desativar();
        aviaogol.ativar();

        aviaogol.reservarAssentos(10);

        System.out.printf("GOL (%s): %d assentos disponiveis  %n",
                aviaogol.ativo ? "Ativo" : "Inativo",
                aviaogol.calcularAssentosDisponiveis());


        Aeronave aviaoLatam = new Aeronave();
        aviaoLatam.totalAssentos = 120;

        aviaoLatam.reservarAssentos(5);

        System.out.printf("LATAM (%s): %d assentos disponiveis  %n",
                aviaoLatam.ativo ? "Ativo" : "Inativo",
                aviaoLatam.calcularAssentosDisponiveis());
    }
}
