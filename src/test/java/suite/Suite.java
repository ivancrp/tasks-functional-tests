package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import br.com.bb.contratos.steps.HomeTest;
import br.com.bb.contratos.steps.PesquisarFornecedorTest;
import br.com.bb.contratos.tasks.prod.HealthCheckIT;

@RunWith(org.junit.runners.Suite.class)
@SuiteClasses({HomeTest.class, HealthCheckIT.class,PesquisarFornecedorTest.class})

public class Suite {

}
