package demo.material.dagger2junittest.dagger.binder;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import demo.material.dagger2junittest.MainActivity;

@Module
public abstract class ActivityBinder {

    @ContributesAndroidInjector
    abstract MainActivity bindMainActivity();

}
