public class Alimentacao extends Loja
{   
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
    Endereco endereco, Data fundacao, Data dataDAlvara, int maxProd)
    {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDAlvara, maxProd);
        this.dataAlvara = dataDAlvara;
    }
    
    //Getters & Setters
    public Data getDataAlvara()
    {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara)
    {
        this.dataAlvara = dataAlvara;
    }

    //Método toString() junta todas as informações em uma string.
    public String toString()
    {
        return String.format("Loja %s: Número de funcionários = %d, Salário base = %.2f, Endereço %s, Data de fundação: %s, Estoque máximo: %x, Data de Alvará: %s",
        this.nome, this.quantidadeFuncionarios, this.salarioBaseFuncionario, this.endereco, this.dataFundacao, this.estoqueProdutos.length, this.dataAlvara);
    }
}
