package com.desire.translateText;

import net.suuft.libretranslate.Language;
import net.suuft.libretranslate.Translator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TranslateTextApplication {

	public static void main(String[] args) {
		SpringApplication.run(TranslateTextApplication.class, args);


//		String orginalText,translatedText;
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Witaj w tlumaczu angielsko polskim prosze wprowadz tekst do przetlumaczenia.");
//
//		while (true) {
//			System.out.print("Orginalny tekst:");
//			orginalText=scanner.nextLine();
//			System.out.print("Przetlumaczony tekst:");
//			translatedText= Translator.translate(Language., Language.POLISH, orginalText);
//			System.out.println(translatedText);
//			scanner.nextLine();
//		}

	}

}
