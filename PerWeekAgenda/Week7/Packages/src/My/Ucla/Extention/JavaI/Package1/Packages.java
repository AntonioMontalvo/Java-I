package My.Ucla.Extention.JavaI.Package1;

import My.Ucla.Extention.JavaI.Package2.PackagesNumber2;
import My.Ucla.Extention.JavaI.Package3.ThirdPackage;
import Second.Configuaration.LevelI.Config1;
import Second.Configuration.Configuration2;

import java.lang.module.Configuration;

public class Packages {

    private Packages(boolean verdict){
         Elaborate(verdict);
    }

    private boolean Elaborate(boolean concur){
        System.out.println("DO you concur? -> "+ concur);
        return concur;
    }
    public static void main(String[] args) {
        Packages EntryLevel = new  Packages(true);
        PackagesNumber2 Pack2 = new PackagesNumber2();
        ThirdPackage Pack3 = new ThirdPackage();
        Config1 FirstConfiguration = new Config1();
        Configuration2 SecondConfiguration = new Configuration2();
        Pack2.SayTitle("Hero");
        Pack3.SayName("Foo");
        FirstConfiguration.SayHi("Nice to meet you");
        SecondConfiguration.SayYear(2019);

    }
}
