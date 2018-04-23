package demo.material.dagger2junittest.dagger.module;

import android.content.Intent;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    Intent provideIntent(){
        return new Intent();
    }

    @Provides
    String provideHelloWorld(){
        return "Hello World";
    }
}
