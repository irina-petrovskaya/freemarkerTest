package org.test.fmtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * created by jetbrains
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FreemarkerTestApplication.class)
@WebAppConfiguration
public class FreemarkerTestApplicationTests {

	@Test
	public void contextLoads() {
	}

}
