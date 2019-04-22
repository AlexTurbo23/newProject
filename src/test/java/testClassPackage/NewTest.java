package testClassPackage;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;




public class NewTest {
    public static WebElement element = null;
    String baseUrl;
    WebDriver driver;



    @BeforeMethod
    public void SetUp() {
        baseUrl = "https://rozetka.com.ua/";
        System.setProperty("webdriver.chrome.driver", "C://Testing/browsers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }

    @Test
    public void prise() throws InterruptedException, IOException {
        // Here we need to create logger instance so we need to pass Class name for
        //which  we want to create log file in my case Google is classname
        Logger logger= Logger.getLogger("NewTest");


        // configure log4j properties file
        PropertyConfigurator.configure("Log4j.properties");


        System.out.println("Клик на раздел Компьютеры и ноутбуки");
        driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-rz-main-page/div/aside/main-page-sidebar/sidebar-fat-menu/div/ul/li[1]/a")).click();
        logger.info(" Click to the link 'Computers and Notebooks' ");

        System.out.println("Клик на раздел  Ноутбуки");
        driver.findElement(By.xpath("//*[@id='content-inner-block']/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div[3]/div/div/div[1]/div/div[1]/div[1]/div/p/a")).click();
        logger.info("Click to the link 'Notebooks' ");

        System.out.println("Клик на раздел ноутбуки с SSD");
        driver.findElement(By.xpath("//*[@id='content-inner-block']/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/div/div[1]/div[1]/div[3]/div[2]/div/p/a")).click();
        logger.info(" Click to the link 'Notebooks with SSD' ");

        System.out.println("Навести курсор мыши на продукт №1");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.name("comparison_new_catalog"))).build().perform();
        logger.info("Move cursor to the first product");

        System.out.println("Клик на кнопку Добавить к сравнению");
        driver.findElement(By.xpath("id('catalog_goods_block')/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/ul[1]/li[2]/div[1]/label[1]/span[1]/img[1]")).click();
        logger.info("Click to the 'Add to compare' button");

        Thread.sleep(500);
        logger.info("Stop web driver and wait");

        System.out.println("Навести курсор мыши на продукт №2");
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='g-i-tile g-i-tile-catalog'][2]/div/div/div/div/div[8]/ul/li[2]/div/label/span/img"))).build().perform();
        logger.info("Move cursor to the second product");

        Thread.sleep(  4000);
        logger.info("Stop web driver and wait");

        System.out.println("Клик на кнопку Добавить к сравнению");
        driver.findElement(By.xpath("//div[@class='g-i-tile g-i-tile-catalog'][2]/div/div/div/div/div[8]/ul/li[2]/div/label/span/img")).click();
        logger.info("Click to the 'Add to compare' button");

        Thread.sleep(4000);

        System.out.println("Клик на кнопку Сравнить ");
        driver.findElement(By.xpath("id('comparison')/a[1]")).click();
        logger.info("Click to the 'Compare' button");

        System.out.println("Клик на кнопку Сравнить эти товары ");
        driver.findElement(By.xpath("id('content-inner-block')/div[2]/div[1]/section[1]/div[4]/a[1]/span[1]")).click();
        System.out.println("");
        logger.info("Click to the 'Compare this products' button");

