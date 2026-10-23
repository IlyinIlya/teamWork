package ru.starbank.teamwork.dto;

public class RecommendationDto {

    private String name;
    private String id;
    private String text;

    public RecommendationDto(String name, String id, String text) {
        this.name = name;
        this.id = id;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}