// Generated by jextract

package cn.vanillazi.libappindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$0 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$0() {}
    static final FunctionDescriptor g_signal_connect_data$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_connect_data$MH = RuntimeHelper.downcallHandle(
        "g_signal_connect_data",
        constants$0.g_signal_connect_data$FUNC
    );
    static final FunctionDescriptor gtk_widget_show$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_show$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_show",
        constants$0.gtk_widget_show$FUNC
    );
    static final FunctionDescriptor gtk_widget_show_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_show_all$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_show_all",
        constants$0.gtk_widget_show_all$FUNC
    );
    static final FunctionDescriptor gtk_menu_shell_append$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_shell_append$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_shell_append",
        constants$0.gtk_menu_shell_append$FUNC
    );
    static final FunctionDescriptor gtk_menu_shell_prepend$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_shell_prepend$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_shell_prepend",
        constants$0.gtk_menu_shell_prepend$FUNC
    );
    static final FunctionDescriptor gtk_menu_shell_insert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_menu_shell_insert$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_shell_insert",
        constants$0.gtk_menu_shell_insert$FUNC
    );
}


