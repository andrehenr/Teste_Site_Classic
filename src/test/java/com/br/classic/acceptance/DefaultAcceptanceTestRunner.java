package com.br.classic.acceptance;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.openbdt.cucumber.CucumberWithOpenBdt;

@RunWith(CucumberWithOpenBdt.class)
@CucumberOptions(features = {"src/test/resources/bdd/features"}, glue = {"com.br.classic.steps.definition"})
public class DefaultAcceptanceTestRunner {}
