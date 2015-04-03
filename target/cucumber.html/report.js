$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sanityTest.feature");
formatter.feature({
  "line": 1,
  "name": "Working with Test WebPage (Bondora)",
  "description": "",
  "id": "working-with-test-webpage-(bondora)",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "login to web site",
  "description": "",
  "id": "working-with-test-webpage-(bondora);login-to-web-site",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "web site login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "logged",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should be redirected to personal page",
  "keyword": "Then "
});
formatter.match({
  "location": "sanityTest.OpenLoginPage()"
});
formatter.result({
  "duration": 1692910707,
  "status": "passed"
});
formatter.match({
  "location": "sanityTest.Submit()"
});
formatter.result({
  "duration": 2169021997,
  "status": "passed"
});
formatter.match({
  "location": "sanityTest.isLoggedCheck()"
});
formatter.result({
  "duration": 52656617,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "check name, surname, acc number and add a new language",
  "description": "",
  "id": "working-with-test-webpage-(bondora);check-name,-surname,-acc-number-and-add-a-new-language",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "logged web page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "name and surname should be the same like in ApplicationSetting file",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "acc number should be the same like in ApplicationSetting file",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "set a filter to country form",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user able to add a new language",
  "keyword": "Then "
});
formatter.match({
  "location": "sanityTest.isContentPresentCheck()"
});
formatter.result({
  "duration": 50529440,
  "status": "passed"
});
formatter.match({
  "location": "sanityTest.nameAndSurnameCheck()"
});
formatter.result({
  "duration": 130057554,
  "status": "passed"
});
formatter.match({
  "location": "sanityTest.accNumCheck()"
});
formatter.result({
  "duration": 90738734,
  "status": "passed"
});
formatter.match({
  "location": "sanityTest.setCounryFilterCheck()"
});
formatter.result({
  "duration": 883897537,
  "status": "passed"
});
formatter.match({
  "location": "sanityTest.addNewLan()"
});
formatter.result({
  "duration": 1915309548,
  "status": "passed"
});
});