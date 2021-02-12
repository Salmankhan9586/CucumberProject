$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/browse.feature");
formatter.feature({
  "name": "To validate the website functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To generate the all the shirts name in excel",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should hit the link",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_hit_the_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will move to Mens Fashion",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_will_move_to_Mens_Fashion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will move to Mens Clothing",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_will_move_to_Mens_Clothing()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click Shirts option",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_will_click_Shirts_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will genarate all the product names",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_will_genarate_all_the_product_names()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});