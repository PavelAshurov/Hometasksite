import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SiteTest {
    @Test
    public void heading() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        browser.get("C:\\Users\\A S U S\\IdeaProjects\\Hometask site\\src\\test\\resources\\HometaskSite.html");
        String heading = browser.findElement(By.tagName("h3")).getText();
        // heading.getAttribute("inner text");
        assertEquals(heading, "Homework Website");
        browser.quit();
    }

    @Test
    public void table() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        browser.get("C:\\Users\\A S U S\\IdeaProjects\\Hometask site\\src\\test\\resources\\HometaskSite.html");
        String table = browser.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[2]/td[2]")).getText();
        assertEquals(table, "Senior Automation QA");
        browser.quit();
    }

    @Test
    public void checkbox() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        browser.get("C:\\Users\\A S U S\\IdeaProjects\\Hometask site\\src\\test\\resources\\HometaskSite.html");
        browser.findElement(By.id("checkbox1")).click();
        boolean checkboxIsSelected = browser.findElement(By.id("checkbox1")).isSelected();
        assertTrue(checkboxIsSelected);
        browser.quit();
    }

    @Test
    public void select() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        browser.get("C:\\Users\\A S U S\\IdeaProjects\\Hometask site\\src\\test\\resources\\HometaskSite.html");
        WebElement option = browser.findElement(By.id("department"));
        Select optionSelect = new Select(option);
        optionSelect.selectByValue("Gamedev");
        WebElement firstPointActive = optionSelect.getFirstSelectedOption();
        String fistOptionText = firstPointActive.getText();
        assertEquals(fistOptionText, "Gamedev");
        browser.quit();
    }

    @Test
    public void image() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        browser.get("C:\\Users\\A S U S\\IdeaProjects\\Hometask site\\src\\test\\resources\\HometaskSite.html");
        Boolean img = browser.findElement(By.id("img")).isDisplayed();
        assertTrue(img);
        browser.quit();
    }

    @Test
    public void emailPole() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        browser.get("C:\\Users\\A S U S\\IdeaProjects\\Hometask site\\src\\test\\resources\\HometaskSite.html");
        WebElement email = browser.findElement(By.id("email"));
        email.sendKeys("test123@gmail.com");
        String emailValue = email.getAttribute("value");
        assertEquals(emailValue, "test123@gmail.com");
        browser.quit();
    }

    @Test
    public void button() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        browser.get("C:\\Users\\A S U S\\IdeaProjects\\Hometask site\\src\\test\\resources\\HometaskSite.html");
        browser.findElement(By.id("button")).click();
        browser.quit();
    }
    @Test
    public void link() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        browser.get("C:\\Users\\A S U S\\IdeaProjects\\Hometask site\\src\\test\\resources\\HometaskSite.html");
        browser.findElement(By.id("link")).click();
        String tmsElement = browser.findElement(By.xpath("//*[@id=\"recorddiv82930702\"]/div[3]/div/div/div/div/div/div")).getText();
        assertEquals(tmsElement,"TeachMeSkills - это школа программирования, где мы научим тебя востребованным сегодня знаниям. Все наши программы составлены Senior и Lead разработчиками ведущих IT компаний специально для новичков в IT.");
        browser.quit();
    }
}

