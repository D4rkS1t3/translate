package com.desire.translateText;

public class TranslationForm {
    private String textToTranslate;
    private String sourceLanguage;
    private String targetLanguage;
    private String translatedText; // Nowe pole

    // Konstruktory
    public TranslationForm() {
    }

    public TranslationForm(String textToTranslate, String sourceLanguage, String targetLanguage) {
        this.textToTranslate = textToTranslate;
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
    }

    // Getters and setters
    public String getTextToTranslate() {
        return textToTranslate;
    }

    public void setTextToTranslate(String textToTranslate) {
        this.textToTranslate = textToTranslate;
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public String getTargetLanguage() {
        return targetLanguage;
    }

    public void setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    // Getter and setter for translatedText
    public String getTranslatedText() {
        return translatedText;
    }

    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }
}
