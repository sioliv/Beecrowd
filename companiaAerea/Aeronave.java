package companiaAerea;

public class Aeronave {

    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis(){
        int assentosDisponiveis = totalAssentos - assentosReservados;
        return assentosDisponiveis;
    }

    void reservarAssentos(int numeroAssentos) {
        if (ativo) {
            assentosReservados += numeroAssentos;
        } else {
            //Existe uma forma de fazer isso (exceções)
            //ainda não estudamos sobre isso
            System.out.println("Aeronave desativada. Assentos nao reservados");
        }
    }

    void desativar(){
         ativo = false;
    }

    void ativar(){
        ativo = true;
    }

}
