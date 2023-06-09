#include <string>

namespace my_lib {
    class MyClass {
    public :
        int property;

        const int get_property() {
            return this->property;
        }

        void set_property(int property) {
            this->property = property;
        }
    };
}