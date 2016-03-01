package com.melnica.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.melnica.game.object.BackgroundActor;
import com.melnica.game.screen.PlayScreen;
import com.melnica.game.screen.MainMenuScreen;

import java.awt.event.InputEvent;

public class MyGame extends Game {
	SpriteBatch batch;


    private Stage stage;
    private StretchViewport viewport;
    public BackgroundActor background;
    public BitmapFont font;
    private static final String FONT_CHARACTERS = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789][_!$%#@|\\/?-+=()*&.;,{}\"´`'<>";


//    class MouseActorListener extends InputListener{
//
//        public boolean touchDown(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int pointer, int button){
//            event.getListenerActor().setSize(200, 100);
//            System.out.print("ssssssssss");
//            return true;
//        };
//
//        public void touchUp(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int pointer, int button ){
//            event.getListenerActor().setSize(100, 50);
//            System.out.print("ssssssssss");
//        }
//    }


//    private Texture backgroundTexture;
//    private Sprite backgroundSprite;


    @Override
	public void create () {





        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/russoone.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter param = new FreeTypeFontGenerator.FreeTypeFontParameter();
        param.size = Gdx.graphics.getHeight() / 18;
        param.characters = FONT_CHARACTERS;
        font = generator.generateFont(param);
//        param.size = Gdx.graphics.getHeight() / 20;
        font.setColor(Color.WHITE);
        generator.dispose();



//        batch = new SpriteBatch();
//        viewport = new StretchViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        stage = new Stage(viewport, batch);
//        Gdx.input.setInputProcessor(stage);
//
//
//        backgroundTexture = new Texture("images/wall.png");
//        backgroundSprite = new Sprite(backgroundTexture);
//        backgroundSprite.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//
//        Image backgr = new Image(backgroundSprite);
//        backgr.addListener(new MouseActorListener());
//        stage.addActor(backgr);
//        background = new BackgroundActor();
//
//
//        background.actor().setPosition(0, 0);
//
//
//
//
//        background.actor().addListener(new MouseActorListener());
//
//        stage.addActor(background.actor());
        this.setScreen(new MainMenuScreen(this));
//        this.setScreen(new PlayScreen(this));
//




	}

	@Override
	public void render () {
        super.render();
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); //очистка экрана
////
//        stage.draw();
//        stage.act(Gdx.graphics.getDeltaTime());

	}
}
