import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.comment('TEST CASE TO LOGIN TO JIN APPLICATION')

WebUI.openBrowser('')

'Enter JIN url'
WebUI.navigateToUrl('http://192.168.0.28:5051/')

'Enter \'Email\'\r\n'
WebUI.setText(findTestObject('Object Repository/Page_JIN Login/input_JIN_email'), 'maddie@gmail.com')

'Enter \'Password\''
WebUI.setEncryptedText(findTestObject('Object Repository/Page_JIN Login/input_Email_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

'Click \'Login\' button'
WebUI.click(findTestObject('Object Repository/Page_JIN Login/button_LOGIN'))

'Verify succesful login'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard/h5_Dashboard'), 0)

WebUI.closeBrowser()

