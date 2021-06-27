package com.cybertek.tests.day14_pom_synchronization;

import com.cybertek.pages.TeleriKPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionPractices {

    @Test
    public void drag_and_drop_test() {
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        TeleriKPage teleriKPage = new TeleriKPage();
        Actions actions = new Actions(Driver.getDriver());

//Accept cookies by clicking to the button
        BrowserUtils.sleep( 2);
        teleriKPage.acceptCookiesButton.click();


        //2. Drag and drop the small circle to bigger circle.
        actions.dragAndDrop(teleriKPage.smallCircle,teleriKPage.bigCircle).perform();


        //2. Drag and drop the small circle to bigger circle. 2nd way of doing
        //actions.moveToElement(teleriKPage.smallCircle).clickAndHold(teleriKPage.smallCircle)
                //.moveToElement(teleriKPage.bigCircle).release().perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great!”
    String expected ="you did great";
    String actual =teleriKPage.bigCircle.getText();

        Assert.assertEquals(actual, expected);

    }


}

