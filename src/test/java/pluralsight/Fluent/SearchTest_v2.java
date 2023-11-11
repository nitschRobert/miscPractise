package pluralsight.Fluent;

import org.testng.annotations.Test;
import pluralsight.Fluent.pages.CoursePage;
import pluralsight.Fluent.pages.HomePage;
import pluralsight.Fluent.pages.SearchPage;

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
