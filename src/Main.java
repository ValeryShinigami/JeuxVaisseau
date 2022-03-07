import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Main extends BasicGame{

	/*game images
	on déclare les images*/
	Image back;
	Image robo;
	//déclare x et y
	float x = 200.0f;//f = float format
	float y = 300.0f;
	float speed = 0.2f;

	public Main(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) throws SlickException {

		//zone du jeu
		AppGameContainer app = new AppGameContainer(new Main("Vaisseau Area"));
		//taille de la zone
		app.setDisplayMode(800, 532, false);//800 pixels large, 600 pixels hauteur false car non full screen
		//on lance le jeu
		app.start();

	}

	@Override
	//gc et g le nom en parametre ca remplace les arg
	public void render(GameContainer gc, Graphics g) throws SlickException {
		// dessiner les graphiques
		g.drawImage(back, 0, 0);
		g.drawImage(robo, x, y);



	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// chargé la police, sound graphique, les images etc
		back = new Image("espace.jpg");
		robo = new Image("robo.png");
	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		// logique du jeu (AI , input, user)
		Input input = gc.getInput();//On demande a slick2D quelle clé à été pressé

		//condition pour savoir ce qui se passe lorsque l'on presse à droite
		if (input.isKeyDown(Input.KEY_RIGHT)) {

			x += speed * delta;

		}
		//condition pour savoir ce qui se passe lorsque l'on presse à gauche
		if (input.isKeyDown(Input.KEY_LEFT)) {

			x -= speed * delta;

		}
		//condition pour savoir ce qui se passe lorsque l'on presse en haut
		if (input.isKeyDown(Input.KEY_UP)) {

			y -= speed * delta;

		}
		//condition pour savoir ce qui se passe lorsque l'on presse en bas
		if (input.isKeyDown(Input.KEY_DOWN)) {

			y += speed * delta;

		}

	}
	
}
