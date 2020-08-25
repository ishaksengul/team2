$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/osman.feature");
formatter.feature({
  "name": "Google search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Osman"
    }
  ]
});
formatter.scenario({
  "name": "user search Mathematik on google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Osman"
    }
  ]
});
formatter.step({
  "name": "user on the google page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.GoogleStep.user_on_the_google_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user searches for Mathematik",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the results has Mathematik",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});