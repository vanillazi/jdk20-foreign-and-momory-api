// Generated by jextract

package cn.vanillazi.libappindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$6 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$6() {}
    static final FunctionDescriptor app_indicator_get_label$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle app_indicator_get_label$MH = RuntimeHelper.downcallHandle(
        "app_indicator_get_label",
        constants$6.app_indicator_get_label$FUNC
    );
    static final FunctionDescriptor app_indicator_get_label_guide$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle app_indicator_get_label_guide$MH = RuntimeHelper.downcallHandle(
        "app_indicator_get_label_guide",
        constants$6.app_indicator_get_label_guide$FUNC
    );
    static final FunctionDescriptor app_indicator_get_ordering_index$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle app_indicator_get_ordering_index$MH = RuntimeHelper.downcallHandle(
        "app_indicator_get_ordering_index",
        constants$6.app_indicator_get_ordering_index$FUNC
    );
    static final FunctionDescriptor app_indicator_get_secondary_activate_target$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle app_indicator_get_secondary_activate_target$MH = RuntimeHelper.downcallHandle(
        "app_indicator_get_secondary_activate_target",
        constants$6.app_indicator_get_secondary_activate_target$FUNC
    );
    static final FunctionDescriptor app_indicator_build_menu_from_desktop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle app_indicator_build_menu_from_desktop$MH = RuntimeHelper.downcallHandle(
        "app_indicator_build_menu_from_desktop",
        constants$6.app_indicator_build_menu_from_desktop$FUNC
    );
}


