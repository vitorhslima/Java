public class Conecao implements AutoCloseable {

    public Conecao() {
        System.out.println("Abrindo conexao");
       throw new IllegalStateException();
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }
    
	@Override
	public void close() {
		System.out.println("Fechando conexao");
		
	}
}
