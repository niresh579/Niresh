$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Registartion.feature");
formatter.feature({
  "name": "verify the search profile in pwa",
  "description": " Given Verify the search profile",
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
  "location": "SearchProfile.user_in_the_login_page()"
});
