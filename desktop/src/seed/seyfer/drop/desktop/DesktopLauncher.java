package seed.seyfer.drop.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import seed.seyfer.drop.Drop;
import seed.seyfer.drop.DropGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        config.title = "Drop";
        config.width = 800;
        config.height = 480;

        //original without game and screen
        new LwjglApplication(new Drop(), config);
    }
}
