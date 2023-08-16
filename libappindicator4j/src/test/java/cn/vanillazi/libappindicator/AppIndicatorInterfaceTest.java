package cn.vanillazi.libappindicator;

import org.junit.jupiter.api.Test;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentScope;

import static org.junit.jupiter.api.Assertions.*;

class AppIndicatorInterfaceTest {

    @Test
    public void test(){
        System.load("/usr/lib/x86_64-linux-gnu/libappindicator.so");
        var type=AppIndicatorInterface.app_indicator_get_type();
        System.out.println(type);

        MemorySegment id = MemorySegment.allocateNative(AppIndicatorInterface.gchar.byteSize()*10, SegmentScope.global());

        id.setUtf8String(0,"test");
        MemorySegment iconName = MemorySegment.allocateNative(AppIndicatorInterface.gchar.byteSize()*10, SegmentScope.global());;
        iconName.setUtf8String(0,"test.png");
        var category=AppIndicatorInterface.APP_INDICATOR_CATEGORY_APPLICATION_STATUS();
        var instance=AppIndicatorInterface.app_indicator_new(id,iconName,category);
    }

}