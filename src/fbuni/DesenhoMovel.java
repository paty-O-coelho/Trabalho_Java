package fbuni;

//ESTA CLASSE DEVE SE OBRIGATORIAMENTE MANTIDA NO PROJETO. QUALQUER ALTERAÇÃO REALIZADA DEVE OBEDECER A HIERARQUIA
//ELA DEVE SER UTILIZADA NA HERANÇA DE DESENHOS QUE POSSAM SER MOVIMENTADOS PELO USUÁRIO 
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
