public class carMain {
    public static void main(String[] args) {
        carAccess carAcs = new carAccess(5,2000.0,62,"electric");
        carPlan newCar = carAcs.carplan();//this implies -> carPlan newCar = new electricCar(km_pc, BatterySize, charge)
        newCar.startEngine();
        newCar.drive(400);
        //newCar.turbo(); //turbo is a method exclusive to the electricCar class and the parent class has no method that this can override
        //hence, the object newCar, which is of type carPlan, the parent class, will not be able to return the turbo method
        var test = new electricCar(5,2000,62);// the var helps in identifying the datatype of the object.
        test.turbo();//hence, this is equal to electricCar test = new electricCar, thus the turbo is valid.
//        var test2 = carAcs.carplan();// this again will provide an error and will not be able to recognise turbo since it identifies the datatype
//        test2.turbo();//of the instance test2 to be of the carPlan type because the datatype of the carplan() method is carPlan, and thats what var evaluates
        carAccess obj = new carAccess(5,4,200,"gas");//here we are basically creating an object obj which is an instance of the carAccess type, which will be used to execute polymorphism on our main object
        Object testObject = obj.carplan();//instance testObject is created which is not of type carPlan(the parent class), but of type Object(which is the parent class of every class)
        if(testObject.getClass().getSimpleName() == "gasCar"){//now from the above step, obj.carplan has returned some value which assigns testObject to any of the 3 classes(electricCar, gasCar, hybridCar)
                                                              //in this step, we are just checking the class assigned to it with the getClass().getSimpleName()
            gasCar g = (gasCar) testObject;//if it is of the gasCar type, we are creating another instance g which is specifically of gasCar type and we are casting our testObject to be of type gasCar instead of type Object
            g.throttle();//since our instance g is of type gasCar, it will be having to the exclusive methods and hence can execute them
        }
        //another technique of checking the class assigned and executing the methods exclusive to that class
        else if (testObject instanceof electricCar) {//the instanceof function is checking if the instance testObject is an instance of the class electricCar(returns in boolean)
            ((electricCar)testObject).turbo();//instead of making a separate instance of type electricCar and setting it to a casted version of testObject, we directly cast testObject
                                          //to type electricCar and call the exclusive method
        }

        //another technique
        else if (testObject instanceof hybridCar hyb) {//its like the previous one where we check if the instance is of type hybridCar but here, if it returns true, the compiler will
                                    //automatically create an instance of type hybridCar(in this example, it is hyb), and with that instance we acn call the exclusive method. this technique
                                    // saves us the effort of casting the instance or creation of a new instance
            hyb.switchMode();
        }


    }
}
//its important to understand why exactly do we set the datatype of the newCar variable to the parent class.
// usually it would be like gasCar mercedes = new gasCar(km_pl, cylinder, gas_left);
//instead what we are actually doing is - carPlan mercedes = new gasCar(km_pl, cylinder, gas_left).
//we do this since we do not know what the user is going to input, does the user want gasCar or EV or the hybrid.
//via polymorphism,we can return the part to the right of the equal to sign (i.e. the new gasCar/ new electricCar/ new hyrbidCar)
//however, the part to the right of the equals, how do we set that up. that is the reason we implement inheritance in the first place
//we know that subclasses can inherit all the methods of the parent class. so if the datatype is of the parent class and the same
// methods are there in the subclasses, which are overriding the methods in the parent class, we can set the datatype of the parent class
//as the constant and let the user choose any of the subclasses and their respective methods will be overriding the methods in the parent class
//it also restricts us from declaring any method in the subclasses which are not their in the parent class since while compiling, the cmopiler
// will be having access only to the methods declared in the parent class.
//it also implies that an object with the datatype of the parent class can execute any code from one of the subclasses(provided that the subclasses are only overriding the methods in the parent class)
