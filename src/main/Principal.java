package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import impl.Mostrapessoa;
import model.Pessoa;

public class Principal {

	public static void main(String[]args){
		
		Pessoa p1 = new Pessoa("Edenilson", "edenilson@edenilson.com", "123");
		Pessoa p2 = new Pessoa("Joao", "joao@joao.com", "1245");
		
		/*
		 * método autentica implementa pessoa com a Interface Autentica
		 * ou seja na versão java 8 foi implementado as interfaces funcionais
		 */
		p1.autentica(p1.getSenha());
		
		
		List<Pessoa> pessoas = Arrays.asList(p1, p2);
		
		/*
		aqui usamos a classe Mostrapessoa que implementa a inferface Consumer do java 8 e seu método abstrato accept
		*/
		Mostrapessoa mp = new Mostrapessoa();
		//pessoas.forEach(mp);
		
		/*
		Usando classe anomina com lambdas
		
		
		Consumer<Pessoa> consumidor = new Consumer<Pessoa>() {
			
			@Override
			public void accept(Pessoa t) {
				// TODO Auto-generated method stub
				System.out.println(t.getNome());
				
			}
		};
		
		pessoas.forEach(consumidor);
		*/
		
		/*
		* Usando expressões lambdas

		Consumer<Pessoa> consumidor = (Pessoa c) -> {System.out.println(c.getNome());};
		pessoas.forEach(consumidor);
		
		 */

		/*
		 * Simplificando expressões lambdas
		*/
		
		pessoas.forEach((Pessoa c) -> {System.out.println(c.getNome());});
		
		Runnable r = () -> System.out.println("Olá Mundo");
		new Thread(r).start();
		
		/*
		 * for tradicional
		 * 
		 * for (Pessoa p: pessoas) {
			System.out.println(p.getNome());
			System.out.println(p.getEmail());
			
		}*/
		
	}
	
}
