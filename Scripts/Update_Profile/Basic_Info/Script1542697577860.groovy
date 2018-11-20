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

WebUI.comment('TEST CASE TO UPDATE BASIC INFORMATION OF USER')

WebUI.callTestCase(findTestCase('Generic/Login_Page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Generic/Profile'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Enter \'Address\''
WebUI.setText(findTestObject('Object Repository/Page_Basic Info/textarea__addr1'), findTestData('Update_Profile_Testdata/Basic_Info').getValue(
        1, 1))

'Enter \'AddressLine1\'\r\n'
WebUI.setText(findTestObject('Object Repository/Page_Basic Info/textarea__addr2'), findTestData('Update_Profile_Testdata/Basic_Info').getValue(
        2, 1))

'Enter \'City\'\r\n'
WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input_Address line 2_city'), findTestData('Update_Profile_Testdata/Basic_Info').getValue(
        3, 1))

'Enter \'State\''
WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input__state'), findTestData('Update_Profile_Testdata/Basic_Info').getValue(
        4, 1))

'Enter \'Pincode\'\r\n'
WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input__pin'), findTestData('Update_Profile_Testdata/Basic_Info').getValue(
        5, 1))

'Enter \'EmergencyContactNumber\'\r\n'
WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input__emergencyContact'), findTestData('Update_Profile_Testdata/Basic_Info').getValue(
        6, 1))

'Enter \'EmergencyRelationship\''
WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input__emergencyContactRelatio'), findTestData('Update_Profile_Testdata/Basic_Info').getValue(
        7, 1))

'Click \'Update\' button'
WebUI.click(findTestObject('Object Repository/Page_Basic Info/button_Update'))

WebUI.delay(5)

'Browser \'Back\''
WebUI.back()

'VERIFY UPDATED BASIC INFORMATION WHERE STATE '
WebUI.verifyElementText(findTestObject('Page_User Profile/p_State'), findTestData('Update_Profile_Testdata/Basic_Info').getValue(
        4, 1))

'VERIFY UPDATED BASIC INFORMATION WHERE EMERGENCY RELATIONSHIP\r\n'
WebUI.verifyElementText(findTestObject('Page_User Profile/p_Emergency Relationship'), findTestData('Update_Profile_Testdata/Basic_Info').getValue(
        7, 1))

'VERIFY UPDATED BASIC INFORMATION WHERE EMERGENCY CONTACT NUMBER'
WebUI.verifyElementText(findTestObject('Page_User Profile/p_Emergency Contact'), findTestData('Update_Profile_Testdata/Basic_Info').getValue(
        6, 1))

