package com.final_project.EmpwrMe.components;


import com.final_project.EmpwrMe.models.Affirmation;
import com.final_project.EmpwrMe.models.Category;
import com.final_project.EmpwrMe.models.Diary;
import com.final_project.EmpwrMe.repositories.AffirmationRepository;
import com.final_project.EmpwrMe.repositories.CategoryRepository;
import com.final_project.EmpwrMe.repositories.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    AffirmationRepository affirmationRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    DiaryRepository diaryRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {


//        Categories

        Category category1 = new Category("Your Journey");
        categoryRepository.save(category1);

        Category category2 = new Category("Social Situations");
        categoryRepository.save(category2);

        Category category3 = new Category("The Gym");
        categoryRepository.save(category3);

        Category category4 = new Category("Overthinking");
        categoryRepository.save(category4);

        Category category5 = new Category("Personal Development");
        categoryRepository.save(category5);

        Category category6 = new Category("New Habits");
        categoryRepository.save(category6);

        Category category7 = new Category("Fear Of Missing Out");
        categoryRepository.save(category7);

        Category category8 = new Category("Grief");
        categoryRepository.save(category8);

        Category category9 = new Category("Appreciation");
        categoryRepository.save(category9);




//        Affirmations


        Affirmation affirmation1 = new Affirmation("BE HOPEFUL", category1);
        affirmationRepository.save(affirmation1);

        Affirmation affirmation2 = new Affirmation("STOP COMPARING YOURSELF TO OTHERS", category1);
        affirmationRepository.save(affirmation2);

        Affirmation affirmation3 = new Affirmation("HOLISTIC APPROACH", category1);
        affirmationRepository.save(affirmation3);

        Affirmation affirmation4 = new Affirmation("PASS THE PLOT TWIST TEST", category1);
        affirmationRepository.save(affirmation4);

        Affirmation affirmation5 = new Affirmation("THE FEELING OF QUITTING IS WORSE A HUNDRED TIMES WORSE", category1);
        affirmationRepository.save(affirmation5);

        Affirmation affirmation6 = new Affirmation("TED LASSO’S ADVICE", category1);
        affirmationRepository.save(affirmation6);

        Affirmation affirmation7 = new Affirmation("KEEP YOUR CARDS CLOSE TO YOUR CHEST", category1);
        affirmationRepository.save(affirmation7);

        Affirmation affirmation8 = new Affirmation("BEWARE OF YOUR AMBITIOUS EGO", category1);
        affirmationRepository.save(affirmation8);

        Affirmation affirmation9 = new Affirmation("ENJOY THE JOURNEY ", category1);
        affirmationRepository.save(affirmation9);

        Affirmation affirmation10 = new Affirmation("SUCCESS TAKES TIME. IF IT WAS EASY EVERYONE WOULD DO IT", category1);
        affirmationRepository.save(affirmation10);

        Affirmation affirmation11 = new Affirmation("FAKE IT UNTIL YOU MAKE IT", category2);
        affirmationRepository.save(affirmation11);

        Affirmation affirmation12 = new Affirmation("ANIMATIC LISTENING ", category2);
        affirmationRepository.save(affirmation12);

        Affirmation affirmation13 = new Affirmation("C.S. LEWIS ADVICE ", category2);
        affirmationRepository.save(affirmation13);

        Affirmation affirmation14 = new Affirmation("BE A FUN ENERGY", category2);
        affirmationRepository.save(affirmation14);

        Affirmation affirmation15 = new Affirmation("SAY PEOPLES NAMES", category2);
        affirmationRepository.save(affirmation15);

        Affirmation affirmation16 = new Affirmation("DON’T MOAN OR WHINE", category2);
        affirmationRepository.save(affirmation16);

        Affirmation affirmation17 = new Affirmation("CONCENTRATE ON YOUR SPEECH", category2);
        affirmationRepository.save(affirmation17);

        Affirmation affirmation18 = new Affirmation("EVERYONES FAVOURITE TOPIC IS THEMSELVES ", category2);
        affirmationRepository.save(affirmation18);

        Affirmation affirmation19 = new Affirmation("ENOUGH OF THE MISREPRESENTED “FACTS” OR HALF-BAKED STORIES", category2);
        affirmationRepository.save(affirmation19);

        Affirmation affirmation20 = new Affirmation("TEASERS ALL THE WAY", category2);
        affirmationRepository.save(affirmation20);

        Affirmation affirmation21 = new Affirmation("IT’S TOTALLY FINE TO NOT BE PERFECT", category2);
        affirmationRepository.save(affirmation21);

        Affirmation affirmation22 = new Affirmation("BEING HONEST IS THE BEST POLICY ", category2);
        affirmationRepository.save(affirmation22);

        Affirmation affirmation23 = new Affirmation("LOOK FOR FAMILIARITY", category2);
        affirmationRepository.save(affirmation23);

        Affirmation affirmation24 = new Affirmation("BE HUMBLE", category3);
        affirmationRepository.save(affirmation24);

        Affirmation affirmation25 = new Affirmation("DON’T INJURE YOURSELF TO FIT IN", category3);
        affirmationRepository.save(affirmation25);

        Affirmation affirmation26 = new Affirmation("YOU’RE NOT THE MAIN CHARACTER IN ANYONES MOVIE", category4);
        affirmationRepository.save(affirmation26);

        Affirmation affirmation27 = new Affirmation("EMPOWER ME WORKS", category4);
        affirmationRepository.save(affirmation27);

        Affirmation affirmation28 = new Affirmation("THE QUICKER YOU’RE OVER IT THE BETTER, BRUSH IT OFF", category4);
        affirmationRepository.save(affirmation28);

        Affirmation affirmation29 = new Affirmation("THE CHINESE FARMER", category4);
        affirmationRepository.save(affirmation29);

        Affirmation affirmation30 = new Affirmation("EVERYTHING WILL BE OKAY", category4);
        affirmationRepository.save(affirmation30);

        Affirmation affirmation31= new Affirmation("RASHOMON EFFECT", category4);
        affirmationRepository.save(affirmation31);

        Affirmation affirmation32 = new Affirmation("SPEAKING TO YOUR CLOSE ONES HOW YOU FEEL IS GOOD BUT CAN'T MAKE THEM INTO YOUR PSYCHIATRISTS", category4);
        affirmationRepository.save(affirmation32);

        Affirmation affirmation33 = new Affirmation("RECOGNISE YOUR EMOTIONS", category4);
        affirmationRepository.save(affirmation33);

        Affirmation affirmation34 = new Affirmation("JOJO RABBIT ADVICE", category4);
        affirmationRepository.save(affirmation34);

        Affirmation affirmation35 = new Affirmation("WORK WITH WHAT YOU’VE GOT", category4);
        affirmationRepository.save(affirmation35);

        Affirmation affirmation36 = new Affirmation("BEWARE OF VOLDERMORT (THE VOICE IN YOUR HEAD)", category4);
        affirmationRepository.save(affirmation36);

        Affirmation affirmation37 = new Affirmation("GETTING OUT OF BED IS YOUR FIRST HUGE VICTORY OF THE DAY", category4);
        affirmationRepository.save(affirmation37);

        Affirmation affirmation38 = new Affirmation("HOW MANY TIMES HAVE YOU WORRIED ABOUT SOMETHING THAT’S CAME TRUE? OR YOU WERE THANKFUL FOR WORRYING ABOUT IT? THE FUTURE IS IMPOSSIBLE TO PREDICT", category4);
        affirmationRepository.save(affirmation38);

        Affirmation affirmation39 = new Affirmation("MEDIATE WITH YOURSELF", category4);
        affirmationRepository.save(affirmation39);

        Affirmation affirmation40 = new Affirmation("IT’S OKAY TO BE TIRED", category4);
        affirmationRepository.save(affirmation40);

        Affirmation affirmation41 = new Affirmation("ART OF NOT GIVING A F***", category4);
        affirmationRepository.save(affirmation41);

        Affirmation affirmation42 = new Affirmation("IT MIGHT BE EXCITEMENT", category4);
        affirmationRepository.save(affirmation42);

        Affirmation affirmation43 = new Affirmation("BEWARE OF THE VAMPIRES",category4);
        affirmationRepository.save(affirmation43);

        Affirmation affirmation44 = new Affirmation("POWER OF NOW", category4);
        affirmationRepository.save(affirmation44);

        Affirmation affirmation45 = new Affirmation("IF THERE’S A DIY OR A COOKING SITUATION THAT YOU COULD PARTICIPATE IN, JOIN!", category4);
        affirmationRepository.save(affirmation45);

        Affirmation affirmation46 = new Affirmation("BE DECISIVE AS MUCH AS POSSIBLE", category5);
        affirmationRepository.save(affirmation46);

        Affirmation affirmation47 = new Affirmation("MAKE USE OF YOUR TODO-LIST", category5);
        affirmationRepository.save(affirmation47);

        Affirmation affirmation48 = new Affirmation("LESS TIME ON YOUR PHONE", category5);
        affirmationRepository.save(affirmation48);

        Affirmation affirmation49 = new Affirmation("INHALE TWICE", category5);
        affirmationRepository.save(affirmation49);

        Affirmation affirmation50 = new Affirmation("DELETE APPS ON YOUR PHONE. CHECK THEM BRIEFLY AT NIGHT", category5);
        affirmationRepository.save(affirmation50);

        Affirmation affirmation51 = new Affirmation("YOU’RE NOT MISSING OUT", category6);
        affirmationRepository.save(affirmation51);

        Affirmation affirmation52 = new Affirmation("EMBRACE SADNESS", category7);
        affirmationRepository.save(affirmation52);

        Affirmation affirmation53 = new Affirmation("HOLISTIC APPROACH AGAIN", category7);
        affirmationRepository.save(affirmation53);

        Affirmation affirmation54 = new Affirmation("VALUE WHAT YOU HAVE", category7);
        affirmationRepository.save(affirmation54);


//             Diaries


        Diary diary1 = new Diary("Doesn’t matter how painful or how well you’re doing be hopeful for everything. Hopefulness is your magical shield. Remember in The Sandman when he goes toe to toe with the Devil. She throws at him the apocalypse and end of life, but he prevails with his hopefulness. You can be hopeful for everything and it’s a powerful spell!");
        diaryRepository.save(diary1);

        Diary diary2 = new Diary("The grass is always greener in their garden. Compare yourself only to your yesterday self. Be proud of your own little bubble!");
        diaryRepository.save(diary2);

        Diary diary3 = new Diary("Are you doubting yourself? Well, think of the holistic approach. Contemplate the worst possible outcome then to the mediocre then be super descriptive about the best! This should only be brief. It’s not a sob story!");
        diaryRepository.save(diary3);

        Diary diary4 = new Diary("In life, you’re going to be capsized with plot twists so best to remain calm and keep afloat.  This will be when you’re tested. Pass the test.");
        diaryRepository.save(diary4);

        Diary diary5 = new Diary("Think of the money and life you could achieve if you persevere! I know you think you’re in hell. But why stop? Keep going and get a reward for it! ");
        diaryRepository.save(diary5);

        Diary diary6 = new Diary("it may not work out how you think it will or how you think I will or how you hope it does, but believe me, it will all work out. Exactly as it’s supposed to!");
        diaryRepository.save(diary6);

//        Adding!

        affirmation1.addDiary(diary1);
        affirmationRepository.save(affirmation1);

        diary2.addAffirmation(affirmation2);
        diaryRepository.save(diary2);

        affirmation3.addDiary(diary3);
        affirmationRepository.save(affirmation3);

        diary4.addAffirmation(affirmation4);
        diaryRepository.save(diary4);

        affirmation5.addDiary(diary5);
        affirmationRepository.save(affirmation5);

        diary6.addAffirmation(affirmation6);
        diaryRepository.save(diary6);
    }
}
