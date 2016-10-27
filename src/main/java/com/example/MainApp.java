package com.example;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.utils.Renderer;


public class MainApp {

	public static final Path DEFAULT_SPRING_PATH = Paths.get(System.getProperty("user.dir"), "conf","application.properties");
	public static void main(String[] args) {
		System.out.println(DEFAULT_SPRING_PATH);
		setDefaultSpringPropertySource();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Renderer render = context.getBean(Renderer.class);
		List<String> evalList = new ArrayList<String>();
		evalList.add("Hey 360");
		evalList.add("Another 360");
		
		render.printOutEval360(evalList);
	}
	private static void setDefaultSpringPropertySource() {
		String propertySources = System.getProperty("spring.config.name");
		if (propertySources == null) {
			System.setProperty("spring.config.name", "file:" + DEFAULT_SPRING_PATH.toString());
		}
	}

}
