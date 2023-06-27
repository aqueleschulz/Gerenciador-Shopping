public class Produto
{
    private String nome;
    private double preco;
    private Data dataValidade;

    //Construtor inicializa seus atributos.
    public Produto(String nome, double preco, Data validade)
    {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = validade;
    }

    //Getters & Setters.
    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getPreco()
    {
        return this.preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    public Data getDataValidade()
    {
        return dataValidade;
    }

    public void setDataValidade(Data validade)
    {
        this.dataValidade = validade;
    }

    //Método transforma atributos em String.
    public String toString()
    {
        return String.format("Produto %s: Preço = %,2f, Data de validade: %s", this.nome, this.preco, this.dataValidade);
    }

    public boolean estaVencido(Data diaDeHoje)
    {
        if (diaDeHoje.getAno() < dataValidade.getAno())
        {
            System.out.println("PRODUTO NÃO VENCIDO");
            return false;
        }

        else if (diaDeHoje.getAno() == dataValidade.getAno())
        {
            if(diaDeHoje.getMes() < dataValidade.getMes())
            {
                System.out.println("PRODUTO NÃO VENCIDO");
                return false;
            }

            else if(diaDeHoje.getMes() == dataValidade.getMes())
            {
                if(diaDeHoje.getDia() <= dataValidade.getDia())
                {
                    System.out.println("PRODUTO NÃO VENCIDO");
                    return false;
                }
            }
        }
    
        System.out.println("PRODUTO VENCIDO");
        return true;
    }
}
