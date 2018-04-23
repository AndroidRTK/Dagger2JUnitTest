package demo.material.dagger2junittest.dagger.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Scope;


@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface RegistrationScope {
}