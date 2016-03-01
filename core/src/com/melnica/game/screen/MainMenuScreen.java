package com.melnica.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
//import coutils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.melnica.game.MyGame;

import java.awt.event.InputEvent;

import com.badlogic.gdx.scenes.scene2d.InputListener;


public class MainMenuScreen implements Screen {
    final MyGame game;
    private Stage stage;
    private TextButton play, exit;
    private Table table;
    private Label.LabelStyle labelStyle;

    public MainMenuScreen(final MyGame gam) {
        game = gam;
        stage = new Stage(new ScreenViewport());

        Skin skin = new Skin();

        TextureAtlas buttonAtlas = new TextureAtlas(Gdx.files.internal("images/images.pack"));
        skin.addRegions(buttonAtlas);

        TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();
        textButtonStyle.font = game.font;
        textButtonStyle.up = skin.getDrawable("button-up");
        textButtonStyle.down = skin.getDrawable("button-down");
        textButtonStyle.checked = skin.getDrawable("button-up");

        textButtonStyle.font = game.font;

        labelStyle = new Label.LabelStyle();
        labelStyle.font = game.font;

        table = new Table();
        table.setFillParent(true);




        play = new TextButton("Играть", textButtonStyle);

        System.out.print(play);

        play.addListener(new ClickListener(){

            public void clicked(InputEvent event, float x, float y) {
                System.out.print("ssssssssss");
            };
//            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
////                Gdx.input.vibrate(20);
//                System.out.print("ssssssssss");
//                return true;
//            };
//
//
//            public void touchUp(InputEvent event, float x, float y, int pointer, int button){
//                System.out.print("ssssssssss");
////                game.setScreen(new PlayScreen(game));
//                dispose();
//            };



        });
//        play.setWidth(1000);
//        play.setHeight(1000);
//        play.setBounds(0, 0, play.getWidth(), play.getHeight());

//        play.setColor(0,1,0,1);

        play.setSize(1000,1000);
        play.setPosition(100, 100);
//        play.setTouchable(Touchable.enabled);


        table.setColor(0, 0, 0, 1);
        table.add(play);
        stage.addActor(table);
        Gdx.input.setInputProcessor(stage);  // Устанавливаем нашу сцену основным процессором для ввода (нажатия, касания, клавиатура etc.)
        Gdx.input.setCatchBackKey(true); // Это нужно для того, чтобы пользователь возвращался назад, в случае нажатия на кнопку Назад на своем устройстве



    }


    @Override
    public void render(float delta) {
        // Очищаем экран и устанавливаем цвет фона черным
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Рисуем сцену
        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {}

    @Override
    public void show() {}

    @Override
    public void hide() {}

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void dispose() {
        // Уничтожаем сцену и объект game.
        stage.dispose();
        game.dispose();
    }



}
