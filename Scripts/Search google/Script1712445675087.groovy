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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/')

WebUI.click(findTestObject('Page_Google/button_Tetap logout'))

WebUI.setText(findTestObject('Object Repository/Page_Google/textarea_Login_q'), 'software quality assurance')
WebUI.sendKeys(findTestObject('Object Repository/Page_Google/textarea_Login_q'), Keys.chord(Keys.ENTER))


WebUI.verifyElementPresent(findTestObject('Object Repository/Page_software quality assurance - Penelusur_0ceb10/div_Tekan  untuk langsung ke kotak penelusu_1d39b7'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_software quality assurance - Penelusur_0ceb10/div_GajiTugasContohPDFEngineer adalahJobMat_e50184'))

WebUI.closeBrowser()
