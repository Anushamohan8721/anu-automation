package com.mavenit.ui.page_objects;

import com.mavenit.ui.driver.DriverManager;
import org.openqa.selenium.By;

public class DescriptionPage extends DriverManager {
    public void addToTrolley(){
        //add to trolley
        driver.findElement(By.cssSelector("button[data-test='add-to-trolley-button-button']")).click();
        sleep(4000);
    }

    public void goToTrolley(){
        driver.findElement(By.cssSelector("a[data-test='component-att-button-basket']")).click();
        sleep(5000);
    }
    public void selectQuantity(){

    }
}
