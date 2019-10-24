/*package com.company;

public class Kettle extends Appliance {
    @Override
    public void doWork() {
        super.doWork();
        System.out.println(" Кипячу воду ");
    }
}
 */
package com.company;

//public class Kettle extends Appliance {
public class Kettle implements ApplianceAgain {
    public static void doWork(){
        System.out.println(" Кипячу воду ");
    }
}
