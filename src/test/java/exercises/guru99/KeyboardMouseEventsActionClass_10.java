package exercises.guru99;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseEventsActionClass_10 {
    @Test
    public void example() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 1000));
        driver.get("http://demo.guru99.com/test/newtours/");

        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver.findElement(By.xpath("//html/body/div"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr"));

        Actions builder = new Actions(driver);
        Action mouseOverHome = builder.moveToElement(link_Home).build();

        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);

        mouseOverHome.perform();

        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);

        // In the following example, we shall use the moveToElement() method to mouse-over on one Mercury Tours' table rows.
        // The cell shown above is a portion of a <TR> element. If not hovered, its color is #FFC455 (orange).
        // After hovering, the cell's color becomes transparent. It becomes the same color as the blue background of the whole orange table.

        // In this case, we are going to use the moveToElement() method because we are simply going to
        // mouse-over the "Home" link.
        // The build() method is always the final method used so that all the listed actions will be compiled into a single step.


        driver.get("http://www.facebook.com/");
        WebElement txtUsername = driver.findElement(By.id("email"));

        Actions builder2 = new Actions(driver);
        Action seriesOfActions = builder2
                .moveToElement(txtUsername)
                .click()
                .keyDown(txtUsername, Keys.SHIFT)
                .sendKeys(txtUsername, "hello")
                .keyUp(txtUsername, Keys.SHIFT)
                .doubleClick(txtUsername)
                .contextClick()
                .build();

        seriesOfActions.perform() ;
        // You can build a series of actions using the Action and Actions classes. Just remember to close the series with the build() method.


        // The following are the most commonly used keyboard and mouse events provided by the Actions class.

        // clickAndHold() 	Clicks (without releasing) at the current mouse location.

        // contextClick() 	Performs a context-click at the current mouse location. (Right Click Mouse Action)

        // doubleClick() 	Performs a double-click at the current mouse location.

        // dragAndDrop(source, target) 	Performs click-and-hold at the location of the source element, moves to the location of the target element, then releases the mouse.
        //Parameters:
        //source- element to emulate button down at.
        //target- element to move to and release the mouse at.

        // dragAndDropBy(source, x-offset, y-offset) 	Performs click-and-hold at the location of the source element, moves by a given offset, then releases the mouse.
        //Parameters:
        //source- element to emulate button down at.
        //xOffset- horizontal move offset.
        //yOffset- vertical move offset.

        // keyDown(modifier_key) 	Performs a modifier key press. Does not release the modifier key - subsequent interactions may assume it's kept pressed.
        // Parameters:
        // modifier_key - any of the modifier keys (Keys.ALT, Keys.SHIFT, or Keys.CONTROL)

        // keyUp(modifier _key) 	Performs a key release.
        // Parameters:
        // modifier_key - any of the modifier keys (Keys.ALT, Keys.SHIFT, or Keys.CONTROL)

        // moveByOffset(x-offset, y-offset) 	Moves the mouse from its current position (or 0,0) by the given offset.
        // Parameters:
        // x-offset- horizontal offset. A negative value means moving the mouse left.
        // y-offset- vertical offset. A negative value means moving the mouse down.

        // moveToElement(toElement) 	Moves the mouse to the middle of the element.
        // Parameters:
        // toElement- element to move to.

        // release() 	Releases the depressed left mouse button at the current mouse location

        // sendKeys(onElement, charsequence) 	Sends a series of keystrokes onto the element.
        //Parameters:
        //onElement - element that will receive the keystrokes, usually a text field
        //charsequence - any string value representing the sequence of keystrokes to be sent
    }
}
