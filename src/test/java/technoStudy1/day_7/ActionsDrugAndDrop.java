package technoStudy1.day_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technoStudy1.utilities.UtilitesClass;

public class ActionsDrugAndDrop extends UtilitesClass {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        //<div class="dragableBox" id="box3" dragableelement="2" style="visibility: visible;">Washington</div>
        WebElement washingtonDragAndDrom = driver.findElement(By.id("box3"));
        //we need target where we ging to move it - we going to move it to usa!
        //<div id="box103" class="dragableBoxRight">United States</div>
        WebElement targetUSA = driver.findElement(By.id("box103"));

        Actions actions = new Actions(driver); //we create object
        // action for particular
        Action washingtonAction = actions.dragAndDrop(washingtonDragAndDrom, targetUSA).build();
        washingtonAction.perform();

        //<div class="dragableBox" id="box7" dragableelement="6">Madrid</div>
        WebElement madridDragAndDrop = driver.findElement(By.id("box7"));
        //<div id="box107" class="dragableBoxRight">Spain</div>
        WebElement targetSpain = driver.findElement(By.id("box107"));
        Action romeAction = actions.dragAndDrop(madridDragAndDrop, targetSpain).build();
        romeAction.perform();

        //<div class="dragableBox" id="box6" dragableelement="5">Rome</div>
        WebElement romeDragAndDrom = driver.findElement(By.id("box6"));
        //<div id="box106" class="dragableBoxRight">Italy</div>
        WebElement targetItaly = driver.findElement(By.id("box106"));
        Action madridAction = actions.dragAndDrop(romeDragAndDrom, targetItaly).build();
        madridAction.perform();

        //<div class="dragableBox" id="box2" dragableelement="1" style="visibility: visible;">Stockholm</div>
        WebElement stockholmDragAndDrop = driver.findElement(By.id("box2"));
        //<div id="box102" class="dragableBoxRight">Sweden</div>
        WebElement targetSweden = driver.findElement(By.id("box102"));
        Action stockholmAction=actions.dragAndDrop(stockholmDragAndDrop, targetSweden).build();
        stockholmAction.perform();

        //<div class="dragableBox" id="box4" dragableelement="3" style="visibility: visible;">Copenhagen</div>
        WebElement copenhagenDragAndDrop=driver.findElement(By.id("box4"));
        //<div id="box104" class="dragableBoxRight">Denmark</div>
        WebElement targerDenmark=driver.findElement(By.id("box104"));
        Action copenhagenAction=actions.dragAndDrop(copenhagenDragAndDrop, targerDenmark).build();
        copenhagenAction.perform();


        //<div class="dragableBox" id="box1" dragableelement="0" style="visibility: visible;">Oslo</div>
        WebElement osloDragAndDrop=driver.findElement(By.id("box1"));
        //<div id="box101" class="dragableBoxRight">Norway</div>
        WebElement targerNorway=driver.findElement(By.id("box101"));
        Action osloAction=actions.dragAndDrop(osloDragAndDrop, targerNorway).build();
        osloAction.perform();

        //<div class="dragableBox" id="box5" dragableelement="4">Seoul</div>
        WebElement seoulDragAndDrop=driver.findElement(By.id("box5"));
        //<div id="box105" class="dragableBoxRight">South Korea</div>
        WebElement targetSouthKorea=driver.findElement(By.id("box105"));
        Action seoulAction=actions.dragAndDrop(seoulDragAndDrop, targetSouthKorea).build();
        seoulAction.perform();



        quitDriver(3);
    }
}
