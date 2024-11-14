package com.devsuperior.dslist.entities;

public class Game {
    
    private Long id;
    private String tilte;
    private Integer year;
    private String genre;
    private String plataform;
    private double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Game(){

    }

    public Game(Long id, String tilte, Integer year, String genre, String plataform, double score, String imgUrl,
            String shortDescription, String longDescription) {
        this.id = id;
        this.tilte = tilte;
        this.year = year;
        this.genre = genre;
        this.plataform = plataform;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }
    
}
