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
import groovy.json.JsonSlurper

var = WS.sendRequest(findTestObject('User/GET/GET DELAY RESPONSE'))

def jsonSlurper = new JsonSlurper()
def dataUser = jsonSlurper.parseText(var.getResponseText())
def totalData = dataUser.size()

System.out.println(var.getStatusCode())
WS.verifyResponseStatusCode(this.var, 200)

if (var.getStatusCode() == 200 && var.getResponseBodyContent() != null) {
	println("Total Data: " + totalData)
	//dataUser.each { println it }
	System.out.println(var.getStatusCode())
	System.out.println(var.getContentType())
	System.out.println(var.getResponseBodyContent())
} else {
	System.out.println(var.getStatusCode())
	System.out.println(var.getContentType())
	System.out.println(var.getResponseBodyContent())
}
