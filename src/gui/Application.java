/*
 * Credits to Cook/Walls
 */

package gui;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Application extends StateBasedGame {

    // Game state identifiers
	public static final int MENU = 0;
	public static final int OPTIONS = 1;
    public static final int GAME = 2;

    // Application Properties
    public static final int WIDTH   = 1080;
    public static final int HEIGHT  = 720;
    public static final int FPS     = 60;
    public static final String VERSION = " (Alpha 0.1)" ;

    // Class Constructor
    public Application(String appName) {
        super(appName);
    }

    // Initialize your game states (calls init method of each gamestate, and set's the state ID)
    public void initStatesList(GameContainer gc) throws SlickException {
        // The first state added will be the one that is loaded first, when the application is launched
    	this.addState(new Menu());
    	this.addState(new Options());
        this.addState(new Game());
    }

    // Main Method
    public static void main(String[] args) {
        try {
            AppGameContainer app = new AppGameContainer(new Application("Drugs Inc." + VERSION));
            app.setDisplayMode(WIDTH, HEIGHT, false);
            app.setTargetFrameRate(FPS);
            app.setShowFPS(true);
            app.start();          
        } catch(SlickException e) {
            e.printStackTrace();
        }
    }
}