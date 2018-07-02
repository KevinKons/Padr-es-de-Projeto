package control;

import java.util.Collection;
	
public interface Controle { //Observado

	void addLinha(String texto, String numero, boolean booleano) throws Exception;
        
	int getQtasLinhas();

	Object getValor(int row, int col);

	Collection<?> getItens();

	void carregarLinha(int row);

	int  alterarLinha(String texto, String numero, boolean booleano);
	
	void addObservador(Observador obs);
	
	void removeObservador(Observador obs);

	
}
