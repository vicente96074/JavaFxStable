package com.softquark;

import com.softquark.views.Login;
import javafx.stage.Stage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Augusto Vicente
 */
@Configuration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class App extends javafx.application.Application {

    @Override
    public void init() throws Exception {
        this.applicationContext = SpringApplication.run(App.class);
    }

    @Override
    public void stop() throws Exception {
        applicationContext.close();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Login.loadView(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }

    private ConfigurableApplicationContext applicationContext;
}
