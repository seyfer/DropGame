package seed.seyfer.drop.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

import seed.seyfer.drop.Drop;
import seed.seyfer.drop.DropGame;

/**
 * in terminal type to run
 * ./gradlew html:superDev
 */
public class HtmlLauncher extends GwtApplication {

    @Override
    public GwtApplicationConfiguration getConfig() {
        return new GwtApplicationConfiguration(800, 480);
    }

    @Override
    public ApplicationListener getApplicationListener() {
        return new DropGame();
    }
}