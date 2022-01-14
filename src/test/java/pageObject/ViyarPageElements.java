package pageObject;

import holders.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViyarPageElements extends DriverHolder {
    public ViyarPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getInput() {
        return driver.findElements(By.xpath("//a[text()='Войти']")).get(2);
    }

    public WebElement getUserLogin() {
        return driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
    }

    public WebElement getUserPassword() {
        return driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
    }

    public WebElement getEnter() {
        return driver.findElements(By.xpath("//input[@type='submit']")).get(0);
    }

    public WebElement getConstructor() {
        return driver.findElements(By.xpath("//button[@class='button-vp']")).get(1);
    }

    public WebElement getDsp() {
        return driver.findElements(By.xpath("//span[@class='flL constructor-name']")).get(0);


    }

    public WebElement getMaterial() {
        return driver.findElement(By.xpath("//button[@type='button']"));
    }

    public WebElement getUploadfile(){
        return driver.findElement(By.xpath("//*[@class='btn-default col-lg-3']"));
    }

    public WebElement getViyarText() {
        return driver.findElement(By.xpath("//*[text()='После загрузки файла, перед отправкой заявки / проекта необходимо обязательно проверить соответствие кромкования сторон и толщины кромки.']"));
    }

    public WebElement getFurnitura() {
        return driver.findElement(By.xpath("//*[contains(text(), 'Мебельная фурнитура')]"));
    }

    public WebElement getNapravlyayuchie() {
        return driver.findElement(By.xpath("//a[@href='/catalog/napravlyayushchie/']"));
    }

    public WebElement getNapravlyayuchieP2O_350() {
        return driver.findElement(By.xpath("//a[@href='/catalog/komplekt_napravlyayushchikh_quadro_chast_v_p2o_l_350_eb_23_dsp_do_19_mm/']"));
    }

    public WebElement getViyarTextNapravlyayuchie() {
        return driver.findElement(By.xpath("//*[text()='Комплект направляющих Quadro част/в P2O L=350 EB=23 (ДСП до 19 мм) ']"));
    }
}

