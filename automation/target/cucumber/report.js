$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('registration.feature');
formatter.feature({
  "line": 2,
  "name": "Registration form",
  "description": "",
  "id": "registration-form",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@registration"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "1 Registring user with all fields  Blank Characters",
  "description": "",
  "id": "registration-form;1-registring-user-with-all-fields--blank-characters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "open firefox browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "i open the url",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "website loaded",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "page should  display with register header",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click on Submit",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Thank you for registering message is  displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Registration.open_firefox_browser()"
});
formatter.result({
  "duration": 6315658965,
  "status": "passed"
});
formatter.match({
  "location": "Registration.i_open_the_url()"
});
formatter.result({
  "duration": 1324181824,
  "status": "passed"
});
formatter.match({
  "location": "Registration.website_loaded()"
});
formatter.result({
  "duration": 116831341,
  "status": "passed"
});
formatter.match({
  "location": "Registration.click_on_register_link()"
});
formatter.result({
  "duration": 144124766,
  "status": "passed"
});
formatter.match({
  "location": "Registration.page_should_display_with_register_header()"
});
formatter.result({
  "duration": 680304153,
  "status": "passed"
});
formatter.match({
  "location": "Registration.click_on_Submit()"
});
formatter.result({
  "duration": 982458536,
  "status": "passed"
});
formatter.match({
  "location": "Registration.Thank_you_for_registering_message_is_displayed()"
});
formatter.result({
  "duration": 132459173,
  "status": "passed"
});
});