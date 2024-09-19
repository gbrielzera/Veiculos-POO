package veiculos;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo (String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void Acelerar() {
        System.out.println("Acelarando!");
    }

    public void exibirInfos() {
        System.out.println("Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAno: " + this.ano);
    }
}
