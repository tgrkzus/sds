package com.sds;

import com.badlogic.gdx.backends.lwjgl.*;

public class Launcher {
    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        new LwjglApplication(new Sds(), config);
    }
}
