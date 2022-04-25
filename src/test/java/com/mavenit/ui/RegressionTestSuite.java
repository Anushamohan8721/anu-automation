
/*
package com.mavenit.ui;
import com.mavenit.ui.page_objects.DescriptionPage;
import com.mavenit.ui.page_objects.HeaderPage;
import com.mavenit.ui.page_objects.SearchResultPage;
import com.mavenit.ui.page_objects.TrolleyPage;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Every.everyItem;

public class RegressionTestSuite extends Hooks {
    private HeaderPage headerPage = new HeaderPage();
    private SearchResultPage searchPage = new SearchResultPage();
    private DescriptionPage descriptionPage = new DescriptionPage();
    private TrolleyPage trolleyPage = new TrolleyPage();

    @Test
    public void searchTest() {
        headerPage.search("nike");
        String actual = searchPage.getProductTitle();
        assertThat("nike", is(equalTo(actual)));
        String actualurl = searchPage.getCurrentUrl();
        assertThat(actualurl, endsWith("nike"));
    }

    @Test
    public void basketTest() {
        headerPage.search("nike");
        searchPage.selectAproduct();
        descriptionPage.addToTrolley();
        descriptionPage.goToTrolley();
        List<String> actualList = trolleyPage.getProductsInTrolley();
        assertThat(actualList, hasItem("nike"));
    }

    @Test
    public void quantityTest() {

        headerPage.search("nike");
        searchPage.selectAproduct();
        descriptionPage.addToTrolley();
        descriptionPage.goToTrolley();
        double priceForProduct = trolleyPage.getPriceForProduct();
        int quantityChange = 3;
        double expected = priceForProduct * quantityChange;
        //change quantity from ui
        trolleyPage.selectQuantity(quantityChange);
        //get price
        double actual = trolleyPage.getPriceForProduct();
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void reviewTest() {
        headerPage.search("nike");
        //select rating of ur choice
        searchPage.selectRating("1");
        List<Double> actual = searchPage.getAllProductsRatings();
        System.out.println(actual.toString());
        assertThat(actual, everyItem(greaterThanOrEqualTo(1.0)));
    }

    @Test
    public void shopByTest() {
        headerPage.hoverToNavItem("Shop");
        headerPage.hoverToLeftPanelItem("Technology");
        headerPage.hoverToProductItem("Televisions");
    }
    @Test
    public void shopByTestApp() {
        headerPage.hOverNavIt("Shopping");
        headerPage.hOverNavIt("Technology");
        headerPage.hoverToNavItem("Built In Ovens");
    }
}
*/