package doomed.dumbs.kotlinconcept.interfaces

import javax.swing.text.Position

class InterfaceDescription {
    /**
     * AS per the Kotlin interface document
     * ------------------------------------
     * Interfaces in Kotlin can contain declarations of abstract methods,
     * as well as method implementations. What makes them different from abstract classes
     * is that interfaces cannot store state. They can have properties, but these need to be
     * abstract or provide accessor implementations.
     * .....................................................................................
     */

    interface MyInterface {
        fun bar()
        fun foo() {
            //optional body
        }
    }

    /**
     * Implementing interfaces
     * -----------------------
     * A class or object can implement one or more interfaces
     * ......................................................
     */
    class child : MyInterface {
        override fun bar() {
            //body
        }
    }

    /**
     * Properties in Interface
     * -----------------------
     * Yes indeed you can declare a property in the interface.
     * Declared properties in interface can either be abstract
     * or provide implementations for accessors.
     * Properties declared in interfaces can't have backing field
     * and therefore accessors declared in interfaces can't reference them.
     * ....................................................................
     */
    // Define an interface with a property that has a custom accessor implementation
    interface MyInterfaces {
        // Abstract property - must be implemented by any class that implements this interface
        val prop: Int //abstract

        // A property with a custom accessor, but without a backing field
        val propertywithImplementation: String
            get() = "foo"

        fun foo() {
            print(prop)
        }

        /**
         * Properties declared in interfaces can't have backing field and therefore
         * accessors declared in interfaces can't reference them.
         * .....................................................
         * the following line throws an error
         * with the error line
         * -----------------------------------------------------
         * Property initializers are not allowed in interfaces
         * -----------------------------------------------------
         * this means that {you cannot  store  state directly in an interface}
         * but instead you need to provide accessors method for the
         * properties, but these methods must either be abstract or provide a
         * default implementation that does not rely on a backing field.
         */
        //val backingField :Int = 29
        val backingFild: Int
            get() = 29
    }

    class childs : MyInterfaces {
        override val prop: Int = 29
    }

    /**
     * Interfaces Inheritance
     * ----------------------
     * An interface can derive from other interfaces,
     * meaning it can both
     * +++++++++++++++++++++++++++++++++++++++++
     * provide implementations for their members
     * +++++++++++++++++++++++++++++++++++++++++
     * as well declare new functions and methods
     * -----------------------------------------
     * quite naturally the implementing class just need to define the missing
     * implementations
     */
    interface Named {
        val name: String
    }

    interface Person : Named {
        val firstName: String
        val secondName: String

        override val name: String
            get() = "$firstName $secondName"
    }

    data class Employee(
        // implementing 'name' is not required
        override val firstName: String,
        override val secondName: String,
        val position: String
    ) : Person

    class EmployeeDetail{
        //You can access the name property of Person class by the employee class
        //without explicitly adding it to the Employee data class
        val name = Employee("Abhishek","Pathak","Software developer").name
    }
    /**
     * Resolving overriding conflicts
     * ------------------------------
     * When you declare many types in your superlist ,
     * you may inherit more than one implementation of the method.
     */
    interface A{
        fun foo(){
            print("A")
        }
        fun bar()
    }
    interface B{
        fun foo(){
            print("B")
        }
        fun bar(){
            print("bar")
        }
    }
    class C:A{
        override fun bar() {
            print("bar")
        }
    }
    class D:A,B{
        override fun foo() {
            super<A>.foo()
            super<B>.foo()
        }

        override fun bar() {
            super<B>.bar()
        }
    }
    /**
     * Interfaces A and B both declare functions foo() and bar()
     * Both of them implement foo()
     * but only B implement bar()
     * {bar() is not marked as abstract in the interface A as it is default
     * for interfaces if the method has no body}
     * `````````````````````````````````````````
     * Now if you derive a concrete class from interface A,
     * then you have to override bar() and
     * provide an implementation.
     * ||||||||||||||||||||||||||||||||||||||||||||||||||||
     * However if you derive class D with A, B
     * you need to implement all the methods that you have
     * inherited from the multiple interfaces,
     * and you need to specify how exactly class D should implement them
     * This rule applies both to methods for which you have inherited
     * a single implementation (bar())  and to those for which you have inherited
     * multiple implementation (foo())
     */

}