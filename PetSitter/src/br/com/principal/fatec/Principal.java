package br.com.principal.fatec;

import java.io.File;

import br.com.controlador.fatec.Controlador;
import br.com.controlador.fatec.Menu;
import br.com.controlador.fatec.Opcoes;

public class Principal {

	public static void main(String[] args) throws Exception {
		Menu menu = new Menu();
		Opcoes optionControl = new Opcoes();
		int op = 10;
	
		File file = new File(System.getProperty("user.dir")+"\\dados.ser");
		//Verificar existencia do arquivo
		if(file.exists()) {
			optionControl.leitura();
		}

		do{
			menu.ShowMenu();
			Controlador controle = new Controlador();
			op = controle.opcao();
			
			switch (op) {
			
			case 1:
				optionControl.createProfissional();
				break;
			case 2:
				optionControl.createCliente();
				break;
			case 3:
				optionControl.createAtendimento();
				break;
			case 4:
				optionControl.historicoAtendimento();
				break;
			case 5:
				optionControl.ranckingRaca();
				break;
			case 6:
				optionControl.generoPreferido();
				break;
			case 7:
				optionControl.salvar();
				break;
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				menu.ShowMenu();
			}
		 }while(op != 0);

	}

}
