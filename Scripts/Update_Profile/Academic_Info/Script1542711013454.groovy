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

WebUI.callTestCase(findTestCase('Generic/Login_Page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Generic/Profile'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Click \'Academic Tab\''
WebUI.click(findTestObject('Page_Basic Info/a_Academic Information'))

'Enter \'Qualification\'\r\n'
WebUI.setText(findTestObject('Page_Basic Info/input_CGPAPercentage_qualifica'), findTestData('Update_Profile_Testdata/Academic_Info').getValue(
        1, 1))

'Enter \'Degree\'\r\n'
WebUI.setText(findTestObject('Page_Basic Info/input_CGPAPercentage_degree'), findTestData('Update_Profile_Testdata/Academic_Info').getValue(
        2, 1))

'Enter \'Specification\''
WebUI.setText(findTestObject('Page_Basic Info/input_CGPAPercentage_specializ'), findTestData('Update_Profile_Testdata/Academic_Info').getValue(
        3, 1))

'Enter \'Namoe Of The Insitution\' '
WebUI.setText(findTestObject('Page_Basic Info/input_CGPAPercentage_nameOfThe'), findTestData('Update_Profile_Testdata/Academic_Info').getValue(
        4, 1))

'Enter \'University\'\r\n'
WebUI.setText(findTestObject('Page_Basic Info/input_CGPAPercentage_universit'), findTestData('Update_Profile_Testdata/Academic_Info').getValue(
        5, 1))

'Enter \'Year Of Passing\''
WebUI.setText(findTestObject('Page_Basic Info/input_CGPAPercentage_text-cent'), findTestData('Update_Profile_Testdata/Academic_Info').getValue(
        6, 1))

'Enter \'Percentage\'\r\n'
WebUI.setText(findTestObject('Page_Basic Info/input_CGPAPercentage_percentage'), findTestData('Update_Profile_Testdata/Academic_Info').getValue(
        7, 1))

'Click \'Update\' '
WebUI.click(findTestObject('Page_Basic Info/button_Update_Academic'))

WebUI.delay(5)

'Browser Back'
WebUI.back()

'Click \'Academic Tab\''
WebUI.click(findTestObject('Object Repository/Page_User Profile/a_Academic Info'))

'VERIFY UPDATED ACADEMIC INFROMATION WHERE QUALIFICATION'
WebUI.verifyElementText(findTestObject('Page_User Profile/span_b.tech'), findTestData('Update_Profile_Testdata/Academic_Info').getValue(
        1, 1))

