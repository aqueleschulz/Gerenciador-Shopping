public class Data
{
    public int dia;
    public int mes;
    public int ano;

    //Construtor incializa a data e certificando que ela é válida.
    public Data(int dia, int mes, int ano)
    {
        switch (mes)
        {
            case 2:
                if (dia > 28 || (dia == 29 && !verificaAnoBissexto()))
                {
                    System.out.println("Data inválida.");
                    dia = 1;
                    mes = 1;
                    ano = 2000;
                }
                break;
    
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia > 30)
                {
                    System.out.println("Data inválida.");
                    dia = 1;
                    mes = 1;
                    ano = 2000;
                }
                break;
    
            default:
                if (dia > 31)
                {
                    System.out.println("Data inválida.");
                    dia = 1;
                    mes = 1;
                    ano = 2000;
                }
                break;
        }
    
        if(mes > 12 || mes < 1 || ano < 1)
        {
            System.out.println("Data inválida.");
            dia = 1;
            mes = 1;
            ano = 2000;
        }
    
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    //Getters & Setters.
    public int getDia()
    {
        return dia;
    }

    public void setDia(int dia)
    {
        this.dia = dia;
    }

    public int getMes()
    {
        return mes;
    }

    public void setMes(int mes)
    {
        this.mes = mes;
    }

    public int getAno()
    {
        return ano;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    //Método transforma atributos em String.
    public String toString()
    {
        return String.format("Data:" + this.dia + "/" + this.mes + "/" + this.ano);
    }

    //Método verifica se o ano atual é bissexto.
    public boolean verificaAnoBissexto()
    {
        if((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
