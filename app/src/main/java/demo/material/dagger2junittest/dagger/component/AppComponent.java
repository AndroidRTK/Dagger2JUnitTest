package demo.material.dagger2junittest.dagger.component;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import demo.material.dagger2junittest.RTKApplication;
import demo.material.dagger2junittest.dagger.binder.ActivityBinder;
import demo.material.dagger2junittest.dagger.module.AppModule;

@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivityBinder.class
})
@Singleton
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(RTKApplication app);
}
