Feature: Login test
  
  @TC-1
  Scenario: check Admin user able to login with valid user credentials
    Given Launch Erp Application with url "http://orangehrm.qedgetech.com"
    When enter valid username, password and click login
    Then Validate the result
