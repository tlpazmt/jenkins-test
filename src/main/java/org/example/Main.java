//package org.example;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        // 1
//        driver.get("https://www.saucedemo.com/");
//        driver.manage().window().maximize();
//        //2
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        //3
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        //4
//        driver.findElement(By.id("login-button")).click();
//        //5
//        String productsPageUrl = "https://www.saucedemo.com/inventory.html";
//        System.out.println("Is products page: " + driver.getCurrentUrl().equals(productsPageUrl));
//        //6
//        List<WebElement> addButtons = driver.findElements(By.className("btn_inventory")).subList(0, 2);
//        List<String> itemNames = new ArrayList<>();
//        for (WebElement btn:
//             addButtons) {
//            String name = btn.getAttribute("data-test")
//                    .replace("add-to-cart-", "")
//                    .replace("-", " ");
//            itemNames.add(name);
//            btn.click();
//        }
//        //7
//        driver.findElement(By.className("shopping_cart_link")).click();
//        //8
//        List<WebElement> itemsInCart = driver.findElements(By.className("inventory_item_name"));
//        boolean check = itemsInCart.size() == 2;
//        if (check) {
//            for (WebElement item :
//                    itemsInCart) {
//                check = itemNames.contains(item.getText().toLowerCase());
//            }
//        }
//        System.out.println("Are items displayed in cart: " + check);
//        //9
//        driver.findElement(By.id("checkout")).click();
//        //10
//        driver.findElement(By.id("first-name")).sendKeys("Azamat");
//        driver.findElement(By.id("last-name")).sendKeys("Talap");
//        driver.findElement(By.id("postal-code")).sendKeys("123123");
//        //11
//        driver.findElement(By.id("continue")).click();
//        //12
//        String summaryPageUrl = "https://www.saucedemo.com/checkout-step-two.html";
//        System.out.println("Is summary page displayed: " + driver.getCurrentUrl().equals(summaryPageUrl));
//        //13
//        driver.findElement(By.id("finish")).click();
//        //14
//        String thanksPageUrl = "https://www.saucedemo.com/checkout-complete.html";
//        System.out.println("Is thank you page displayed: " + driver.getCurrentUrl().equals(thanksPageUrl));
//
//
//    }
//}