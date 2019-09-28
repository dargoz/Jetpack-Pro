package com.dargoz.jetpack.data;

public class MovieEntity {
    private String title;
    private String description;
    private String genre;
    private String duration;
    private double score;
    private int image;

    public MovieEntity(String title, String description, String genre,
                       String duration, double score, int image) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.duration = duration;
        this.score = score;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getGenre() {
        return genre;
    }

    public String getDuration() {
        return duration;
    }

    public double getScore() {
        return score;
    }

    public int getImage() {
        return image;
    }
}
