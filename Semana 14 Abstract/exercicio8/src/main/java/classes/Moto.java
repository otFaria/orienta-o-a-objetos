package classes;
public class Moto extends Veiculo{

    @Override
    public void entrarEstacionamento() {
        System.out.println("Estou entrando no estacionamento ... Vrumm");
    }

    @Override
    public void sairEstacionamento() {
        System.out.println("Estou saindo do estacionamento ... Vrumm");
    }
}