        logger.info("String comparison 'All parameters page'");
        //Страница "Все параметры"
        String allSetting1 = driver.findElement(By.xpath("//div[@name='equal'][2]/div[2]")).getText();
        String allSetting2 = driver.findElement(By.xpath("//div[@name='equal'][2]/div[3]")).getText();
        String nameParam1 = driver.findElement(By.xpath("//div[@name='equal'][2]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting3 = driver.findElement(By.xpath("//div[@name='equal'][3]/div[2]")).getText();
        String allSetting4 = driver.findElement(By.xpath("//div[@name='equal'][3]/div[3]")).getText();
        String nameParam2 = driver.findElement(By.xpath("//div[@name='equal'][3]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting5 = driver.findElement(By.xpath("//div[@name='equal'][4]/div[2]")).getText();
        String allSetting6 = driver.findElement(By.xpath("//div[@name='equal'][4]/div[3]")).getText();
        String nameParam3 = driver.findElement(By.xpath("//div[@name='equal'][4]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting7 = driver.findElement(By.xpath("//div[@name='equal'][5]/div[2]")).getText();
        String allSetting8 = driver.findElement(By.xpath("//div[@name='equal'][5]/div[3]")).getText();
        String nameParam4 = driver.findElement(By.xpath("//div[@name='equal'][5]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting9 = driver.findElement(By.xpath("//div[@name='equal'][6]/div[2]")).getText();
        String allSetting10 = driver.findElement(By.xpath("//div[@name='equal'][6]/div[3]")).getText();
        String nameParam5 = driver.findElement(By.xpath("//div[@name='equal'][6]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting11 = driver.findElement(By.xpath("//div[@name='equal'][7]/div[2]")).getText();
        String allSetting12 = driver.findElement(By.xpath("//div[@name='equal'][7]/div[3]")).getText();
        String nameParam6 = driver.findElement(By.xpath("//div[@name='equal'][7]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting13 = driver.findElement(By.xpath("//div[@name='different'][1]/div[2]")).getText();
        String allSetting14 = driver.findElement(By.xpath("//div[@name='different'][1]/div[3]")).getText();
        String nameParam7 = driver.findElement(By.xpath("//div[@name='different'][1]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting15 = driver.findElement(By.xpath("//div[@name='different'][2]/div[2]")).getText();
        String allSetting16 = driver.findElement(By.xpath("//div[@name='different'][2]/div[3]")).getText();
        String nameParam8 = driver.findElement(By.xpath("//div[@name='different'][2]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting17 = driver.findElement(By.xpath("//div[@name='different'][3]/div[2]")).getText();
        String allSetting18 = driver.findElement(By.xpath("//div[@name='different'][3]/div[3]")).getText();
        String nameParam9 = driver.findElement(By.xpath("//div[@name='different'][3]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting19 = driver.findElement(By.xpath("//div[@name='different'][4]/div[2]")).getText();
        String allSetting20 = driver.findElement(By.xpath("//div[@name='different'][4]/div[3]")).getText();
        String nameParam10 = driver.findElement(By.xpath("//div[@name='different'][4]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting21 = driver.findElement(By.xpath("//div[@name='different'][5]/div[2]")).getText();
        String allSetting22 = driver.findElement(By.xpath("//div[@name='different'][5]/div[3]")).getText();
        String nameParam11 = driver.findElement(By.xpath("//div[@name='different'][5]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting23 = driver.findElement(By.xpath("//div[@name='different'][6]/div[2]")).getText();
        String allSetting24 = driver.findElement(By.xpath("//div[@name='different'][6]/div[3]")).getText();
        String nameParam12 = driver.findElement(By.xpath("//div[@name='different'][6]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting25 = driver.findElement(By.xpath("//div[@name='different'][7]/div[2]")).getText();
        String allSetting26 = driver.findElement(By.xpath("//div[@name='different'][7]/div[3]")).getText();
        String nameParam13 = driver.findElement(By.xpath("//div[@name='different'][7]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting27 = driver.findElement(By.xpath("//div[@name='different'][8]/div[2]")).getText();
        String allSetting28 = driver.findElement(By.xpath("//div[@name='different'][8]/div[3]")).getText();
        String nameParam14 = driver.findElement(By.xpath("//div[@name='different'][8]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting29 = driver.findElement(By.xpath("//div[@name='different'][9]/div[2]")).getText();
        String allSetting30 = driver.findElement(By.xpath("//div[@name='different'][9]/div[3]")).getText();
        String nameParam15 = driver.findElement(By.xpath("//div[@name='different'][9]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting31 = driver.findElement(By.xpath("//div[@name='different'][10]/div[2]")).getText();
        String allSetting32 = driver.findElement(By.xpath("//div[@name='different'][10]/div[3]")).getText();
        String nameParam16 = driver.findElement(By.xpath("//div[@name='different'][10]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting33 = driver.findElement(By.xpath("//div[@name='different'][11]/div[2]")).getText();
        String allSetting34 = driver.findElement(By.xpath("//div[@name='different'][11]/div[3]")).getText();
        String nameParam17 = driver.findElement(By.xpath("//div[@name='different'][11]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting35 = driver.findElement(By.xpath("//div[@name='different'][12]/div[2]")).getText();
        String allSetting36 = driver.findElement(By.xpath("//div[@name='different'][12]/div[3]")).getText();
        String nameParam18 = driver.findElement(By.xpath("//div[@name='different'][12]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting37 = driver.findElement(By.xpath("//div[@name='different'][13]/div[2]")).getText();
        String allSetting38 = driver.findElement(By.xpath("//div[@name='different'][13]/div[3]")).getText();
        String nameParam19 = driver.findElement(By.xpath("//div[@name='different'][13]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting39 = driver.findElement(By.xpath("//div[@name='different'][14]/div[2]")).getText();
        String allSetting40 = driver.findElement(By.xpath("//div[@name='different'][14]/div[3]")).getText();
        String nameParam20 = driver.findElement(By.xpath("//div[@name='different'][14]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting41 = driver.findElement(By.xpath("//div[@name='different'][15]/div[2]")).getText();
        String allSetting42 = driver.findElement(By.xpath("//div[@name='different'][15]/div[3]")).getText();
        String nameParam21 = driver.findElement(By.xpath("//div[@name='different'][15]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting43 = driver.findElement(By.xpath("//div[@name='different'][16]/div[2]")).getText();
        String allSetting44 = driver.findElement(By.xpath("//div[@name='different'][16]/div[3]")).getText();
        String nameParam22 = driver.findElement(By.xpath("//div[@name='different'][16]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting45 = driver.findElement(By.xpath("//div[@name='different'][17]/div[2]")).getText();
        String allSetting46 = driver.findElement(By.xpath("//div[@name='different'][17]/div[3]")).getText();
        String nameParam23 = driver.findElement(By.xpath("//div[@name='different'][17]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting47 = driver.findElement(By.xpath("//div[@name='different'][18]/div[2]")).getText();
        String allSetting48 = driver.findElement(By.xpath("//div[@name='different'][18]/div[3]")).getText();
        String nameParam24 = driver.findElement(By.xpath("//div[@name='different'][18]/div[@class='comparison-t-cell-first']")).getText();

        String allSetting49 = driver.findElement(By.xpath("//div[@name='different'][19]/div[2]")).getText();
        String allSetting50 = driver.findElement(By.xpath("//div[@name='different'][19]/div[3]")).getText();
        String nameParam25 = driver.findElement(By.xpath("//div[@name='different'][19]/div[@class='comparison-t-cell-first']")).getText();



        int count = 0;
        if(allSetting1.equals(allSetting2)){
            System.out.println(true);
            System.out.println(nameParam1 + ":" + "" + allSetting1 + " " + allSetting2);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting3.equals(allSetting4)){
            System.out.println(true);
            System.out.println(nameParam2 + ":" + "" + allSetting3 + " " + allSetting4);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting5.equals(allSetting6)){
            System.out.println(true);
            System.out.println(nameParam3 + ":" + "" + allSetting5 + " " + allSetting6);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting7.equals(allSetting8)){
            System.out.println(true);
            System.out.println(nameParam4 + ":" + "" + allSetting7 + " " + allSetting8);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting9.equals(allSetting10)){
            System.out.println(true);
            System.out.println(nameParam5 + ":" + "" + allSetting9 + " " + allSetting10);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting11.equals(allSetting12)){
            System.out.println(true);
            System.out.println(nameParam6 + ":" + "" + allSetting11 + " " + allSetting12);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting13.equals(allSetting14)){
            System.out.println(true);
            System.out.println(nameParam7 + ":" + "" + allSetting13 + " " + allSetting14);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting15.equals(allSetting16)){
            System.out.println(true);
            System.out.println(nameParam8 + ":" + "" + allSetting15 + " " + allSetting16);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting17.equals(allSetting18)){
            System.out.println(true);
            System.out.println(nameParam9 + ":" + "" + allSetting17 + " " + allSetting18);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting19.equals(allSetting20)){
            System.out.println(true);
            System.out.println(nameParam10 + ":" + "" + allSetting19 + " " + allSetting20);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting21.equals(allSetting22)){
            System.out.println(true);
            System.out.println(nameParam11 + ":" + "" + allSetting21 + " " + allSetting22);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting23.equals(allSetting24)){
            System.out.println(true);
            System.out.println(nameParam12 + ":" + "" + allSetting23 + " " + allSetting24);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting25.equals(allSetting26)){
            System.out.println(true);
            System.out.println(nameParam13 + ":" + "" + allSetting25 + " " + allSetting26);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting27.equals(allSetting28)){
            System.out.println(true);
            System.out.println(nameParam14 + ":" + "" + allSetting27 + " " + allSetting28);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting29.equals(allSetting30)){
            System.out.println(true);
            System.out.println(nameParam15 + ":" + "" + allSetting29 + " " + allSetting30);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting31.equals(allSetting32)){
            System.out.println(true);
            System.out.println(nameParam16 + ":" + "" + allSetting31 + " " + allSetting32);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting33.equals(allSetting34)){
            System.out.println(true);
            System.out.println(nameParam17 + ":" + "" + allSetting33 + " " + allSetting34);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting35.equals(allSetting36)){
            System.out.println(true);
            System.out.println(nameParam18 + ":" + "" + allSetting35 + " " + allSetting36);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting37.equals(allSetting38)){
            System.out.println(true);
            System.out.println(nameParam19 + ":" + "" + allSetting37 + " " + allSetting38);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting39.equals(allSetting40)){
            System.out.println(true);
            System.out.println(nameParam20 + ":" + "" + allSetting39 + " " + allSetting40);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting41.equals(allSetting42)){
            System.out.println(true);
            System.out.println(nameParam21 + ":" + "" + allSetting41 + " " + allSetting42);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting43.equals(allSetting44)){
            System.out.println(true);
            System.out.println(nameParam22 + ":" + "" + allSetting43 + "/n" + allSetting44);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting45.equals(allSetting46)){
            System.out.println(true);
            System.out.println(nameParam23 + ":" + "" + allSetting45 + " " + allSetting46);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting47.equals(allSetting48)){
            System.out.println(true);
            System.out.println(nameParam24 + ":" + "" + allSetting47 + " " + allSetting48);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        if(allSetting49.equals(allSetting50)){
            System.out.println(true);
            System.out.println(nameParam25 + ":" + "" + allSetting49 + " " + allSetting50);
            System.out.println("");
        }
        else{

            System.out.println(count = count+1);

        }
        System.out.println("");





        //Страница "Только отличия"

        System.out.println("Клик на кнопку Только отличия");
        System.out.println("");
        driver.findElement(By.xpath("//*[@id='compare-menu']/ul/li[2]/a")).click();
        logger.info("Click to the 'Only difference' button");
        System.out.println("");
        Thread.sleep(1000);
        logger.info("String comparison'Only difference page'");


        String different1 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][1]/div[2]")).getText();
        String different2 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][1]/div[3]")).getText();
        String nameValue1 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][1]/div[@class='comparison-t-cell-first']")).getText();

        String different3 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][2]/div[2]")).getText();
        String different4 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][2]/div[3]")).getText();
        String nameValue2 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][2]/div[@class='comparison-t-cell-first']")).getText();

        String different5 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][3]/div[2]")).getText();
        String different6 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][3]/div[3]")).getText();
        String nameValue3 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][3]/div[@class='comparison-t-cell-first']")).getText();

        String different7 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][4]/div[2]")).getText();
        String different8 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][4]/div[3]")).getText();
        String nameValue4 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][4]/div[@class='comparison-t-cell-first']")).getText();

        String different9 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][5]/div[2]")).getText();
        String different10 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][5]/div[3]")).getText();
        String nameValue5 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][5]/div[@class='comparison-t-cell-first']")).getText();

        String different11 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][6]/div[2]")).getText();
        String different12 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][6]/div[3]")).getText();
        String nameValue6 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][6]/div[@class='comparison-t-cell-first']")).getText();

        String different13 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][7]/div[2]")).getText();
        String different14 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][7]/div[3]")).getText();
        String nameValue7 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][7]/div[@class='comparison-t-cell-first']")).getText();

        String different15 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][8]/div[2]")).getText();
        String different16 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][8]/div[3]")).getText();
        String nameValue8 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][8]/div[@class='comparison-t-cell-first']")).getText();

        String different17 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][9]/div[2]")).getText();
        String different18 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][9]/div[3]")).getText();
        String nameValue9 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][9]/div[@class='comparison-t-cell-first']")).getText();

        String different19 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][10]/div[2]")).getText();
        String different20 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][10]/div[3]")).getText();
        String nameValue10 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][10]/div[@class='comparison-t-cell-first']")).getText();

        String different21 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][11]/div[2]")).getText();
        String different22 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][11]/div[3]")).getText();
        String nameValue11 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][11]/div[@class='comparison-t-cell-first']")).getText();

        String different23 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][12]/div[2]")).getText();
        String different24 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][12]/div[3]")).getText();
        String nameValue12 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][12]/div[@class='comparison-t-cell-first']")).getText();

        String different25 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][13]/div[2]")).getText();
        String different26 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][13]/div[3]")).getText();
        String nameValue13 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][13]/div[@class='comparison-t-cell-first']")).getText();

        String different27 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][14]/div[2]")).getText();
        String different28 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][14]/div[3]")).getText();
        String nameValue14 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][14]/div[@class='comparison-t-cell-first']")).getText();

        String different29 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][15]/div[2]")).getText();
        String different30 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][15]/div[3]")).getText();
        String nameValue15 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][15]/div[@class='comparison-t-cell-first']")).getText();

        String different31 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][16]/div[2]")).getText();
        String different32 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][16]/div[3]")).getText();
        String nameValue16 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][16]/div[@class='comparison-t-cell-first']")).getText();

        String different33 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][17]/div[2]")).getText();
        String different34 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][17]/div[3]")).getText();
        String nameValue17 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][17]/div[@class='comparison-t-cell-first']")).getText();

        String different35 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][18]/div[2]")).getText();
        String different36 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][18]/div[3]")).getText();
        String nameValue18 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][18]/div[@class='comparison-t-cell-first']")).getText();

        String different37 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][19]/div[2]")).getText();
        String different38 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][19]/div[3]")).getText();
        String nameValue19 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][19]/div[@class='comparison-t-cell-first']")).getText();

        String different39 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][20]/div[2]")).getText();
        String different40 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][20]/div[3]")).getText();
        String nameValue20 = driver.findElement(By.xpath("//div[@class='comparison-t-row'][20]/div[@class='comparison-t-cell-first']")).getText();

        int counter = 0;
        if(different1.equals(different2)){
            System.out.println(true);
            System.out.println(nameValue1);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different3.equals(different4)){
            System.out.println(true);
            System.out.println(nameValue2);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different5.equals(different6)){
            System.out.println(true);
            System.out.println(nameValue3);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different7.equals(different8)){
            System.out.println(true);
            System.out.println(nameValue4);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different9.equals(different10)){
            System.out.println(true);
            System.out.println(nameValue5);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different11.equals(different12)){
            System.out.println(true);
            System.out.println(nameValue6);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different13.equals(different14)){
            System.out.println(true);
            System.out.println(nameValue7);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different15.equals(different16)){
            System.out.println(true);
            System.out.println(nameValue8);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different17.equals(different18)){
            System.out.println(true);
            System.out.println(nameValue9);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different19.equals(different20)){
            System.out.println(true);
            System.out.println(nameValue10);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different21.equals(different22)){
            System.out.println(true);
            System.out.println(nameValue11);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different23.equals(different24)){
            System.out.println(true);
            System.out.println(nameValue12);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different25.equals(different26)){
            System.out.println(true);
            System.out.println(nameValue13);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different27.equals(different28)){
            System.out.println(true);
            System.out.println(nameValue14);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different29.equals(different30)){
            System.out.println(true);
            System.out.println(nameValue15);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different31.equals(different32)){
            System.out.println(true);
            System.out.println(nameValue16);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different33.equals(different34)){
            System.out.println(true);
            System.out.println(nameValue17);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different35.equals(different36)){
            System.out.println(true);
            System.out.println(nameValue18);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different37.equals(different38)){
            System.out.println(true);
            System.out.println(nameValue19);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(different39.equals(different40)){
            System.out.println(true);
            System.out.println(nameValue20);
            System.out.println("");
        }
        else{

            System.out.println(counter = counter+1);

        }
        if(counter == 20){
            System.out.println("Тест ПРОЙДЕН");
            logger.info("Test passed");
        }
        else{
            System.out.println("Counter and the number of lines does not match - TEST FALSE");
            logger.info("Counter and the number of lines does not match - TEST FALSE");
            logger.info("Browser closed");
        }



    }
    @AfterMethod
    public void tearDown () {
        driver.quit();

    }

}
