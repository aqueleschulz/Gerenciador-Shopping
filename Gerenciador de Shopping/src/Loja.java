public class Loja
{
    protected String nome;
    protected int quantidadeFuncionarios;
    protected double salarioBaseFuncionario;
    protected Endereco endereco;
    protected Data dataFundacao;
    protected Produto[] estoqueProdutos;

    //Construtor inicializa todos atributos.
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data fundacao, int maxProd)
    {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = fundacao;
        this.estoqueProdutos = new Produto[maxProd];
    }

    //Construtor inicializa nome, quantidade e fixando salário como -1.
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data fundacao, int maxProd)
    {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = fundacao;
        this.estoqueProdutos = new Produto[maxProd];
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

    public int getQuantidadeFuncionarios()
    {
        return this.quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidade)
    {
        this.quantidadeFuncionarios = quantidade;
    }

    public double getSalarioBaseFuncionario()
    {
        return this.salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBase)
    {
        this.salarioBaseFuncionario = salarioBase;
    }

    public Endereco getEndereco()
    {
        return endereco;
    }

    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }

    public Data getDataFundacao()
    {
        return dataFundacao;
    }

    public void setDataFundacao(Data fundacao)
    {
        this.dataFundacao = fundacao;
    }
    
    public Produto[] getEstoqueProdutos()
    {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProduto)
    {
        this.estoqueProdutos = estoqueProdutos;
    }

    //Método trasnforma atributos em String.
    public String toString()
    {
        return String.format("Loja %s: Número de funcionários = %d, Salário base = %.2f, Endereço %s, Data de fundação: %s, Estoque máximo: %x",
        this.nome, this.quantidadeFuncionarios, this.salarioBaseFuncionario, this.endereco, this.dataFundacao, this.estoqueProdutos.length);
    }

    //Define quanto a loja gasta assalariando seus funcionários.
    public double gastosComSalario()
    {
        if(salarioBaseFuncionario <= -1)
        {
            return -1;
        }
        else
        {
            return (this.salarioBaseFuncionario * this.quantidadeFuncionarios);
        }
    }

    //Define tamanho da loja baseado na quantidade de funcionários.
    public char tamanhoDaLoja()
    {
        if(this.quantidadeFuncionarios < 10)
        {
            return 'P';
        }
        else if(this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30)
        {
            return 'M';
        }
        else if(this.quantidadeFuncionarios >= 31)
        {
            return 'G';
        }
        else
        {
            System.out.println("Quantidade de funcionários inválida.");
            return '/';
        }
    }

    //Imprime o estoque de produtos no console.
    public void imprimeProdutos()
    {
        for(int i = 0; i < estoqueProdutos.length; i++)
        {
            System.out.println(i);
        }
    }

    //Insere produtos no estoque.
    public boolean insereProduto(Produto desejado)
    {
        for(int i = 0; i < estoqueProdutos.length; i++)
        {
            if(estoqueProdutos[i] == null)
            {
                estoqueProdutos[i] = desejado;
                return true;
            }
        }
        return false;
    }

    //Remove produtos do estoque.
    public boolean removeProduto(String nomeProd)
    {
        for(int i = 0; i < estoqueProdutos.length; i++)
        {
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProd))
            {
                estoqueProdutos[i] = null;
                    return true;
            }
        }
            return false;
    }
}
