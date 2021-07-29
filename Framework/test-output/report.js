$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/DatomsLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Navigate and test the Login page",
  "description": "",
  "id": "navigate-and-test-the-login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Datoms"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Launch the Browser and navigate to the Datoms Login page",
  "description": "",
  "id": "navigate-and-test-the-login-page;launch-the-browser-and-navigate-to-the-datoms-login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@DatomsTest1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User launches the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User navigates to \"\u003cURL\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should be in the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User closes the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "navigate-and-test-the-login-page;launch-the-browser-and-navigate-to-the-datoms-login-page;",
  "rows": [
    {
      "cells": [
        "URL"
      ],
      "line": 12,
      "id": "navigate-and-test-the-login-page;launch-the-browser-and-navigate-to-the-datoms-login-page;;1"
    },
    {
      "cells": [
        "https://accounts.datoms.io/login"
      ],
      "line": 13,
      "id": "navigate-and-test-the-login-page;launch-the-browser-and-navigate-to-the-datoms-login-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Launch the Browser and navigate to the Datoms Login page",
  "description": "",
  "id": "navigate-and-test-the-login-page;launch-the-browser-and-navigate-to-the-datoms-login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@DatomsTest1"
    },
    {
      "line": 1,
      "name": "@Datoms"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User launches the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User navigates to \"https://accounts.datoms.io/login\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should be in the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "DatomsSteps.user_launches_the_chrome_browser()"
});
formatter.result({
  "duration": 2742645400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://accounts.datoms.io/login",
      "offset": 19
    }
  ],
  "location": "DatomsSteps.user_navigates_to(String)"
});
formatter.result({
  "duration": 626747400,
  "status": "passed"
});
formatter.match({
  "location": "DatomsSteps.user_should_be_in_the_login_page()"
});
formatter.result({
  "duration": 67003900,
  "status": "passed"
});
formatter.match({
  "location": "DatomsSteps.user_closes_the_browser()"
});
formatter.result({
  "duration": 62045700,
  "status": "passed"
});
formatter.after({
  "duration": 659360700,
  "status": "passed"
});
});