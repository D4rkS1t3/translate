package com.desire.translateText.controller;


import com.desire.translateText.TranslationForm;
import net.suuft.libretranslate.Language;
import net.suuft.libretranslate.Translator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import net.suuft.libretranslate.Language;
import net.suuft.libretranslate.Translator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.util.MultiValueMap;

@Controller
public class TranslationController {

    @GetMapping("/translate")
    public String showTranslationForm(Model model) {
        model.addAttribute("translationForm", new TranslationForm());
        return "index";
    }

    @PostMapping("/translate")
    @ResponseBody
    public TranslatedText translateText(@ModelAttribute TranslationForm translationForm) {
        String textToTranslate = translationForm.getTextToTranslate();
        String sourceLanguage = translationForm.getSourceLanguage();
        String targetLanguage = translationForm.getTargetLanguage();

        String translatedText = Translator.translate(Language.valueOf(sourceLanguage), Language.valueOf(targetLanguage), textToTranslate);

        return new TranslatedText(translatedText);
    }

    // Wewnętrzna klasa reprezentująca przetłumaczony tekst
    private static class TranslatedText {
        private String translatedText;

        public TranslatedText(String translatedText) {
            this.translatedText = translatedText;
        }

        public String getTranslatedText() {
            return translatedText;
        }
    }
}