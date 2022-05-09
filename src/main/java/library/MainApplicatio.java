package library;

import library.ProgramMenu;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.web.config.SpringDataWebConfiguration;

public class MainApplicatio {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringDataWebConfiguration.class);
        System.out.println("Welcome to library");


        ProgramMenu programMenu = context.getBean(ProgramMenu.class);
        while(true) {
            programMenu.printProgramMenu();
            int menuNumber = programMenu.getUserChoice();
            programMenu.executeSelectedMenuItem(menuNumber);
        }
    }
}
