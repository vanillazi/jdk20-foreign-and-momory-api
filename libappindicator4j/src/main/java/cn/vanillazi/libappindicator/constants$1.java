// Generated by jextract

package cn.vanillazi.libappindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1() {}
    static final FunctionDescriptor gtk_menu_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_menu_new$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_new",
        constants$1.gtk_menu_new$FUNC
    );
    static final FunctionDescriptor gtk_menu_item_new_with_label$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_item_new_with_label$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_item_new_with_label",
        constants$1.gtk_menu_item_new_with_label$FUNC
    );
    static final FunctionDescriptor gtk_menu_item_set_label$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_item_set_label$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_item_set_label",
        constants$1.gtk_menu_item_set_label$FUNC
    );
    static final FunctionDescriptor gtk_menu_item_get_label$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_item_get_label$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_item_get_label",
        constants$1.gtk_menu_item_get_label$FUNC
    );
    static final FunctionDescriptor gtk_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_init$MH = RuntimeHelper.downcallHandle(
        "gtk_init",
        constants$1.gtk_init$FUNC
    );
    static final FunctionDescriptor gtk_init_check$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_init_check$MH = RuntimeHelper.downcallHandle(
        "gtk_init_check",
        constants$1.gtk_init_check$FUNC
    );
}


