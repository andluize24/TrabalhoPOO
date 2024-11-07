import Produtos.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      String opcao, nome;
      double preco, precoTotal; int quantidade , codigoDoProduto;
      ArrayList<Produto> produtos = new ArrayList<>();
      System.out.println("Sistema de utilidades\n1 - Cadastrar Produto\n2 - Vender Produto");

        precoTotal = 0;
        Scanner sc = new Scanner(System.in);
        opcao = sc.nextLine();

        if (opcao.equals("1")) {
            System.out.println("Informe o nome do produto: ");
            sc = new Scanner(System.in);
            nome = sc.nextLine();

            System.out.println(("Informe o preço do Produto: "));
            sc = new Scanner(System.in);
            preco = Double.parseDouble(sc.nextLine());

            System.out.println("Informa a quantidade deste Produto: ");
            sc = new Scanner(System.in);
            quantidade = Integer.parseInt(sc.nextLine());

            Produto produto = new Produto(nome, preco, quantidade);
            produtos.add(produto);
        }
        else if (opcao =="2") {
            for (int i=0; i<produtos.size(); i++) {
                Produto p = produtos.get(i);
                System.out.println(i + ": " + p.apresentar());
            }
                System.out.println("Informe o código do Produto: ");
                sc = new Scanner(System.in);
                codigoDoProduto = Integer.parseInt(sc.nextLine());
                Produto produtoVendido = produtos.get(codigoDoProduto);
                int quantidadeVendida = Integer.parseInt(sc.nextLine());

            System.out.println("Informe a quantidade deste produto: ");
            sc = new Scanner(System.in);

            precoTotal += (produtoVendido.getPreco() * quantidadeVendida);
            produtoVendido.remover(quantidadeVendida);

        }
        else
            // TERMINEI O VIDEO EM 27:33'
    }

}
