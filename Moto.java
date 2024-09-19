package veiculos;

class Moto extends Veiculo {
    private boolean temCarenagem;

    public Moto(String marca, String modelo, int ano, boolean temCarenagem) {
        super(marca, modelo, ano);
        this.temCarenagem = temCarenagem;
    }

    public void empinar() {
        System.out.println("Empinando!");
    }

    @Override
    public void exibirInfos() {
        super.exibirInfos();
        System.out.println("Tem carenagem: " + this.temCarenagem);
    }
}
