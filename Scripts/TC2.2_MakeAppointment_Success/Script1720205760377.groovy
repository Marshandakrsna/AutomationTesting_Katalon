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

WebUI.callTestCase(findTestCase('TC1.2_ValidLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Make Appointment Page/select Facility'), 'Hongkong CURA Healthcare Center', false)

WebUI.click(findTestObject('Make Appointment Page/checklist checkbox hospital redmission'))

WebUI.click(findTestObject('Make Appointment Page/select Healthcare Program'))

WebUI.click(findTestObject('Make Appointment Page/Click visit date'))

WebUI.click(findTestObject('Make Appointment Page/item Date'))

WebUI.setText(findTestObject('Make Appointment Page/input Comment'), 'Saya akan terlambat 5 menit')

WebUI.click(findTestObject('Make Appointment Page/button Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Make Appointment Page/text Appointment Confirm'), 0)

