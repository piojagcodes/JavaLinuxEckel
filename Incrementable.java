public class Incrementable {

    public static void main(String[] args) {

        StaticTest class_with_iterated_number = new StaticTest();

        System.out.println(class_with_iterated_number.getIterated_number());

        increment();




    }


      static void increment() {
        StaticTest instance_one = new StaticTest();
        int variable = 0;

        variable = instance_one.getIterated_number();

        variable++;

        System.out.println(variable);


    }


}
