import java.util.Scanner;

public class calculadoratest{
    public static void main(String[] args) {

          System.out.println("Calculadora do Davi");     // título da calculadora
        Scanner numero = new Scanner(System.in);  // scanner para ler a entrada do usuário
        while (true) {                                              // loop para permitir múltiplas operações
            System.out.println("digite 'vaca' para sair");   // instrução para sair

            System.out.print("digite sua conta:");
            String conta = numero.nextLine();        // coleta oq o usuario digitou
            if (conta.equals("vaca")) {         // condição de saída
                System.out.println("Saindo da calculadora.");     // mensagem de saída
                break;
            }
            String[] partes = conta.split(" ");      // divide a string em partes (formata)
            double numero1 = Double.parseDouble(partes[0]);    // converte a primeira parte para double
            String operador = partes[1];    // operador é a segunda parte
            double numero2 = Double.parseDouble(partes[2]);    // converte a terceira parte para double
            double resultado = 0;   // variável para armazenar o resultado


             // estrutura switch para determinar a operação

        switch (operador) {
            case "+":                           // adição
                resultado = numero1 + numero2;
                break;
            case "-":                    // subtração
                resultado = numero1 - numero2;
                break;
            case "*":                   // multiplicação
                resultado = numero1 * numero2;
                break;
            case "/":                       // divisão
                if (numero2 != 0) {             // verifica se o divisor não é zero 
                    resultado = numero1 / numero2;
                } else {                              // caso seja divisão por zero
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    numero.close();
                    return;
                }
                break;
            default:      // um digito diferentes dos operadores padrão 
                System.out.println("Operador inválido. Use +, -, * ou /.");     // caso o operador seja inválido
                System.out.println("Dicas: multiplicação é '*', divisão é '/'");  // dicas para o usuário
                numero.close();
                return;
        }
        System.out.println("Resultado: " + resultado);  // formatação do resultado ao usuario 
        }
        numero.close();   // fecha o scanner(aba do usuario enviar caracteres)

    }
}



        /*

DICAS DE OPERADORES AOS DEV INICIANTES  

         * == operador de igual
         * < operador de menor 
         * > operador maior 
         * <= operador menor igual
         * >= operador maior igual
         * != operador diferente
         * && operador e
         * || operador ou
         * ! operador de negação
         * % operador de resto da divisão
         * ++ operador de incremento (ADICIONA 1)
         */