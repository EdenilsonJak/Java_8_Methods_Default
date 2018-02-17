package impl;

import java.util.function.Consumer;

import model.Pessoa;

public class Mostrapessoa implements Consumer<Pessoa> {

	@Override
	public void accept(Pessoa t) {
		// TODO Auto-generated method stub
		System.out.println(t.getNome());
		System.out.println(t.getEmail());
		
		
	}

}
