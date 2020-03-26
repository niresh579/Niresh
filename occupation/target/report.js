$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/CBS%20Testing/workspace/Niresh/occupation/feature/occupation.feature");
formatter.feature({
  "name": "Title of your featureTo verify the occupation field in pwa",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
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
  "location": "OccupationVerify.user_in_the_login_page()"
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
  "location": "OccupationVerify.the_user_enter_the_username(DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[2]/ion-col/ion-item/div[1]/div/ion-input/input\"}\n  (Session info: chrome\u003d76.0.3809.100)\n  (Driver info: chromedriver\u003d75.0.3770.140 (2d9f97485c7b07dc18a74666574f19176731995c-refs/branch-heads/3770@{#1155}),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 31 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027DESKTOP-2EHDPTI\u0027, ip: \u0027192.168.64.141\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dtrue, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dtrue, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:65099}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d75.0.3770.140 (2d9f97485c7b07dc18a74666574f19176731995c-refs/branch-heads/3770@{#1155}), userDataDir\u003dC:\\Users\\CBSTES~1\\AppData\\Local\\Temp\\scoped_dir8924_204}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d76.0.3809.100, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 34af5f029b013471f9f3cae3487aef47\n*** Element info: {Using\u003dxpath, value\u003d/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[2]/ion-col/ion-item/div[1]/div/ion-input/input}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy13.click(Unknown Source)\r\n\tat cucu.occupation.Base.btnclick(Base.java:69)\r\n\tat StepDefinitions.OccupationVerify.the_user_enter_the_username(OccupationVerify.java:51)\r\n\tat ✽.The user enter the username(file:/C:/Users/CBS%20Testing/workspace/Niresh/occupation/feature/occupation.feature:9)\r\n",
  "status": "failed"
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
  "location": "OccupationVerify.the_user_enter_the_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "OccupationVerify.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "menu and edit PI",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "click the menu in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "OccupationVerify.click_the_menu_in_home_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/ion-app/ng-component/ion-nav/page-matches/ion-footer/div/header/div/ion-navbar/div[2]/ion-row/ion-col[5]\"}\n  (Session info: chrome\u003d76.0.3809.100)\n  (Driver info: chromedriver\u003d75.0.3770.140 (2d9f97485c7b07dc18a74666574f19176731995c-refs/branch-heads/3770@{#1155}),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 29 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027DESKTOP-2EHDPTI\u0027, ip: \u0027192.168.64.141\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dtrue, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dtrue, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:65099}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d75.0.3770.140 (2d9f97485c7b07dc18a74666574f19176731995c-refs/branch-heads/3770@{#1155}), userDataDir\u003dC:\\Users\\CBSTES~1\\AppData\\Local\\Temp\\scoped_dir8924_204}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d76.0.3809.100, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 34af5f029b013471f9f3cae3487aef47\n*** Element info: {Using\u003dxpath, value\u003d/html/body/ion-app/ng-component/ion-nav/page-matches/ion-footer/div/header/div/ion-navbar/div[2]/ion-row/ion-col[5]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy13.click(Unknown Source)\r\n\tat cucu.occupation.Base.btnclick(Base.java:69)\r\n\tat StepDefinitions.OccupationVerify.click_the_menu_in_home_page(OccupationVerify.java:100)\r\n\tat ✽.click the menu in home page(file:/C:/Users/CBS%20Testing/workspace/Niresh/occupation/feature/occupation.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Go to edit PI and click it",
  "keyword": "When "
});
formatter.match({
  "location": "OccupationVerify.go_to_edit_PI_and_click_it()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click the professional Information in edit PI.",
  "keyword": "Then "
});
formatter.match({
  "location": "OccupationVerify.click_the_professional_Information_in_edit_PI()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Go to occupation field",
  "keyword": "And "
});
formatter.match({
  "location": "OccupationVerify.go_to_occupation_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify all the list of occupation with existing criteria",
  "keyword": "Then "
});
formatter.match({
  "location": "OccupationVerify.verify_all_the_list_of_occupation_with_existing_criteria()"
});
formatter.result({
  "status": "skipped"
});
});