public class Bijuteria extends Loja
{   
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
    Endereco endereco, Data fundacao, double metaDVendas, int maxProd)
    {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao, maxProd);
        this.metaVendas = metaDVendas;
    }
    
    //Getters & Setter
    public double getMetaVendas()
    {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas)
    {
        this.metaVendas = metaVendas;
    }

    //Método toString() junta todas as informações em uma string.
    public String toString()
    {
        return String.format("Loja %s: Número de funcionários = %d, Salário base = %,2f, Endereço %s, Data de fundação: %s, Estoque Máximo: %x, Meta de Vendas: %b",
        this.nome, this.quantidadeFuncionarios, this.salarioBaseFuncionario, this.endereco, this.dataFundacao, this.estoqueProdutos.length, this.metaVendas);
    }
}
