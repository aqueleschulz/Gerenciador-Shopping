import java.util.Scanner;

public class Shopping
{
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    Scanner ler = new Scanner(System.in);

    public Shopping(String nome, Endereco endereco, int maxLojas)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[maxLojas];
    }

    //Getters & Setters
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Endereco getEndereco()
    {
        return endereco;
    }

    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }

    public Scanner getLer()
    {
        return ler;
    }

    public void setLer(Scanner ler)
    {
        this.ler = ler;
    }

    public Loja[] getLojas()
    {
        return lojas;
    }

    public void setLojas(Loja[] lojas)
    {
        this.lojas = lojas;
    }

        //Método toString() junta todas as informações em uma string.
    public String toString()
    {
        return String.format("Shopping %s: Endereço %s, Espaços para Lojas: %x",
        this.nome, this.endereco, this.lojas.length);
    }

    //Método insere lojas dentro do shopping.
    public boolean insereLoja(Loja novaLoja)
    {
        for(int i = 0; i < lojas.length; i++)
        {
            if(lojas[i] == null)
            {
                lojas[i] = novaLoja;
                return true;
            }
        }
        return false;
    }

    //Método remove lojas dentro do shopping.
    public boolean removeLoja(String nomeLoja)
    {
        for(int i = 0; i < lojas.length; i++)
        {
            if(lojas[i] != null && lojas[i].getNome().equals(nomeLoja))
            {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    //Método procura por lojas de acordo com o tipo digitado.
    public int quantidadeLojasPorTipo(String busca)
    {
        int quantidade = 0;

        for(int i = 0; i < lojas.length; i++)
        {
            if(lojas[i].getClass().getSimpleName().equals(busca))
            {
                quantidade++;
            }
        }

        if(quantidade <= 0)
        {
            return -1;
        }

        return quantidade;
    }
    
    //Método descobre qual a loja do tipo Informatica que tem o seguro mais caro.
    public Informatica lojaSeguroMaisCaro()
    {
        Informatica informatica = null;
        for(int i = 0; i < lojas.length; i++)
        {
            if(lojas[i] instanceof Informatica)
            {
                Informatica informaticaAtual = (Informatica) lojas[i];
                if(informatica == null || informaticaAtual.getSeguroEletronicos() > informatica.getSeguroEletronicos())
                {
                    informatica = informaticaAtual;
                    return informatica;
                }
            }
        }
        return null;
    }
}
