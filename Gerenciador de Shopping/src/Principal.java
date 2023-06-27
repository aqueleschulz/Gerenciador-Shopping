public class Principal
{
    Endereco endereco;
    Data data;
    

    public static void main(String[] args) throws Exception
    {
        int valorMenu = 0;

        while(true)
        {
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");

            valorMenu = Teclado.leInt("Escolha uma opção:");
            
            switch(valorMenu)
                {
                case 1:
                    String nomeDaLoja = Teclado.leString("Digite o nome da sua loja:");
                    int quantidadeFuncionarios = Teclado.leInt("Quantos funcionários há na sua loja?");
                    double gastosComSalario = Teclado.leDouble("Quanto você gasta com o salário de seus funcionários?");
                    int maxProd = Teclado.leInt("Digite o qual o número máximo de produtos no estoque:");
                    
                    String nomeDaRua = Teclado.leString("Nome da rua:");
                    String cidade = Teclado.leString("Nome da cidade:");
                    String estado = Teclado.leString("Nome do estado:");
                    String pais = Teclado.leString("Nome do país:");
                    String cep = Teclado.leString("Número do CEP:");
                    String numero = Teclado.leString("Número da loja:");
                    String complemento = Teclado.leString("Complemento:");

                    int diaDeFundacao = Teclado.leInt("Digite o dia de fundação da loja:");
                    int mesDeFundacao = Teclado.leInt("Digite o mês de fundação da loja:");
                    int anoDeFundacao = Teclado.leInt("Digite o ano de fundação de loja:");
                    

                    Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
                    Data fundacao = new Data(diaDeFundacao, mesDeFundacao, anoDeFundacao);

                    Loja l = new Loja(nomeDaLoja, quantidadeFuncionarios, gastosComSalario, endereco, fundacao, maxProd);

                    System.out.println("Loja criada com sucesso.");
                    System.out.println("Loja: " + nomeDaLoja);
                    System.out.println("Número de funcionários: " + quantidadeFuncionarios);
                    System.out.println("Loja gasta " + gastosComSalario + " com seus funcionários");
                    System.out.println(nomeDaRua + ", " + cidade + ", " + estado + ", " + pais + ", " +
                    cep + ", " + numero + ", " + complemento);
                    System.out.println("Fundada na " + fundacao);
                    break;
                case 2:
                    String nomeDoProduto = Teclado.leString("Digite o nome do produto:");
                    double preco = Teclado.leDouble("Digite o preço do produto:");

                    int dia = Teclado.leInt("Digite o dia de expiração de validade:");
                    int mes = Teclado.leInt("Digite o mes de expiração de validade:");
                    int ano = Teclado.leInt("Digite o ano de expiração de validade:");

                    Data validade = new Data(dia, mes, ano);

                    Produto p1 = new Produto(nomeDoProduto, preco, validade);
                    
                    System.out.println("Produto registrado.");
                    p1.estaVencido(new Data(23, 10, 2023));
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
