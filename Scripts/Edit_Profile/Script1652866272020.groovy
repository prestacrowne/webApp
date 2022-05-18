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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Input_NoTelp'), '08999293121')

WebUI.click(findTestObject('Button_TglLahir'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Select_Month'), '3', false)

WebUI.selectOptionByValue(findTestObject('Select_Year'), '1997', false)

WebUI.click(findTestObject('Select_Date'))

WebUI.click(findTestObject('Select_Gender'))

WebUI.click(findTestObject('select_gender2'))

WebUI.click(findTestObject('Select_Identitas'))

WebUI.click(findTestObject('Select_Identitas2'))

WebUI.setText(findTestObject('No_identitas'), '327091232131314')

WebUI.click(findTestObject('Button_Lanjut'), FailureHandling.STOP_ON_FAILURE)

