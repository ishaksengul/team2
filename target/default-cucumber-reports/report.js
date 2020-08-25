$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/fedai.feature");
formatter.feature({
  "name": "Google search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@fedai"
    }
  ]
});
formatter.scenario({
  "name": "user search iphone on google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fedai"
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
  "status": "passed"
});
formatter.step({
  "name": "user searches for iphone",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GoogleStep.user_searches_for_iphone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the results has iphone",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.GoogleStep.verify_the_results_has_iphone()"
});
formatter.result({
  "status": "passed"
});
});