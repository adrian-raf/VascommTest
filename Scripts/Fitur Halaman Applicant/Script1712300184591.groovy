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

WebUI.click(findTestObject('Object Repository/Page_Admin Page/a_Applicants'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Admin Page/a_Applicants'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Admin Page/div_List of Applicants                     _5ed6cc'))

WebUI.setText(findTestObject('Object Repository/Page_Admin Page/input_Filter_search'), 'Raka')

WebUI.click(findTestObject('Object Repository/Page_Admin Page/button_Search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Admin Page/td_Raka'), 0)

WebUI.click(findTestObject('Object Repository/Page_Admin Page/a_Detail'))

WebUI.click(findTestObject('Object Repository/Page_Admin Page/a_Back'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Admin Page/select_All Placement                       _516cda'), 
    'On Site Jakarta', true)

WebUI.click(findTestObject('Object Repository/Page_Admin Page/button_Filter'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Admin Page/td_Sorry - no data to be shown'))

WebUI.closeBrowser()

