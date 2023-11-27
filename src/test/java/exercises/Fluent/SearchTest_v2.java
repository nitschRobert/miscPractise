package exercises.Fluent;

import exercises.Fluent.pages.CoursePage;
import exercises.Fluent.pages.HomePage;
import exercises.Fluent.pages.SearchPage;
import org.testng.annotations.Test;

public class SearchTest_v2 extends BasicTestClass {

        HomePage home = new HomePage();
        SearchPage search = new SearchPage();
        CoursePage asserts = new CoursePage();

        @Test
        public void basicFilter() throws InterruptedException {

            home.search("Java");

            search.filterBySkills(Levels.BEGINNER);
            search.filterByRole("Software Development");
            search.selectCourseTab();
            search.selectCourseName("Java Fundamentals: The Java Language");

            asserts.verifyFreeTrialIsDisplayed();
            asserts.verifyCoursePreviewIsDisplayed();
        }
}