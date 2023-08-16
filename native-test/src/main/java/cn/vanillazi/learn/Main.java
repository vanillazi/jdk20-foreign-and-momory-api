package cn.vanillazi.learn;

import java.io.File;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;

public class Main {
    public static void main(String[] args) throws Throwable {
        System.load(new File("").getAbsolutePath()+"/native/target/debug/libnative.so");
        var linker=Linker.nativeLinker();
        var stdlib=SymbolLookup.loaderLookup();
        var add=linker.downcallHandle(stdlib.find("add").get(),
                FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        var retValue=add.invoke(1,2);
        System.out.println(retValue);
    }
}