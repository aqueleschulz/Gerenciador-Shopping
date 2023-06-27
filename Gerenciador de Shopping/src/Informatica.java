public class Informatica extends Loja
{
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
    Endereco endereco, Data fundacao, double seguroDEletronicos, int maxProd)
    {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao, maxProd);
        this.seguroEletronicos = seguroDEletronicos;
    }
    
    //Getters & Setters
    public double getSeguroEletronicos()
    {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos)
    {
        this.seguroEletronicos = seguroEletronicos;
    }

    //Método toString() junta todas as informações em uma string.
    public String toString()
    {
        return String.format("Loja %s: Número de funcionários = %d, Salário base = %,2f, Endereço %s, Data de fundação: %s, Estoque Máximo: %x Seguro de Eletrônicos: %b",
        this.nome, this.quantidadeFuncionarios, this.salarioBaseFuncionario, this.endereco, this.dataFundacao, this.estoqueProdutos.length, this.seguroEletronicos);
    }

}
