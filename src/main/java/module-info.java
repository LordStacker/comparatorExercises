module com.example.moviesortingproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.moviesortingproject to javafx.fxml;
    exports com.example.moviesortingproject;
}