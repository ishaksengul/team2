$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/mustafa.feature");
formatter.feature({
  "name": "Google search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@muska"
    }
  ]
});
formatter.scenario({
  "name": "user search muska on google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@muska"
    }
  ]
});
formatter.step({
  "name": "user on the google page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.MustafaStep.user_on_the_google_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for muska",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.MustafaStep.user_searches_for_muska()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the results has muska",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.MustafaStep.verify_the_results_has_muska()"
});
formatter.result({
  "status": "passed"
});
});