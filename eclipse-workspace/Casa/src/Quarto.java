	public class Quarto {	

		private boolean televisao = false;
	
			public void ligaTv(String comodo, boolean liga) {
		
				System.out.println("Voc� quer ligar a televis�o | 'liga' ou 'desliga'");
		
				if (comodo.equals("liga")) {
					System.out.println("A televis�o foi ligada");
					setTelevisao(true);
				}
				if(!comodo.equals("desliga"))
				System.out.println("A televis�o est� desligada");
					setTelevisao(true);
		   }
		
		public boolean isTvLigada() {		
			return televisao;
		}
		
		public void setTelevisao(boolean televisao) {
			this.televisao = televisao;
		}
		
}
