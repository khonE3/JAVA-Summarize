# JAVA-Summarize
All commands JAVA


run code -> ConceptJAVA.java
# สรุปโค้ด `ConceptJAVA`

## 1. การประกาศตัวแปร (Variables)
- **ตัวอย่างรูปแบบการประกาศตัวแปร:**
  ```java
  // type variableName = value;
  char _one = 'J';                     // ตัวแปรประเภท char
  String _str = "osepha";              // ตัวแปรประเภท String
  int This_Integer = 3;                // ตัวแปรประเภท int
  float This_Float = 1.66f;            // ตัวแปรประเภท float (ต้องมี f)
  double This_Double = 3.3456456;      // ตัวแปรประเภท double
  final int Const = 15;                // ตัวแปร final (ค่าคงที่)
  ```

## 2. การพิมพ์ข้อความ (Print OUTPUT)
- **พิมพ์แบบปกติ (`print`)**
  ```java
  System.out.print(_one);
  ```
- **พิมพ์พร้อมขึ้นบรรทัดใหม่ (`println`)**
  ```java
  System.out.println(_str);
  System.out.println(This_Integer + Const + This_Double);
  ```
- **พิมพ์แบบจัดรูปแบบ (`printf`)**
  ```java
  System.out.printf("Float ไม่สามารถบวก + Double Flaot = %f ", This_Float);
  ```

## 3. การแปลงชนิดข้อมูล (Casting)
### 3.1 การแปลงแบบขยาย (Widening Casting - อัตโนมัติ)
- แปลงจากชนิดข้อมูลขนาดเล็กไปขนาดใหญ่
  ```java
  int my_Int = 10;
  double my_Double = my_Int;  // แปลงอัตโนมัติจาก int เป็น double
  System.out.println(my_Int);    // 10
  System.out.println(my_Double); // 10.0
  ```

### 3.2 การแปลงแบบลดขนาด (Narrowing Casting - ต้องทำเอง)
- แปลงจากชนิดข้อมูลขนาดใหญ่ไปขนาดเล็ก
  ```java
  double my__Double = 9.21d;
  long my__long = (long) my__Double;  // แปลงด้วยตนเองจาก double เป็น long
  System.out.println(my__Double); // 9.21
  System.out.println(my__long);   // 9
  ```

## 4. การจัดการ String
- คำนวณความยาว
  ```java
  System.out.println(alphabetic.length());
  ```
- แปลงเป็นตัวพิมพ์ใหญ่/เล็ก
  ```java
  System.out.println(alphabetic.toUpperCase());
  System.out.println(alphabetic.toLowerCase());
  ```
- หา index ของตัวอักษร
  ```java
  System.out.println(alphabetic.indexOf("G"));
  ```
- การต่อ String
  ```java
  String ConcateStr = str12 + int12;  // ได้ผลลัพธ์เป็น "1220"
  System.out.println(ConcateStr);
  ```

## 5. การใช้งาน Math
- สร้างเลขสุ่ม
  ```java
  int randomNum = (int) (Math.random() * 101);  // 0 ถึง 100
  System.out.printf("Random number is %d\n", randomNum);
  ```

## 6. การใช้งาน Array
- การประกาศและเข้าถึงค่าใน Array
  ```java
  String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
  System.out.println("Array of cars = " + cars[0] + " " + cars[2]);
  ```

## 7. การใช้งาน Methods
- **เรียกใช้ Method แบบไม่มีการคืนค่า**
  ```java
  myMethod("JAVA", 69, " -->");
  ```
- **Method คืนค่าผลลัพธ์**
  ```java
  int CallRetrun = ReturnMethod(54, 56);
  System.out.println("Calling Retrun = " + CallRetrun);
  ```
- **Method Overloading**
  ```java
  int PmyNum1 = plusMethod(88, 75);      // รับค่า int
  double PmyNum2 = plusMethod(64.3, 36.26); // รับค่า double
  System.out.println("int: " + PmyNum1);
  System.out.println("double: " + PmyNum2);
  ```

## 8. การรับค่าจากผู้ใช้ (Scanner)
- อ่านข้อมูลที่ผู้ใช้กรอก
  ```java
  Scanner myS = new Scanner(System.in);
  System.out.println("Enter username");
  String userName = myS.nextLine();
  System.out.println("Username is: " + userName);
  ```

## 9. นิยาม Methods
- Method ที่ไม่มีการคืนค่า
  ```java
  static void myMethod(String lang, int numoflang, String arrowkak) {
      System.out.println(lang + " kak" + arrowkak + " " + numoflang + " times");
  }
  ```
- Method คืนค่าผลลัพธ์
  ```java
  static int ReturnMethod(int xr, int yr) {
      return xr + yr;
  }
  ```
- Method Overloading
  ```java
  static int plusMethod(int xp, int yp) {
      return xp + yp;
  }

  static double plusMethod(double xp, double yp) {
      return xp + yp;
  }
  
