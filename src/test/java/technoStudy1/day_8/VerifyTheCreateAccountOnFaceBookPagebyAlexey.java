package technoStudy1.day_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import technoStudy1.utilities.UtilitesClass;

public class VerifyTheCreateAccountOnFaceBookPagebyAlexey extends UtilitesClass {
    public static void main(String[] args) throws InterruptedException {
        String webpageURL="https://www.facebook.com/";
        driver.get(webpageURL);


        //Create new Account button
        //<a role="button" class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy" href="#" ajaxify="/reg/spotlight/" id="u_0_0_9g"
           // data-testid="open-registration-form-button" rel="async">Create new account</a>
        WebElement createNewAccButton = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccButton.click();


        //type firstName
        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="firstname" value="" aria-required="true"
          // placeholder="" aria-label="First name" id="u_2_b_SD" tabindex="0" aria-describedby="js_1l" aria-invalid="true">
        Thread.sleep(1000);
        WebElement firstName = driver.findElement(By.cssSelector("input[aria-label='First name']"));
        firstName.sendKeys("Alex");


        //type lastName
        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="lastname" value="" aria-required="true"
          // placeholder="" aria-label="Last name" id="u_2_d_BG">
        Thread.sleep(1000);
        WebElement lastName = driver.findElement(By.cssSelector("input[aria-label='Last name']"));
        lastName.sendKeys("Voytsek");

        //mobile number
        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email__" value="" aria-required="true"
          // placeholder="" aria-label="Mobile number or email" id="u_2_g_/D">
        Thread.sleep(1000);
        WebElement mobileNumber = driver.findElement(By.cssSelector("input[aria-label='Mobile number or email']"));
        mobileNumber.sendKeys("1224659069");

        //new password
        //<input type="password" class="inputtext _58mg _5dba _2ph-" data-type="password" autocomplete="new-password" name="reg_passwd__"
          // id="password_step_input" aria-required="true" placeholder="" aria-label="New password">
        Thread.sleep(1000);
        WebElement newPassword = driver.findElement(By.cssSelector("input[aria-label='New password']"));
        newPassword.sendKeys("MasterKey1!");


        //Birthday- monthSelected
        //<select aria-label="Month" name="birthday_month" id="month" title="Month" class="_9407 _5dba _9hk6 _8esg"><option value="1">Jan</option>
          // <option value="2" selected="1">Feb</option><option value="3">Mar</option><option value="4">Apr</option><option value="5">May</option>
          // <option value="6">Jun</option><option value="7">Jul</option><option value="8">Aug</option><option value="9">Sep</option><option value="10">Oct</option>
          // <option value="11">Nov</option><option value="12">Dec</option></select>
        Thread.sleep(1000);
        WebElement monthSelect = driver.findElement(By.id("month"));
        Select select1=new Select(monthSelect);
        select1.selectByIndex(10);

       //Birthday= daySelect
        //<select aria-label="Day" name="birthday_day" id="day" title="Day" class="_9407 _5dba _9hk6 _8esg"><option value="1">1</option>
        // <option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option>
        // <option value="7">7</option><option value="8">8</option><option value="9">9</option><option value="10">10</option><option value="11">11</option>
        // <option value="12">12</option><option value="13">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option>
        // <option value="17" selected="1">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option>
        // <option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option>
        // <option value="27">27</option><option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option></select>
        Thread.sleep(1000);
        WebElement dateSelect = driver.findElement(By.id("day"));
        Select select2=new Select(dateSelect);
        select2.selectByIndex(15);



        //Birthday- select year
        //<select aria-label="Year" name="birthday_year" id="year" title="Year" class="_9407 _5dba _9hk6 _8esg"><option value="2023" selected="1">2023</option><option value="2022">2022</option><option value="2021">2021</option><option value="2020">2020</option><option value="2019">2019</option><option value="2018">2018</option><option value="2017">2017</option><option value="2016">2016</option><option value="2015">2015</option><option value="2014">2014</option><option value="2013">2013</option><option value="2012">2012</option><option value="2011">2011</option><option value="2010">2010</option><option value="2009">2009</option><option value="2008">2008</option><option value="2007">2007</option><option value="2006">2006</option><option value="2005">2005</option><option value="2004">2004</option><option value="2003">2003</option><option value="2002">2002</option><option value="2001">2001</option><option value="2000">2000</option><option value="1999">1999</option><option value="1998">1998</option><option value="1997">1997</option><option value="1996">1996</option><option value="1995">1995</option><option value="1994">1994</option><option value="1993">1993</option><option value="1992">1992</option><option value="1991">1991</option><option value="1990">1990</option><option value="1989">1989</option><option value="1988">1988</option><option value="1987">1987</option><option value="1986">1986</option><option value="1985">1985</option><option value="1984">1984</option><option value="1983">1983</option><option value="1982">1982</option><option value="1981">1981</option><option value="1980">1980</option><option value="1979">1979</option><option value="1978">1978</option><option value="1977">1977</option><option value="1976">1976</option><option value="1975">1975</option><option value="1974">1974</option><option value="1973">1973</option><option value="1972">1972</option><option value="1971">1971</option><option value="1970">1970</option><option value="1969">1969</option><option value="1968">1968</option><option value="1967">1967</option><option value="1966">1966</option><option value="1965">1965</option><option value="1964">1964</option><option value="1963">1963</option><option value="1962">1962</option><option value="1961">1961</option><option value="1960">1960</option><option value="1959">1959</option><option value="1958">1958</option><option value="1957">1957</option><option value="1956">1956</option><option value="1955">1955</option><option value="1954">1954</option><option value="1953">1953</option><option value="1952">1952</option><option value="1951">1951</option><option value="1950">1950</option><option value="1949">1949</option><option value="1948">1948</option><option value="1947">1947</option><option value="1946">1946</option><option value="1945">1945</option><option value="1944">1944</option><option value="1943">1943</option><option value="1942">1942</option><option value="1941">1941</option><option value="1940">1940</option><option value="1939">1939</option><option value="1938">1938</option><option value="1937">1937</option><option value="1936">1936</option><option value="1935">1935</option><option value="1934">1934</option><option value="1933">1933</option><option value="1932">1932</option><option value="1931">1931</option><option value="1930">1930</option><option value="1929">1929</option><option value="1928">1928</option><option value="1927">1927</option><option value="1926">1926</option><option value="1925">1925</option><option value="1924">1924</option><option value="1923">1923</option><option value="1922">1922</option><option value="1921">1921</option><option value="1920">1920</option><option value="1919">1919</option><option value="1918">1918</option><option value="1917">1917</option><option value="1916">1916</option><option value="1915">1915</option><option value="1914">1914</option><option value="1913">1913</option><option value="1912">1912</option><option value="1911">1911</option><option value="1910">1910</option><option value="1909">1909</option><option value="1908">1908</option><option value="1907">1907</option><option value="1906">1906</option><option value="1905">1905</option></select>
        Thread.sleep(1000);
        WebElement yearSelect = driver.findElement(By.name("birthday_year")); // only located
        Select select3=new Select(yearSelect);
        select3.selectByValue("2000"); // choose from !


        //Gender select- radioButton (select just one! )
        //<input type="radio" class="_8esa" name="sex" value="2" id="u_2_5_T9">
        Thread.sleep(1000);
        WebElement genderSelect = driver.findElement(By.xpath("//input[@value='2']"));
        genderSelect.click();


        //sighUp button
        //<div class="_1lch"><button type="submit" class="_6j mvm _6wk _6wl _58mi _3ma _6o _6v" name="websubmit" id="u_2_s_bH">Sign Up</button><span class="hidden_elem _58ml" id="u_2_t_gd"><img class="img" src="https://static.xx.fbcdn.net/rsrc.php/v3/yb/r/GsNJNwuI-UM.gif" alt="" width="16" height="11"></span></div>
        Thread.sleep(1000);
        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        //signUpButton.getText();
        System.out.println("expected txt: " + signUpButton.getText());

        //verification
        String expectSignUp=signUpButton.getText();
        String actualSignUp="Sign Up";
        if(actualSignUp.equals(expectSignUp)){
            System.out.print(true + " pass: ");
            System.out.println(" actual txt: " + signUpButton.getText());
        }else {
            System.out.println(false);
            System.out.println("actual txt: " + signUpButton.getText());
        }





        quitDriver(40);
    }
}
