package application;

import entities.AparelhoIphone;
import entities.IE;
import entities.IPOD;
import entities.NavegadorInternet;
import entities.ReprodutorMusical;
import entities.Telefone;

public class Iphone {

	
	public static void main(String[] args) {
		
		
		AparelhoIphone tf = new Telefone();
			
			tf.ligar();
			tf.atender();
			tf.correioDeVoz();
			
		NavegadorInternet ie = new IE();
			
			ie.adicionarAba();
			ie.atualizaPagina();
			ie.exibirPagina();

		ReprodutorMusical rm = new IPOD();
		
			rm.tocar();
			rm.pausar();
			rm.selecionarMusica();
			
	}

}
