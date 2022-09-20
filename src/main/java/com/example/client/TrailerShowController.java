package com.example.client;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import my_util.Movie;

public class TrailerShowController {
    public Label headerTitle;
    public WebView webView;
    private Movie movie;

    @FXML
    void initialize(){
        //headerTitle.setText(movie.getTitle());
       // WebEngine engine = webView.getEngine();
        //engine.load("https://www.youtube.com/embed/XgPJe73mOv0");

    }

    public void setData(Movie movie) {
        this.movie = movie;
        headerTitle.setText(movie.getTitle() + " Trailer");
        String trailerLink = ReadThread.movieTrailerLinkMap.get(movie.getTitle());
        //System.out.println("Checking TrailerShow Controller 1......"+trailerLink);
        WebEngine engine = webView.getEngine();
        engine.load(trailerLink);
    }
}
