
//Agoritmo 11
import java.util.Scanner;

public class Atividade01 {
  public static void main(String[] args) throws Exception {
    System.out.println("Aprendendo Algoritmo!!!");

    // Agoritmo 12

    System.out.println("Aprendendo Algoritmo!!!\nCom Anita e Guto");

    // Agoritmo 16

    int x;
    x = 10;
    System.out.println(x);

    // Agoritmo 18

    int x1 = 10;

    System.out.println("Valor de x=" + x1);
    x1++;
    System.out.println(",mas agora é" + x1);

    // Agoritmo 23

    Scanner numeros = new Scanner(System.in);
    int a, decimal;

    System.out.println("\nDigite numero de tres casas: ");
    a = numeros.nextInt();
    decimal = (a % 100) / 10;
    System.out.println("\nalgoritmoda casa dezenas: " + decimal + "\n");

    // Agoritmo 25

    int data, dia, mes, ano;
    System.out.println("\nDigite data no formato DDMMAA: ");
    data = numeros.nextInt();
    dia = data / 10000;
    mes = data % 10000 / 100;
    ano = data % 100;
    System.out.println("Dia: " + dia);
    System.out.println("Mes: " + mes);
    System.out.println("Ano: " + ano);

    // Agoritmo 26

    int zdata, dia1, mes1, ano1, ndata;
    System.out.println("\nDigite data no formato DDMMAA: ");
    zdata = numeros.nextInt();
    dia1 = zdata / 10000;
    mes1 = zdata % 10000 / 100;
    ano1 = zdata % 100;
    ndata = mes1 * 10000 + dia1 * 100 + ano1;
    System.out.println("Dia: " + dia1);
    System.out.println("Mes: " + mes1);
    System.out.println("Ano: " + ano1);
    System.out.println("Data No Formato MMDDAA: " + ndata);

    // Agoritmo 27

    int x2, z1;
    x2 = 2;
    z1 = 5;
    System.out.println("\nx2=" + x2);
    x2++;
    System.out.println("\n z1=" + z1);
    z1--;
    System.out.println("\nnovo valor de x=" + x2);
    System.out.println("\nnovo valor de z=" + z1);

    // Agoritmo 31

    float ma;
    ma = (8 + 9 + 7) / 3;
    System.out.println("media aritmetica e: " + ma);

    // Agoritmo 40

    int quoc, rest, val1, val2;
    System.out.println("\nentre com dividendo: ");
    val1 = numeros.nextInt();
    System.out.println("\nentre com divisor: ");
    val2 = numeros.nextInt();
    quoc = val1 / val2;
    rest = val1 % val2;
    System.out.println("\n\n\n");
    System.out.println("dividendo: " + val1);
    System.out.println("divisor: " + val2);
    System.out.println("quociente: " + quoc);
    System.out.println("resto: " + rest);

    // agoritmo 41

    int mp, az, b, c, d;
    System.out.println("\n entre com 1 numero: ");
    az = numeros.nextInt();
    System.out.println("\n entre com 2 numero: ");
    b = numeros.nextInt();
    System.out.println("\n entre com 3 numero: ");
    c = numeros.nextInt();
    System.out.println("\n entre com 4 numero: ");
    d = numeros.nextInt();
    mp = (az * 1 + b * 2 + c * 3 + d * 4) / 10;
    System.out.println("media ponderada: " + mp);

    // Agoritmo 43

    double num, logaritmo;
    System.out.println("\n entre com o logaritmo:  ");
    num = numeros.nextInt();
    logaritmo = Math.log(num) / Math.log(10);
    System.out.println("O seu logaritmo: " + logaritmo);

    // Agoritmo 44

    double nnum, llogaritmo, base;
    System.out.println("\n entre com o logaritmo: ");
    nnum = numeros.nextInt();
    System.out.println("\n entre com a base : ");
    base = numeros.nextInt();
    llogaritmo = Math.log(nnum) / Math.log(base);

    System.out.println("logaritmo: " + nnum + "Base: " + base + "Resultado: " + llogaritmo);

    // Agoritmo 46

    double saldo, nsaldo;
    System.out.println("\n digite saldo:  ");
    saldo = numeros.nextInt();
    nsaldo = saldo * 1.01;
    System.out.println("\n novo saldo:  " + nsaldo);

    // Alogaritmo 48

    double salarioMinimo, quantidadeKw, precoKw, valorPago, valorComDesconto;

    System.out.print("Entre com o valor do salário mínimo: ");
    salarioMinimo = numeros.nextDouble();

    System.out.print("Entre com a quantidade em quilowatt: ");
    quantidadeKw = numeros.nextDouble();

    precoKw = salarioMinimo / 700.0;
    valorPago = quantidadeKw * precoKw;
    valorComDesconto = valorPago * 0.9;

    System.out.println("Preço do quilowatt: R$ " + precoKw);
    System.out.println("Valor a ser pago: R$ " + valorPago);
    System.out.println("Valor a ser pago com desconto de 10%: R$ " + valorComDesconto);
    numeros.close();
  }

}
