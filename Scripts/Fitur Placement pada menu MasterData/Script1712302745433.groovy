import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login web Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Admin Page/a_Master Data'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Admin Page/a_Placements'), 'Placements')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Admin Page/div_Master Data                            _df5ad7'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Admin Page/a_Placements'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Admin Page/div_List of Placements                     _0d9ee7'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Admin Page/a_Add New Placement'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Admin Page/div_Placement Form                         _d4d08a'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Admin Page/input_Name_name'), 'Depok')

WebUI.setText(findTestObject('Object Repository/Page_Admin Page/textarea_Description_description'), 'Jabar')

WebUI.click(findTestObject('Object Repository/Page_Admin Page/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Admin Page/div_Successfully submit dataOkNoCancel'))

WebUI.click(findTestObject('Object Repository/Page_Admin Page/button_Ok'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Admin Page/td_Depok'), 'Depok')

WebUI.closeBrowser()

