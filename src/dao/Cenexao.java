/**
 * @author Neirivon Elias Cardoso
 */

package dao;

public interface Cenexao {

	public void fecharConexao();
	public void iniciarTransacao();
	public void commit();
	public void rollback();
	public boolean transacaoAtiva();
	
}