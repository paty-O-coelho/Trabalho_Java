package fbuni;

//ESTA CLASSE DEVE SE OBRIGATORIAMENTE MANTIDA NO PROJETO. QUALQUER ALTERA��O REALIZADA DEVE OBEDECER A HIERARQUIA
//ELA DEVE SER UTILIZADA NA HERAN�A DE DESENHOS QUE POSSAM SER MOVIMENTADOS PELO USU�RIO 
public class DesenhoMovel extends Desenho {
	
	public DesenhoMovel() {}
	
	public DesenhoMovel(int x, int y, String path) {
		super(x, y, path);
	}
	
	public void moverDireita() {
		this.setX(this.getX() + 2);
	}
	
	public void moverEsquerda() {
		this.setX(this.getX() - 2);
	}
}
