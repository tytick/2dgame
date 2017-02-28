package gui;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;


public class Menu implements GameState {

	@Override
	public void mouseClicked(int a, int b, int c, int d) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void mouseDragged(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mousePressed(int one, int two, int three) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseWheelMoved(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputEnded() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputStarted() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isAcceptingInput() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setInput(Input arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(int a, char b) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void keyReleased(int arg0, char arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerButtonPressed(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerButtonReleased(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerDownPressed(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerDownReleased(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerLeftPressed(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerLeftReleased(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerRightPressed(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerRightReleased(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerUpPressed(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void controllerUpReleased(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enter(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		// TODO Auto-generated method stub
	
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leave(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		// TODO Auto-generated method stub

	}

	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		// TODO Auto-generated method stub		
		
		// Background
		Image bg = new Image("/rec/bg.png");
		g.drawImage(bg, 0, 0);
		
		//ChangeLog Box
		Image changeLog = new Image("/rec/changelog.png");
		
		//Logo
		int x = (Application.WIDTH / 6);
		int y = (Application.HEIGHT / 8);
		Image logo = new Image("/rec/logo.png");
		g.drawImage(logo, x, y);
		
		//Buttons
		Image playButton = new Image("/rec/playButton.png");
		Image exitButton = new Image("/rec/exitButton.png");
		Image optionButton = new Image("/rec/optionsButton.png");
		playButton.draw(x, Application.HEIGHT/2, x+112, Application.HEIGHT/2/4);
		optionButton.draw(x, Application.HEIGHT/2+112, x+112, Application.HEIGHT/2/4);
		exitButton.draw(x, Application.HEIGHT/2+224, x+112, Application.HEIGHT/2/4);
		
		/*
		//Reference Lines
		g.drawLine(Application.WIDTH/2, 0, Application.WIDTH/2, Application.HEIGHT); // Down the middle
		g.drawLine(Application.WIDTH/3, 0, Application.WIDTH/3, Application.HEIGHT); // 3rd of screen - left
		g.drawLine(Application.WIDTH/4, 0, Application.WIDTH/4, Application.HEIGHT); // 4th of screen - left
		g.drawLine(Application.WIDTH/5, 0, Application.WIDTH/5, Application.HEIGHT); // 5th of screen - left
		g.drawLine(Application.WIDTH/6, 0, Application.WIDTH/6, Application.HEIGHT); // 6th of screen - left
		g.drawLine(0, Application.HEIGHT/2, Application.WIDTH, Application.HEIGHT/2); //Half of vertial screen
		*/
	}

	@Override
	public void update(GameContainer gb, StateBasedGame sbg, int charlie) throws SlickException {
		// TODO Auto-generated method stub
	}

}
