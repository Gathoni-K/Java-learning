**Enum in Java**
-Is a data type containing a fixed set of constants.
-Is actually a full-blown class.
-It can have:
    1.fields.
    2.constructors.
    3.methods.
    4.interfaces.
    5.logic per constant.

-Provides us with:
    1.type safety.
    2.readability.
    3.compile-time checks.

-Defines a fixed set of object instances;
Syntax of an object instance:
    '

    className objectName = new className();

-The instances may carry data.
-Do not use 'new' with enums.
-Basically, objects exist, but we do not declare them implicitly/do not create them and we can't create more yet we use them like normal objects.
-So why not use them everywhere?
Are powerful but specialised.
-Do not really apply for all problems.
-For enums to be true:
1.all possible values are known at compile time.
2.the set will never change dynamically.
-They trade flexibility for safety.
-THe fields and constructor must live inside the enum, our enum is just like any other class.

**Two types of Enums**

# Enums storing data.
-Used when each constant has attributes.
-Behaviour is motly same.
-MOdelling the properties not actions.
-Each enum constant is an object with fields
    '

    public enum Example1{
        A(value1);
        B(value2);

        private final Type field;

        Example(Type field){
            this.field = field;
        }

        public Type getField(){
            return field;
        }

        public static void main(String[] args){
            System.out.println(enumName.A.getField());
        }
    }
-The method applies to shared methods, private final fields, constructor arguments.

# Enums defining behaviour.
-Used when constant behaves differently.
-Logic depends on the enum value.
-We want to avoid if / switch

    '
    public enum Example{
        A{
            @Override
            public ReturnType method(...) {
                ...
            }
        },
        B{
            @Override
            public ReturnType method(...) {
                ...
            }
        },
        C{
            @Override
            public ReturnType method(...) {
                ...
            }
        };

        public abstract ReturnType method(...);
    }
-The pattern applies when there is the abstract method, no fields required.

# Enum with both state and behaviour.
-Used when each constant has data and custom behaviour.
-Common logic exists but slightly differs.
    '

    public enum Example{
        A(value){
            @Override
            ReturnType method(...) {...}
        },
        B(value){
            @Override
            ReturnType method(...) {...}
        },
        C(value){
            @Override
            ReturnType method(...) {...}
        };

        protected final Type field;

        Example(Type field){
            this.field = field;
        }
        abstract ReturnType method(...);
    }

-So when do I know which pattern to choose?
Ask yourself: "Do these values differ mainly by data or by logic?"
-If data, pattern 1, by logic 2, by both 3.
