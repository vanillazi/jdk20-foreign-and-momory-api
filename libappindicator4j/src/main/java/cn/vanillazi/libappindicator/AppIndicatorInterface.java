// Generated by jextract

package cn.vanillazi.libappindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class AppIndicatorInterface  {

    public static final OfByte C_CHAR = Constants$root.C_CHAR$LAYOUT;
    public static final OfShort C_SHORT = Constants$root.C_SHORT$LAYOUT;
    public static final OfInt C_INT = Constants$root.C_INT$LAYOUT;
    public static final OfLong C_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static final OfLong C_LONG_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static final OfFloat C_FLOAT = Constants$root.C_FLOAT$LAYOUT;
    public static final OfDouble C_DOUBLE = Constants$root.C_DOUBLE$LAYOUT;
    public static final OfAddress C_POINTER = Constants$root.C_POINTER$LAYOUT;
    /**
     * {@snippet :
     * typedef char gchar;
     * }
     */
    public static final OfByte gchar = Constants$root.C_CHAR$LAYOUT;
    public static MethodHandle g_signal_connect_data$MH() {
        return RuntimeHelper.requireNonNull(constants$0.g_signal_connect_data$MH,"g_signal_connect_data");
    }
    /**
     * {@snippet :
     * gulong g_signal_connect_data(gpointer instance, const gchar* detailed_signal, GCallback c_handler, gpointer data, GClosureNotify destroy_data, GConnectFlags connect_flags);
     * }
     */
    public static long g_signal_connect_data(MemorySegment instance, MemorySegment detailed_signal, MemorySegment c_handler, MemorySegment data, MemorySegment destroy_data, int connect_flags) {
        var mh$ = g_signal_connect_data$MH();
        try {
            return (long)mh$.invokeExact(instance, detailed_signal, c_handler, data, destroy_data, connect_flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_widget_show$MH() {
        return RuntimeHelper.requireNonNull(constants$0.gtk_widget_show$MH,"gtk_widget_show");
    }
    /**
     * {@snippet :
     * void gtk_widget_show(GtkWidget* widget);
     * }
     */
    public static void gtk_widget_show(MemorySegment widget) {
        var mh$ = gtk_widget_show$MH();
        try {
            mh$.invokeExact(widget);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_widget_show_all$MH() {
        return RuntimeHelper.requireNonNull(constants$0.gtk_widget_show_all$MH,"gtk_widget_show_all");
    }
    /**
     * {@snippet :
     * void gtk_widget_show_all(GtkWidget* widget);
     * }
     */
    public static void gtk_widget_show_all(MemorySegment widget) {
        var mh$ = gtk_widget_show_all$MH();
        try {
            mh$.invokeExact(widget);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_menu_shell_append$MH() {
        return RuntimeHelper.requireNonNull(constants$0.gtk_menu_shell_append$MH,"gtk_menu_shell_append");
    }
    /**
     * {@snippet :
     * void gtk_menu_shell_append(GtkMenuShell* menu_shell, GtkWidget* child);
     * }
     */
    public static void gtk_menu_shell_append(MemorySegment menu_shell, MemorySegment child) {
        var mh$ = gtk_menu_shell_append$MH();
        try {
            mh$.invokeExact(menu_shell, child);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_menu_shell_prepend$MH() {
        return RuntimeHelper.requireNonNull(constants$0.gtk_menu_shell_prepend$MH,"gtk_menu_shell_prepend");
    }
    /**
     * {@snippet :
     * void gtk_menu_shell_prepend(GtkMenuShell* menu_shell, GtkWidget* child);
     * }
     */
    public static void gtk_menu_shell_prepend(MemorySegment menu_shell, MemorySegment child) {
        var mh$ = gtk_menu_shell_prepend$MH();
        try {
            mh$.invokeExact(menu_shell, child);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_menu_shell_insert$MH() {
        return RuntimeHelper.requireNonNull(constants$0.gtk_menu_shell_insert$MH,"gtk_menu_shell_insert");
    }
    /**
     * {@snippet :
     * void gtk_menu_shell_insert(GtkMenuShell* menu_shell, GtkWidget* child, gint position);
     * }
     */
    public static void gtk_menu_shell_insert(MemorySegment menu_shell, MemorySegment child, int position) {
        var mh$ = gtk_menu_shell_insert$MH();
        try {
            mh$.invokeExact(menu_shell, child, position);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_menu_new$MH() {
        return RuntimeHelper.requireNonNull(constants$1.gtk_menu_new$MH,"gtk_menu_new");
    }
    /**
     * {@snippet :
     * GtkWidget* gtk_menu_new();
     * }
     */
    public static MemorySegment gtk_menu_new() {
        var mh$ = gtk_menu_new$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_menu_item_new_with_label$MH() {
        return RuntimeHelper.requireNonNull(constants$1.gtk_menu_item_new_with_label$MH,"gtk_menu_item_new_with_label");
    }
    /**
     * {@snippet :
     * GtkWidget* gtk_menu_item_new_with_label(const gchar* label);
     * }
     */
    public static MemorySegment gtk_menu_item_new_with_label(MemorySegment label) {
        var mh$ = gtk_menu_item_new_with_label$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(label);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_menu_item_set_label$MH() {
        return RuntimeHelper.requireNonNull(constants$1.gtk_menu_item_set_label$MH,"gtk_menu_item_set_label");
    }
    /**
     * {@snippet :
     * void gtk_menu_item_set_label(GtkMenuItem* menu_item, const gchar* label);
     * }
     */
    public static void gtk_menu_item_set_label(MemorySegment menu_item, MemorySegment label) {
        var mh$ = gtk_menu_item_set_label$MH();
        try {
            mh$.invokeExact(menu_item, label);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_menu_item_get_label$MH() {
        return RuntimeHelper.requireNonNull(constants$1.gtk_menu_item_get_label$MH,"gtk_menu_item_get_label");
    }
    /**
     * {@snippet :
     * const gchar* gtk_menu_item_get_label(GtkMenuItem* menu_item);
     * }
     */
    public static MemorySegment gtk_menu_item_get_label(MemorySegment menu_item) {
        var mh$ = gtk_menu_item_get_label$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(menu_item);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_init$MH() {
        return RuntimeHelper.requireNonNull(constants$1.gtk_init$MH,"gtk_init");
    }
    /**
     * {@snippet :
     * void gtk_init(int* argc, char*** argv);
     * }
     */
    public static void gtk_init(MemorySegment argc, MemorySegment argv) {
        var mh$ = gtk_init$MH();
        try {
            mh$.invokeExact(argc, argv);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_init_check$MH() {
        return RuntimeHelper.requireNonNull(constants$1.gtk_init_check$MH,"gtk_init_check");
    }
    /**
     * {@snippet :
     * gboolean gtk_init_check(int* argc, char*** argv);
     * }
     */
    public static int gtk_init_check(MemorySegment argc, MemorySegment argv) {
        var mh$ = gtk_init_check$MH();
        try {
            return (int)mh$.invokeExact(argc, argv);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_main$MH() {
        return RuntimeHelper.requireNonNull(constants$2.gtk_main$MH,"gtk_main");
    }
    /**
     * {@snippet :
     * void gtk_main();
     * }
     */
    public static void gtk_main() {
        var mh$ = gtk_main$MH();
        try {
            mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    /**
     * {@snippet :
     * enum .APP_INDICATOR_CATEGORY_APPLICATION_STATUS = 0;
     * }
     */
    public static int APP_INDICATOR_CATEGORY_APPLICATION_STATUS() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * enum .APP_INDICATOR_CATEGORY_COMMUNICATIONS = 1;
     * }
     */
    public static int APP_INDICATOR_CATEGORY_COMMUNICATIONS() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * enum .APP_INDICATOR_CATEGORY_SYSTEM_SERVICES = 2;
     * }
     */
    public static int APP_INDICATOR_CATEGORY_SYSTEM_SERVICES() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * enum .APP_INDICATOR_CATEGORY_HARDWARE = 3;
     * }
     */
    public static int APP_INDICATOR_CATEGORY_HARDWARE() {
        return (int)3L;
    }
    /**
     * {@snippet :
     * enum .APP_INDICATOR_CATEGORY_OTHER = 4;
     * }
     */
    public static int APP_INDICATOR_CATEGORY_OTHER() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * enum .APP_INDICATOR_STATUS_PASSIVE = 0;
     * }
     */
    public static int APP_INDICATOR_STATUS_PASSIVE() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * enum .APP_INDICATOR_STATUS_ACTIVE = 1;
     * }
     */
    public static int APP_INDICATOR_STATUS_ACTIVE() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * enum .APP_INDICATOR_STATUS_ATTENTION = 2;
     * }
     */
    public static int APP_INDICATOR_STATUS_ATTENTION() {
        return (int)2L;
    }
    public static MethodHandle app_indicator_get_type$MH() {
        return RuntimeHelper.requireNonNull(constants$2.app_indicator_get_type$MH,"app_indicator_get_type");
    }
    /**
     * {@snippet :
     * GType app_indicator_get_type();
     * }
     */
    public static long app_indicator_get_type() {
        var mh$ = app_indicator_get_type$MH();
        try {
            return (long)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_new$MH() {
        return RuntimeHelper.requireNonNull(constants$2.app_indicator_new$MH,"app_indicator_new");
    }
    /**
     * {@snippet :
     * AppIndicator* app_indicator_new(const gchar* id, const gchar* icon_name, AppIndicatorCategory category);
     * }
     */
    public static MemorySegment app_indicator_new(MemorySegment id, MemorySegment icon_name, int category) {
        var mh$ = app_indicator_new$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(id, icon_name, category);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_new_with_path$MH() {
        return RuntimeHelper.requireNonNull(constants$2.app_indicator_new_with_path$MH,"app_indicator_new_with_path");
    }
    /**
     * {@snippet :
     * AppIndicator* app_indicator_new_with_path(const gchar* id, const gchar* icon_name, AppIndicatorCategory category, const gchar* icon_theme_path);
     * }
     */
    public static MemorySegment app_indicator_new_with_path(MemorySegment id, MemorySegment icon_name, int category, MemorySegment icon_theme_path) {
        var mh$ = app_indicator_new_with_path$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(id, icon_name, category, icon_theme_path);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_status$MH() {
        return RuntimeHelper.requireNonNull(constants$2.app_indicator_set_status$MH,"app_indicator_set_status");
    }
    /**
     * {@snippet :
     * void app_indicator_set_status(AppIndicator* self, AppIndicatorStatus status);
     * }
     */
    public static void app_indicator_set_status(MemorySegment self, int status) {
        var mh$ = app_indicator_set_status$MH();
        try {
            mh$.invokeExact(self, status);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_attention_icon$MH() {
        return RuntimeHelper.requireNonNull(constants$2.app_indicator_set_attention_icon$MH,"app_indicator_set_attention_icon");
    }
    /**
     * {@snippet :
     * void app_indicator_set_attention_icon(AppIndicator* self, const gchar* icon_name);
     * }
     */
    public static void app_indicator_set_attention_icon(MemorySegment self, MemorySegment icon_name) {
        var mh$ = app_indicator_set_attention_icon$MH();
        try {
            mh$.invokeExact(self, icon_name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_attention_icon_full$MH() {
        return RuntimeHelper.requireNonNull(constants$3.app_indicator_set_attention_icon_full$MH,"app_indicator_set_attention_icon_full");
    }
    /**
     * {@snippet :
     * void app_indicator_set_attention_icon_full(AppIndicator* self, const gchar* icon_name, const gchar* icon_desc);
     * }
     */
    public static void app_indicator_set_attention_icon_full(MemorySegment self, MemorySegment icon_name, MemorySegment icon_desc) {
        var mh$ = app_indicator_set_attention_icon_full$MH();
        try {
            mh$.invokeExact(self, icon_name, icon_desc);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_menu$MH() {
        return RuntimeHelper.requireNonNull(constants$3.app_indicator_set_menu$MH,"app_indicator_set_menu");
    }
    /**
     * {@snippet :
     * void app_indicator_set_menu(AppIndicator* self, GtkMenu* menu);
     * }
     */
    public static void app_indicator_set_menu(MemorySegment self, MemorySegment menu) {
        var mh$ = app_indicator_set_menu$MH();
        try {
            mh$.invokeExact(self, menu);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_icon$MH() {
        return RuntimeHelper.requireNonNull(constants$3.app_indicator_set_icon$MH,"app_indicator_set_icon");
    }
    /**
     * {@snippet :
     * void app_indicator_set_icon(AppIndicator* self, const gchar* icon_name);
     * }
     */
    public static void app_indicator_set_icon(MemorySegment self, MemorySegment icon_name) {
        var mh$ = app_indicator_set_icon$MH();
        try {
            mh$.invokeExact(self, icon_name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_icon_full$MH() {
        return RuntimeHelper.requireNonNull(constants$3.app_indicator_set_icon_full$MH,"app_indicator_set_icon_full");
    }
    /**
     * {@snippet :
     * void app_indicator_set_icon_full(AppIndicator* self, const gchar* icon_name, const gchar* icon_desc);
     * }
     */
    public static void app_indicator_set_icon_full(MemorySegment self, MemorySegment icon_name, MemorySegment icon_desc) {
        var mh$ = app_indicator_set_icon_full$MH();
        try {
            mh$.invokeExact(self, icon_name, icon_desc);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_label$MH() {
        return RuntimeHelper.requireNonNull(constants$3.app_indicator_set_label$MH,"app_indicator_set_label");
    }
    /**
     * {@snippet :
     * void app_indicator_set_label(AppIndicator* self, const gchar* label, const gchar* guide);
     * }
     */
    public static void app_indicator_set_label(MemorySegment self, MemorySegment label, MemorySegment guide) {
        var mh$ = app_indicator_set_label$MH();
        try {
            mh$.invokeExact(self, label, guide);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_icon_theme_path$MH() {
        return RuntimeHelper.requireNonNull(constants$3.app_indicator_set_icon_theme_path$MH,"app_indicator_set_icon_theme_path");
    }
    /**
     * {@snippet :
     * void app_indicator_set_icon_theme_path(AppIndicator* self, const gchar* icon_theme_path);
     * }
     */
    public static void app_indicator_set_icon_theme_path(MemorySegment self, MemorySegment icon_theme_path) {
        var mh$ = app_indicator_set_icon_theme_path$MH();
        try {
            mh$.invokeExact(self, icon_theme_path);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_ordering_index$MH() {
        return RuntimeHelper.requireNonNull(constants$4.app_indicator_set_ordering_index$MH,"app_indicator_set_ordering_index");
    }
    /**
     * {@snippet :
     * void app_indicator_set_ordering_index(AppIndicator* self, guint32 ordering_index);
     * }
     */
    public static void app_indicator_set_ordering_index(MemorySegment self, int ordering_index) {
        var mh$ = app_indicator_set_ordering_index$MH();
        try {
            mh$.invokeExact(self, ordering_index);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_secondary_activate_target$MH() {
        return RuntimeHelper.requireNonNull(constants$4.app_indicator_set_secondary_activate_target$MH,"app_indicator_set_secondary_activate_target");
    }
    /**
     * {@snippet :
     * void app_indicator_set_secondary_activate_target(AppIndicator* self, GtkWidget* menuitem);
     * }
     */
    public static void app_indicator_set_secondary_activate_target(MemorySegment self, MemorySegment menuitem) {
        var mh$ = app_indicator_set_secondary_activate_target$MH();
        try {
            mh$.invokeExact(self, menuitem);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_title$MH() {
        return RuntimeHelper.requireNonNull(constants$4.app_indicator_set_title$MH,"app_indicator_set_title");
    }
    /**
     * {@snippet :
     * void app_indicator_set_title(AppIndicator* self, const gchar* title);
     * }
     */
    public static void app_indicator_set_title(MemorySegment self, MemorySegment title) {
        var mh$ = app_indicator_set_title$MH();
        try {
            mh$.invokeExact(self, title);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_id$MH() {
        return RuntimeHelper.requireNonNull(constants$4.app_indicator_get_id$MH,"app_indicator_get_id");
    }
    /**
     * {@snippet :
     * const gchar* app_indicator_get_id(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_id(MemorySegment self) {
        var mh$ = app_indicator_get_id$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_category$MH() {
        return RuntimeHelper.requireNonNull(constants$4.app_indicator_get_category$MH,"app_indicator_get_category");
    }
    /**
     * {@snippet :
     * AppIndicatorCategory app_indicator_get_category(AppIndicator* self);
     * }
     */
    public static int app_indicator_get_category(MemorySegment self) {
        var mh$ = app_indicator_get_category$MH();
        try {
            return (int)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_status$MH() {
        return RuntimeHelper.requireNonNull(constants$4.app_indicator_get_status$MH,"app_indicator_get_status");
    }
    /**
     * {@snippet :
     * AppIndicatorStatus app_indicator_get_status(AppIndicator* self);
     * }
     */
    public static int app_indicator_get_status(MemorySegment self) {
        var mh$ = app_indicator_get_status$MH();
        try {
            return (int)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_icon$MH() {
        return RuntimeHelper.requireNonNull(constants$5.app_indicator_get_icon$MH,"app_indicator_get_icon");
    }
    /**
     * {@snippet :
     * const gchar* app_indicator_get_icon(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_icon(MemorySegment self) {
        var mh$ = app_indicator_get_icon$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_icon_desc$MH() {
        return RuntimeHelper.requireNonNull(constants$5.app_indicator_get_icon_desc$MH,"app_indicator_get_icon_desc");
    }
    /**
     * {@snippet :
     * const gchar* app_indicator_get_icon_desc(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_icon_desc(MemorySegment self) {
        var mh$ = app_indicator_get_icon_desc$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_icon_theme_path$MH() {
        return RuntimeHelper.requireNonNull(constants$5.app_indicator_get_icon_theme_path$MH,"app_indicator_get_icon_theme_path");
    }
    /**
     * {@snippet :
     * const gchar* app_indicator_get_icon_theme_path(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_icon_theme_path(MemorySegment self) {
        var mh$ = app_indicator_get_icon_theme_path$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_attention_icon$MH() {
        return RuntimeHelper.requireNonNull(constants$5.app_indicator_get_attention_icon$MH,"app_indicator_get_attention_icon");
    }
    /**
     * {@snippet :
     * const gchar* app_indicator_get_attention_icon(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_attention_icon(MemorySegment self) {
        var mh$ = app_indicator_get_attention_icon$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_attention_icon_desc$MH() {
        return RuntimeHelper.requireNonNull(constants$5.app_indicator_get_attention_icon_desc$MH,"app_indicator_get_attention_icon_desc");
    }
    /**
     * {@snippet :
     * const gchar* app_indicator_get_attention_icon_desc(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_attention_icon_desc(MemorySegment self) {
        var mh$ = app_indicator_get_attention_icon_desc$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_title$MH() {
        return RuntimeHelper.requireNonNull(constants$5.app_indicator_get_title$MH,"app_indicator_get_title");
    }
    /**
     * {@snippet :
     * const gchar* app_indicator_get_title(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_title(MemorySegment self) {
        var mh$ = app_indicator_get_title$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_menu$MH() {
        return RuntimeHelper.requireNonNull(constants$6.app_indicator_get_menu$MH,"app_indicator_get_menu");
    }
    /**
     * {@snippet :
     * GtkMenu* app_indicator_get_menu(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_menu(MemorySegment self) {
        var mh$ = app_indicator_get_menu$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_label$MH() {
        return RuntimeHelper.requireNonNull(constants$6.app_indicator_get_label$MH,"app_indicator_get_label");
    }
    /**
     * {@snippet :
     * const gchar* app_indicator_get_label(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_label(MemorySegment self) {
        var mh$ = app_indicator_get_label$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_label_guide$MH() {
        return RuntimeHelper.requireNonNull(constants$6.app_indicator_get_label_guide$MH,"app_indicator_get_label_guide");
    }
    /**
     * {@snippet :
     * const gchar* app_indicator_get_label_guide(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_label_guide(MemorySegment self) {
        var mh$ = app_indicator_get_label_guide$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_ordering_index$MH() {
        return RuntimeHelper.requireNonNull(constants$6.app_indicator_get_ordering_index$MH,"app_indicator_get_ordering_index");
    }
    /**
     * {@snippet :
     * guint32 app_indicator_get_ordering_index(AppIndicator* self);
     * }
     */
    public static int app_indicator_get_ordering_index(MemorySegment self) {
        var mh$ = app_indicator_get_ordering_index$MH();
        try {
            return (int)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_secondary_activate_target$MH() {
        return RuntimeHelper.requireNonNull(constants$6.app_indicator_get_secondary_activate_target$MH,"app_indicator_get_secondary_activate_target");
    }
    /**
     * {@snippet :
     * GtkWidget* app_indicator_get_secondary_activate_target(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_secondary_activate_target(MemorySegment self) {
        var mh$ = app_indicator_get_secondary_activate_target$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_build_menu_from_desktop$MH() {
        return RuntimeHelper.requireNonNull(constants$6.app_indicator_build_menu_from_desktop$MH,"app_indicator_build_menu_from_desktop");
    }
    /**
     * {@snippet :
     * void app_indicator_build_menu_from_desktop(AppIndicator* self, const gchar* desktop_file, const gchar* desktop_profile);
     * }
     */
    public static void app_indicator_build_menu_from_desktop(MemorySegment self, MemorySegment desktop_file, MemorySegment desktop_profile) {
        var mh$ = app_indicator_build_menu_from_desktop$MH();
        try {
            mh$.invokeExact(self, desktop_file, desktop_profile);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}


