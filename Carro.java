package veiculos;
class Carro extends Veiculo {
    private int portas;

    public Carro (String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    public void abrirPortaMalas() {
        System.out.println("Porta malas aberto!");
    }
    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println("Portas: " + this.portas);
    }
}
