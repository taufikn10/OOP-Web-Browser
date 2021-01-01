import javax.swing.*;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;


public class WebBrowserApp extends JFrame implements Runnable{

    private JFXPanel panel;

    public void run(){
        setTitle("OOP Web Browser");
        setBounds(0, 0, 1950, 1050);
        setVisible(true);

        panel = new JFXPanel();
        add(panel);

        Platform.runLater(() ->{
            WebView view = new WebView();
            view.getEngine().load("https://www.google.com/");

            panel.setScene(new Scene(view));
        });

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new WebBrowserApp());

    }

}