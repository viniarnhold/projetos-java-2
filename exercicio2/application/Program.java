package exercicio2.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio2.domain.Contribuintes;
import exercicio2.domain.PessoaFisica;
import exercicio2.domain.PessoaJuridica;

public class Program {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuintes> list = new ArrayList<>();

        System.out.print("Enter the number of tax players: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextInt();
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Anual income: ");
            Double rendaAnual = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                Double gastoscsaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, rendaAnual, gastoscsaude));
            }
            else {
                System.out.print("Number of employees: ");
                int numeroDeFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
            }
            
        }

        sc.close();
    }
    
}
