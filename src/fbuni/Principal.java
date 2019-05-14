package fbuni;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

//ESTA CLASSE DEVE SE OBRIGATORIAMENTE MANTIDA NO PROJETO. QUALQUER ALTERA��O REALIZADA DEVE OBEDECER A HIERARQUIA
public class Principal extends JFrame implements KeyListener {

	private Desenho cenario;
	private Nave bober;
	private Asteroide inimigo;
	private static final long serialVersionUID = 1L;

	public Principal() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Desenhando a tela e seus elementos
		cenario = new Desenho(0,0,"cenario.jpg");
		bober = new Nave(460,480,"bober.png");
		inimigo = new Asteroide(60,30,"inimigo.png");
		//Adicionando o evento de teclado
		this.addKeyListener(this);
	}
	
	//EVITAR ALTERAR ESSE M�TODO
	public static void main(String[] args) {
		//Criando uma inst�ncia da classe principal
		Principal t = new Principal();
		t.setSize(1000, 700);
		t.createBufferStrategy(1);		
		t.setVisible(true);
		t.createBufferStrategy(2);
	}

	//EVITAR ALTERAR ESSE M�TODO
	public void renderizarGraphics() {
		if (!getBufferStrategy().contentsLost()) getBufferStrategy().show();
	    Graphics g = getBufferStrategy().getDrawGraphics();
	     
	    //Criando um contexto gr�fico
	    Graphics g2 = g.create();
	    //Limpando a tela
	    g2.setColor(Color.WHITE);        
	    g2.fillRect(0, 0, getWidth(), getHeight());

	    renderizarImagens(g2);
	     
	    //Liberando os contextos criados.
	    g.dispose(); 
	    g2.dispose();
	}
	
	//ESSE � O M�TODO QUE DEVE SER ADAPTADO AO PROJETO
	public void renderizarImagens(Graphics g2) {
		//Desenhando as imagens
		cenario.desenhar(g2);
		bober.desenhar(g2);
		inimigo.desenhar(g2);
	}
	
	//EVITAR ALTERAR ESSE M�TODO
	public void paint(Graphics g) {
		this.renderizarGraphics();
		repaint();
	}

	public void keyPressed(KeyEvent evt) {
		//Especificando o comportamento das teclas
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT){
        	bober.moverDireita();
        	repaint();
        }
        else
        if (evt.getKeyCode() == KeyEvent.VK_LEFT){
        	bober.moverEsquerda();
        	repaint();
        }
     }

	public void keyReleased(KeyEvent arg0) {}
	public void keyTyped(KeyEvent arg0) {}
}
