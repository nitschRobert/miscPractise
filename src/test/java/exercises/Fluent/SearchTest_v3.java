package exercises.Fluent;

import exercises.Fluent.pages.CoursePage;
import exercises.Fluent.pages.HomePage;
import org.testng.annotations.Test;

public class SearchTest_v3 extends BasicTestClass {

    HomePage home = new HomePage();
    CoursePage coursePage = new CoursePage();

    @Test
    public void basicFilter() {
        home.search("Java")
                .filterBySkills(Levels.BEGINNER)
                .filterByRole("Software Development")
                .selectCourseTab()
                .selectCourseName("Java Fundamentals: The Java Language");

         coursePage.verifyIsDisplayed(CoursePage.freeTrial())
                .verifyIsDisplayed(CoursePage.coursePreview());
    }
}
