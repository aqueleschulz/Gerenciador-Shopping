public class Cosmetico extends Loja
{
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
    Endereco endereco, Data fundacao, double taxaDComercializacao, int maxProd)
    {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao, maxProd);
        this.taxaComercializacao = taxaDComercializacao;
    }
    
    //Getters & Setters
    public double getTaxaComercializacao()
    {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao)
    {
        this.taxaComercializacao = taxaComercializacao;
    }

    //Método toString() junta todas as informações em uma string.
    public String toString()
    {
        return String.format("Loja %s: Número de funcionários = %d, Salário base = %,2f, Endereço %s, Data de fundação: %s, Estoque máximo: %x, Taxa de Comercialização: %b",
        this.nome, this.quantidadeFuncionarios, this.salarioBaseFuncionario, this.endereco, this.dataFundacao, this.estoqueProdutos.length, this.taxaComercializacao);
    }
    
}
