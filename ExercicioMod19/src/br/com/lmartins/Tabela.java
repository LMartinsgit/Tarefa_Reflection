package br.com.lmartins;

import java.lang.annotation.*;

	@Documented
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.TYPE)

public @interface Tabela {
		String nome();

	
}
	