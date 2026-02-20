package poc;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.core.options.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // carpeta donde están tus .feature

@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME,
        value = "io.cucumber.core.plugin.SerenityReporterParallel,pretty,timeline:build/test-results/timeline"
)

@ConfigurationParameter(
        key = FILTER_TAGS_PROPERTY_NAME,
        value = "@android" // puedes cambiarlo por el tag que quieras ejecutar
)


public class CucumberTestSuite {
    // No necesitas métodos aquí, JUnit Platform se encarga de ejecutar los features

}
