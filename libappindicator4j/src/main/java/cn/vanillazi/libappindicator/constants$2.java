// Generated by jextract

package cn.vanillazi.libappindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2() {}
    static final FunctionDescriptor app_indicator_get_category$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle app_indicator_get_category$MH = RuntimeHelper.downcallHandle(
        "app_indicator_get_category",
        constants$2.app_indicator_get_category$FUNC
    );
    static final FunctionDescriptor app_indicator_get_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle app_indicator_get_status$MH = RuntimeHelper.downcallHandle(
        "app_indicator_get_status",
        constants$2.app_indicator_get_status$FUNC
    );
    static final FunctionDescriptor app_indicator_get_icon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle app_indicator_get_icon$MH = RuntimeHelper.downcallHandle(
        "app_indicator_get_icon",
        constants$2.app_indicator_get_icon$FUNC
    );
    static final FunctionDescriptor app_indicator_get_icon_desc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle app_indicator_get_icon_desc$MH = RuntimeHelper.downcallHandle(
        "app_indicator_get_icon_desc",
        constants$2.app_indicator_get_icon_desc$FUNC
    );
    static final FunctionDescriptor app_indicator_get_icon_theme_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle app_indicator_get_icon_theme_path$MH = RuntimeHelper.downcallHandle(
        "app_indicator_get_icon_theme_path",
        constants$2.app_indicator_get_icon_theme_path$FUNC
    );
    static final FunctionDescriptor app_indicator_get_attention_icon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle app_indicator_get_attention_icon$MH = RuntimeHelper.downcallHandle(
        "app_indicator_get_attention_icon",
        constants$2.app_indicator_get_attention_icon$FUNC
    );
}

