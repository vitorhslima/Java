package brasil.br.com.bytebank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import brasil.br.com.bytebank.banco.modelo.Cliente;
import brasil.br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Vitor");
		cliente.setProfissao("Desenvolvedor");
		cliente.setCpf("465513198-58");
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente);
		cc.deposita(222.33);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));		
		oos.writeObject(cc);		
		oos.close();
	}

}
