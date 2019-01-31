package br.com.partnergroup.robo.test.app;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.partnergroup.robo.test.bd.H2Server;

public class App {
	
	
	/*
	 * Objetivo do teste:  obter o html de uma p�gina, manipul�-lo e salv�-lo no banco de dados
	 * 
	 * 1) Obter o Html da p�gina http://www.solhorticenter.com.br/ofertas/' e armazenar em vari�vel
	 * 2) Trabalhar o Html, removendo todas as tags (somente as tags, n�o o texto dentro delas). Usar express�es regulares
	 * 3) Salvar o conte�do do html na tabela tb_html (esta tabela tem 2 colunas: id int auto_increment e html varchar)
	 */
	
	/*
	 * J� esta incluso no c�digo o servidor de banco de dados H2, que � iniciado junto com a aplica��o;
	 * � poss�vel acessar o banco de dados via browser pelo endere�o: http://localhost:9099 (somente enquanto a aplica��o estiver
	 * em execu��o), usando a string de conex�o: jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1
	 * � recomend�vel obter a pagina usando a biblioteca do apache hc: https://hc.apache.org/httpcomponents-client-4.5.x/index.html
	 * Obs.: O banco de dados � em mem�ria. Sempre que a aplica��o terminar, os dados ser�o perdidos. 
	 */
	

	public static void main(String[] args) throws SQLException, Exception {
		try(H2Server server=new H2Server()){
			server.start();
			/*
			 * String de conex�o com o banco de dados: jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1
			 * (Usu�rio 'sa' sem senha 
			 */
			
			/*
			 * 
			 * Implementar a partir daqui!
			 * 
			 */
			
			
			
			
			
			
			
			JOptionPane.showMessageDialog(null, "Clique em ok para finalizar");
		}

	}

}
