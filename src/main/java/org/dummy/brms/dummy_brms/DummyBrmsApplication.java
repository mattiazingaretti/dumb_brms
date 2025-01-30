package org.dummy.brms.dummy_brms;

import org.dummy.brms.dummy_brms.config.EnvInitializer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = "org.dummy.brms.dummy_brms")
public class DummyBrmsApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DummyBrmsApplication.class)
			.initializers(new EnvInitializer())
			.run(args);
	}

}
