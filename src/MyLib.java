import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;

@Platform(include = "library.h")
@Namespace("my_lib")
class MyLib {

    static class MyClass extends Pointer {
        static {
            Loader.load();
        }

        MyClass() {
            allocate();
        }

        private native void allocate();

        native int get_property();

        native void set_property(int property);

        native int property();

        native void property(int property);
    }

    public static void main(String[] args) {
        MyClass n = new MyClass();
        n.set_property(42);
        System.out.println(n.property());
    }
}
