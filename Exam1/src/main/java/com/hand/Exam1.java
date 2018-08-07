package com.hand;

import com.hand.api.service.FilmService;
import com.hand.domain.entity.FilmE;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam1 {
	private static ApplicationContext ctx;

	static {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	public static void main(String[] args) {

		FilmService filmService = (FilmService) ctx.getBean("filmServiceImpl");


		try {

			//添加失败的一条
			FilmE filmEf = new FilmE();
			filmEf.setTitle("test ff");
			filmEf.setDescription("Description ff");
			filmService.insert(filmEf);
			filmService.insert(filmEf);

		} catch (Exception e) {
			e.printStackTrace();
		}


		try {


			//添加成功的一条
			FilmE filmEs = new FilmE();
			filmEs.setTitle("test1");
			filmEs.setDescription("Description test1");
			filmEs.setLanguageId(1);
			filmService.insert(filmEs);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}





}

