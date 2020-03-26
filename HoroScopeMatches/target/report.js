$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Horoscope.feature");
formatter.feature({
  "name": "to verify the Horoscope Matches section in PWA",
  "description": "  I want to use this template for my feature file",
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
  "name": "user in the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Horoscope.user_in_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter the username",
  "rows": [
    {
      "cells": [
        "username",
        "M3507028"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Horoscope.the_user_enter_the_username(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter the password",
  "rows": [
    {
      "cells": [
        "password",
        "test4bm"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Horoscope.the_user_enter_the_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Horoscope.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Menu and horoscope matches",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "Verify user in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Horoscope.verify_user_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the menu button in the home page",
  "keyword": "When "
});
formatter.match({
  "location": "Horoscope.click_the_menu_button_in_the_home_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/ion-app/ng-component/ion-nav/page-matches/ion-footer/div/header/div/ion-navbar/div[2]/ion-row/ion-col[5]/span\"}\n  (Session info: chrome\u003d75.0.3770.142)\n  (Driver info: chromedriver\u003d75.0.3770.140 (2d9f97485c7b07dc18a74666574f19176731995c-refs/branch-heads/3770@{#1155}),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 31 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027DESKTOP-2EHDPTI\u0027, ip: \u0027192.168.64.141\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dtrue, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dtrue, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:56864}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d75.0.3770.140 (2d9f97485c7b07dc18a74666574f19176731995c-refs/branch-heads/3770@{#1155}), userDataDir\u003dC:\\Users\\CBSTES~1\\AppData\\Local\\Temp\\scoped_dir6900_1214}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d75.0.3770.142, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 1b1076b31fd9444b4fd26a1ebd55f691\n*** Element info: {Using\u003dxpath, value\u003d/html/body/ion-app/ng-component/ion-nav/page-matches/ion-footer/div/header/div/ion-navbar/div[2]/ion-row/ion-col[5]/span}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy13.click(Unknown Source)\r\n\tat cucu.HoroScopeMatches.Base.btnclick(Base.java:69)\r\n\tat StepDefinitions.Horoscope.click_the_menu_button_in_the_home_page(Horoscope.java:94)\r\n\tat ✽.click the menu button in the home page(file:Horoscope.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click the Horoscope matches.",
  "keyword": "Then "
});
formatter.match({
  "location": "Horoscope.click_the_Horoscope_matches()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify the horoscope matches are present.",
  "keyword": "And "
});
formatter.match({
  "location": "Horoscope.verify_the_horoscope_matches_are_present()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "If the horoscope matches are not present click the generate horoscope in the page.",
  "keyword": "And "
});
formatter.match({
  "location": "Horoscope.if_the_horoscope_matches_are_not_present_click_the_generate_horoscope_in_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "date of birth",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "verify the user in ADD Horoscope page.",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click the Date of birth.",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select the date of birth.",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "save the date of birth.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Time of birth",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag4"
    }
  ]
});
formatter.step({
  "name": "click the Time of birth.",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select the time of birth.",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "save the time of birth.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "country of birth",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag5"
    }
  ]
});
formatter.step({
  "name": "click the country of birth.",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select the country of birth.",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "save the country of birth.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "State of birth",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag6"
    }
  ]
});
formatter.step({
  "name": "click the State of birth.",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select the State of birth.",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "save the State of birth.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "city of birth",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag7"
    }
  ]
});
formatter.step({
  "name": "click the city of birth.",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select the city of birth.",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "save the city of birth.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "chart style",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag8"
    }
  ]
});
formatter.step({
  "name": "click the chart style button.",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select any one of the chart style.",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "save the chart style.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Language and generate horoscope",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag9"
    }
  ]
});
formatter.step({
  "name": "click the language button.",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "select any one of the language",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "save the language.",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click the generate horoscope button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "selecting any one profile in horoscopem matches",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag10"
    }
  ]
});
formatter.step({
  "name": "select a profile in Horoscope matches",
  "keyword": "Given "
});
formatter.match({
  "location": "Horoscope.select_a_profile_in_Horoscope_matches()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "shortlist the profile and send interest",
  "keyword": "Then "
});
formatter.match({
  "location": "Horoscope.shortlist_the_profile_and_send_interest()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/ion-app/ng-component/ion-nav/page-matches[2]/ion-content/div[2]/ion-list/ion-row/ion-grid[3]/div[1]/ion-row[2]/ion-col[1]/button\"}\n  (Session info: chrome\u003d75.0.3770.142)\n  (Driver info: chromedriver\u003d75.0.3770.140 (2d9f97485c7b07dc18a74666574f19176731995c-refs/branch-heads/3770@{#1155}),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 31 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027DESKTOP-2EHDPTI\u0027, ip: \u0027192.168.64.141\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dtrue, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dtrue, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:56864}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d75.0.3770.140 (2d9f97485c7b07dc18a74666574f19176731995c-refs/branch-heads/3770@{#1155}), userDataDir\u003dC:\\Users\\CBSTES~1\\AppData\\Local\\Temp\\scoped_dir6900_1214}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d75.0.3770.142, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 1b1076b31fd9444b4fd26a1ebd55f691\n*** Element info: {Using\u003dxpath, value\u003d/html/body/ion-app/ng-component/ion-nav/page-matches[2]/ion-content/div[2]/ion-list/ion-row/ion-grid[3]/div[1]/ion-row[2]/ion-col[1]/button}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy13.click(Unknown Source)\r\n\tat cucu.HoroScopeMatches.Base.btnclick(Base.java:69)\r\n\tat StepDefinitions.Horoscope.shortlist_the_profile_and_send_interest(Horoscope.java:361)\r\n\tat ✽.shortlist the profile and send interest(file:Horoscope.feature:70)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Go to recently viewad section and check whether the profile is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Horoscope.go_to_recently_viewad_section_and_check_whether_the_profile_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "goto shortlisted and check whether that profile is displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "Horoscope.goto_shortlisted_and_check_whether_that_profile_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "goto mailbox and check in sendbox whether the request is sent.",
  "keyword": "And "
});
formatter.match({
  "location": "Horoscope.goto_mailbox_and_check_in_sendbox_whether_the_request_is_sent()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Check whether the profiles in HM hroscope percent is more than and equal to 60% profile are only displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Horoscope.check_whether_the_profiles_in_HM_hroscope_percent_is_more_than_and_equal_to_profile_are_only_displayed(Integer)"
});
formatter.result({
  "status": "skipped"
});
});