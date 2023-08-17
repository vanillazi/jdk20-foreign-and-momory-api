package cn.vanillazi.libappindicator;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.foreign.*;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.menu;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static org.junit.jupiter.api.Assertions.*;

class AppIndicatorInterfaceTest {

    public static void main(String[] args) throws InterruptedException, NoSuchMethodException, IllegalAccessException {
        new AppIndicatorInterfaceTest().test();
        TimeUnit.SECONDS.sleep(1);
    }

    public static void callbackFunction(MemorySegment widget,MemorySegment data){
        System.out.println("click:"+data.getUtf8String(0));
    }

    @Test
    public void test() throws NoSuchMethodException, IllegalAccessException {

        System.load("/snap/gnome-42-2204/120/usr/lib/x86_64-linux-gnu/libayatana-appindicator3.so");
        var type=AppIndicatorInterface.app_indicator_get_type();
        System.out.println(type);

        MemorySegment id = toNative("test");
        AppIndicatorInterface.gtk_init(MemorySegment.NULL,MemorySegment.NULL);
        var result=AppIndicatorInterface.gtk_init_check(MemorySegment.NULL,MemorySegment.NULL);
        System.out.println(result);
        MemorySegment iconName =toNative(new File("").getAbsoluteFile().getAbsolutePath()+"/asset/logo.png");
        var category=AppIndicatorInterface.APP_INDICATOR_CATEGORY_APPLICATION_STATUS();
        var instance=AppIndicatorInterface.app_indicator_new(id,iconName,category);
        AppIndicatorInterface.app_indicator_set_status(instance,AppIndicatorInterface.APP_INDICATOR_STATUS_ACTIVE());
        MemorySegment label=toNative("label");
        MemorySegment guide=toNative("guide");
        AppIndicatorInterface.app_indicator_set_label(instance,label,guide);
        var menu=AppIndicatorInterface.gtk_menu_new();
        var about=AppIndicatorInterface.gtk_menu_item_new_with_label(toNative("About"));
        AppIndicatorInterface.gtk_menu_shell_append(menu,about);
        AppIndicatorInterface.gtk_widget_show(about);
        var mh=MethodHandles.lookup().findStatic(AppIndicatorInterfaceTest.class,"callbackFunction",
                MethodType.methodType(void.class,MemorySegment.class,MemorySegment.class));
        var callback= Linker.nativeLinker().upcallStub(mh, FunctionDescriptor.ofVoid(ADDRESS.asUnbounded(),ADDRESS.asUnbounded()),SegmentScope.auto());
        AppIndicatorInterface.g_signal_connect_data(about,toNative("activate"),callback,toNative("About"),MemorySegment.NULL,0);
        var exit=AppIndicatorInterface.gtk_menu_item_new_with_label(toNative("Exit"));
        AppIndicatorInterface.g_signal_connect_data(exit,toNative("activate"),callback,toNative("Exit"),MemorySegment.NULL,0);

        AppIndicatorInterface.gtk_menu_shell_append(menu,exit);
        AppIndicatorInterface.gtk_widget_show(exit);

        AppIndicatorInterface.gtk_widget_show(menu);
        AppIndicatorInterface.app_indicator_set_menu(instance,menu);
        AppIndicatorInterface.gtk_main();

    }

    public static MemorySegment toNative(String s){
        return SegmentAllocator.nativeAllocator(SegmentScope.global()).allocateUtf8String(s);
    }


}