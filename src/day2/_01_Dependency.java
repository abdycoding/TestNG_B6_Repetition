package day2;

import Utility.Basedriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency  {
    //Dependency (bağımlılık):Bir testin diğer bir testin sonucuna veya
    //belirli bir duruma bağlı olduğu durumları ifade eder.
    //Örneğin, bir testin çalışabilmesi için önce başka bir testin başarılı
    //bir şekilde tamamlanması gerekebilir. Bu tür senaryolarda TestNG'nin
    // Dependency özelliği devreye girer.

    // bağımlı testler, direk metodundan çalıştırdığınızda bağımlı olduğu metod zincirinde
// 2 üste kadar otomatik çağırıp çalışabilir.

    @Test
    public void startCar(){ System.out.println("Car Started");
//        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    public void DriveCar(){ System.out.println("Drive Car");}

    @Test(dependsOnMethods = {"startCar", "DriveCar"}) // bağımlılık 1 den fazla verilebilir
    public void ParkCar(){ System.out.println("Park Car");}

    @Test(dependsOnMethods = {"ParkCar"}, alwaysRun = true) // hatali olsada sen basla
    public void stopCar(){ System.out.println("Car Stopped");}

        }

