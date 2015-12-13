package seed.seyfer.drop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by seyfer on 12/13/15.
 */
public class DropGame extends Game {

    public SpriteBatch batch;
    public BitmapFont  font;

    public void create() {
        batch = new SpriteBatch();

        //Use LibGDX's default Arial font.
        font = new BitmapFont();
        this.setScreen(new MainMenuScreen(this));
    }

    public void render() {
        //important!
        super.render();
    }

    public void dispose() {
        batch.dispose();
        font.dispose();
    }
}
