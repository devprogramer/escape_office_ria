package com.melnica.game.object;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by victor on 24.01.15.
 */
public class BackgroundActor{
    private Texture backgroundTexture;
    private Sprite backgroundSprite;

    private  Image image;
    public BackgroundActor() {
        backgroundTexture = new Texture("images/wall.png");
        backgroundSprite = new Sprite(backgroundTexture);
        backgroundSprite.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        image = new Image(backgroundSprite);
    }

    public Image actor(){
        return image;
    }

}
