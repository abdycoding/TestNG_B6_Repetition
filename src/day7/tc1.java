package day7;

import Utility.BaseDriverGeneral;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class tc1 {
        public tc1() {

            PageFactory.initElements(BaseDriverGeneral.driver, this);
        }

        @FindBy(id = "username")
        public WebElement username;

        @FindBy(id = "password")
        public WebElement password;

        @FindBy(id = "Inpatient Ward")
        public WebElement inpatient_Ward;

        @FindBy(id = "loginButton")
        public WebElement login_Button;

        @FindBy(id = "referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")
        public WebElement register_Patient;

        @FindBy(name = "givenName")
        public WebElement given_name;
        @FindBy(name = "middleName")
        public WebElement middle_name;
        @FindBy(name = "familyName")
        public WebElement family_name;

        @FindBy(id="next-button")
        public WebElement next_Button;

        @FindBy(id = "gender-field")
        public WebElement select_gender;

        @FindBy(id="birthdateDay-field")
        public WebElement day;

        @FindBy(id = "birthdateMonth-field")
        public WebElement month;

        @FindBy(id = "birthdateYear-field")
        public WebElement year;

        @FindBy(id="address1")
        public WebElement adres1;

        @FindBy(id = "cityVillage")
        public WebElement city;

        @FindBy(id="stateProvince")
        public WebElement state;

        @FindBy(id = "country")
        public WebElement country;

        @FindBy(id = "postalCode")
        public WebElement postalcode;

        @FindBy(name = "phoneNumber")
        public WebElement phoneNumber;

        @FindBy(id = "relationship_type")
        public WebElement relationship;

        @FindBy(xpath = "//input[@placeholder='Person Name']")
        public WebElement person_Name;


        @FindBy(xpath = "//a[@ng-click='addNewRelationship()']/i")
        public WebElement add;

        @FindBy(id="submit")
        public WebElement confirm;


        @FindBy(xpath = "//div[@class='float-sm-right']/span")
        public WebElement patient_id;

        @FindBy(xpath = "//ul[@id='breadcrumbs']/li/a")
        public WebElement home;


        @FindBy(id = "coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension")
        public WebElement dataManagement;

        @FindBy(id = "coreapps-mergePatientsHomepageLink-app")
        public WebElement merge;

        @FindBy(id = "patient1-text")
        public WebElement patient_id1;

        @FindBy(id = "patient2-text")
        public WebElement patient_id2;

        @FindBy(id = "confirm-button")
        public WebElement continueButton;


        @FindBy(id = "first-patient")
        public WebElement firstPatient;

        @FindBy(xpath = "//h1")
        public WebElement headline1;

        @FindBy(id="confirm-button")
        public WebElement confirm_Button;

        @FindBy(css = ".float-sm-right > span")
        public List<WebElement> patient_ids;

    }

