package com.final_project.EmpwrMe;

import com.final_project.EmpwrMe.models.Affirmation;
import com.final_project.EmpwrMe.models.Category;
import com.final_project.EmpwrMe.models.Diary;
import com.final_project.EmpwrMe.repositories.AffirmationRepository;
import com.final_project.EmpwrMe.repositories.CategoryRepository;
import com.final_project.EmpwrMe.repositories.DiaryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ActiveProfiles("test")
@SpringBootTest
class EmpwrMeApplicationTests {

	@Autowired
	AffirmationRepository affirmationRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	DiaryRepository diaryRepository;

	@Test
	void contextLoads() {
	}


	@Test
	public void canCreateCategory(){
		Category category = new Category("Your Journey!");
		assertEquals("Self-Improvement", category.getTitle());
	}

	@Test
	public void canCreateAffirmation(){
		Category category = new Category("Your Journey!");
		Affirmation affirmation = new Affirmation("BE HOPEFUL", category);
		assertEquals("BE HOPEFUL", affirmation.getSentence());
	}


	@Test
	public void canCreateDiary(){
		Category category = new Category("Your Journey!");
		Affirmation affirmation = new Affirmation("BE HOPEFUL", category);
		Diary diary = new Diary("I need to remember this...");
		assertEquals("I need to remember this...", diary.getPost());
	}

	@Test
	public void canAddAffirmationToCategory(){
		Category category = new Category("Your Journey!");
		Affirmation affirmation = new Affirmation("BE HOPEFUL", category);
		category.addAffirmation(affirmation);
		assertEquals(1, category.getAffirmations().size());
		assertTrue(category.getAffirmations().contains(affirmation));
	}



}
