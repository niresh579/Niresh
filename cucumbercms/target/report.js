$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:EditPI.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": " verify the EditPi",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "enter the webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "EditPi.enter_the_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the username",
  "rows": [
    {
      "cells": [
        "username",
        "EZH556542"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "EditPi.enter_the_username(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the password",
  "rows": [
    {
      "cells": [
        "password",
        "cbstest"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "EditPi.enter_the_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login",
  "keyword": "And "
});
formatter.match({
  "location": "EditPi.click_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the menu bar",
  "keyword": "Then "
});
formatter.match({
  "location": "EditPi.click_the_menu_bar()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat cucumbercms.cucumbercms.BaseTest.getExcelData(BaseTest.java:97)\r\n\tat StepDefinitions.EditPi.click_the_menu_bar(EditPi.java:99)\r\n\tat ✽.click the menu bar(file:EditPI.feature:14)\r\n",
  "status": "failed"
});
});