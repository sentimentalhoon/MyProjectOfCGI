package JavaMiniProject.ConsoleManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BoardApplication extends Application {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/board_db";
    private static final String DB_USERNAME = "your_username";
    private static final String DB_PASSWORD = "your_password";

    @Override
    public void start(Stage primaryStage) {
        // 게시판 UI를 위한 컨트롤 생성
        Label titleLabel = new Label("게시판");
        TextField titleField = new TextField();
        Label contentLabel = new Label("내용");
        TextArea contentArea = new TextArea();
        Button postButton = new Button("글 작성");

        // VBox를 사용하여 컨트롤을 수직으로 배치
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(titleLabel, titleField, contentLabel, contentArea, postButton);

        // 글 작성 버튼 클릭 이벤트 처리
        postButton.setOnAction(e -> {
            String title = titleField.getText();
            String content = contentArea.getText();
            savePost(title, content);
            clearFields(titleField, contentArea);
            System.out.println("글이 작성되었습니다.");
        });

        // 게시판 UI를 포함한 Scene 생성
        Scene scene = new Scene(vbox, 400, 300);

        // Stage 설정
        primaryStage.setTitle("게시판");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // 게시글 저장 메서드
    private void savePost(String title, String content) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement("INSERT INTO posts (title, content) VALUES (?, ?)")) {
            statement.setString(1, title);
            statement.setString(2, content);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 입력 필드 초기화 메서드
    private void clearFields(TextField titleField, TextArea contentArea) {
        titleField.clear();
        contentArea.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
