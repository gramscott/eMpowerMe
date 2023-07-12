package com.capstone.EmpowerMe;

import com.capstone.EmpowerMe.models.Affirmation;
import com.capstone.EmpowerMe.models.Category;
import com.capstone.EmpowerMe.models.Diary;
import com.capstone.EmpowerMe.repositories.AffirmationRepository;
import com.capstone.EmpowerMe.repositories.CategoryRepository;
import com.capstone.EmpowerMe.repositories.DiaryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("test")
@ContextConfiguration
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
		assertEquals("Your Journey!", category.getTitle());
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

	@Test
	public void affirmationCanAddDiary(){
		Affirmation affirmation = new Affirmation();
		Diary diary = new Diary("Testing diary post");

		affirmation.setDiaries(new ArrayList<>());
		affirmation.addDiary(diary);

		List <Diary> expectedDiary = new ArrayList<>();
		expectedDiary.add(diary);

		assertEquals(expectedDiary, affirmation.getDiaries());
	}

	@Test
	public void categoryCanAddAffirmation(){
		Category category = new Category("Your Journey");
		Affirmation affirmation = new Affirmation();

		category.setAffirmations(new ArrayList<>());
		category.addAffirmation(affirmation);

		List <Affirmation> expectedAffirmation = new ArrayList<>();
		expectedAffirmation.add(affirmation);

		assertEquals(expectedAffirmation, category.getAffirmations());

	}

	@Test
	public void diaryCanAddAffirmation(){
		Diary diary = new Diary("Testing Diary can add affirmation");
		Affirmation affirmation = new Affirmation();

		diary.setAffirmations(new ArrayList<>());
		diary.addAffirmation(affirmation);

		List <Affirmation> expectedAffirmation = new ArrayList<>();
		expectedAffirmation.add(affirmation);

		assertEquals(expectedAffirmation, diary.getAffirmations());
	}

	@Test
	public void canGetDiaryId(){
		Long expectedId = 1L;
		Diary diary = new Diary("Testing can get diary Id");
		diary.setId(expectedId);
		Long actualId = diary.getId();

		assertEquals(expectedId, actualId);
	}

	@Test
	public void canGetCategoryTitle(){
		String expectedTitle = "Test Category can get title";
		Category category = new Category(expectedTitle);

		String actualTitle = category.getTitle();

		assertEquals(expectedTitle, actualTitle);

	}

	@Test
	public void canGetCategoryId() {
		Long expectedId = 1L;
		Category category = new Category();
		category.setId(expectedId);

		Long actualId = category.getId();

		assertEquals(expectedId, actualId);
	}

	@Test
	public void canGetAffirmationId(){
		Long expectedId = 1L;
		Affirmation affirmation = new Affirmation();
		affirmation.setId(expectedId);

		Long actualId = affirmation.getId();

		assertEquals(expectedId, actualId);
	}


}






