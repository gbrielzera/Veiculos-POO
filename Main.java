package veiculos;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Marca A", "Modelo A", 2018, 4);
        c1.abrirPortaMalas();
        c1.exibirInfos();
        System.out.println();
        Moto m1 = new Moto("Marca B", "Modelo B", 2020, true);
        m1.empinar();
        m1.exibirInfos();
    }
}
