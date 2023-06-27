public class Vestuario extends Loja
{
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
    Endereco endereco, Data fundacao, boolean importaProdutos, int maxProd)
    {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao, maxProd);
        this.produtosImportados = importaProdutos;
    }    

    public boolean getProdutosImportados()
    {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados)
    {
        this.produtosImportados = produtosImportados;
    }

    public String toString()
    {
        return String.format("Loja %s: Número de funcionários = %d, Salário base = %.2f, Endereço %s, Data de fundação: %s, Estoque máximo: %x, Importa produtos: %b",
        this.nome, this.quantidadeFuncionarios, this.salarioBaseFuncionario, this.endereco, this.dataFundacao, this.estoqueProdutos.length, this.produtosImportados);
    }

}
