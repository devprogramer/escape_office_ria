package com.melnica.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.melnica.game.MyGame;
import com.melnica.game.object.BackgroundActor;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by victor on 24.01.15.
 */
public class PlayScreen  implements Screen{
    final MyGame game;
    BackgroundActor background;
    Batch batch;
    private Stage stage;

    public PlayScreen(final MyGame gam){
        game = gam;
        batch = new SpriteBatch();
        stage = new Stage(new ScreenViewport(),batch);

        Gdx.input.setInputProcessor(stage);
        Gdx.input.setCatchBackKey(true);


        background = new BackgroundActor();
        background.actor().setPosition(0, 0);


        stage.addActor(background.actor());
    }

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
