package com.ylw.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefelectDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        //setValue();
        testPrivateClazz();
    }



    public  void getClazz() throws ClassNotFoundException {
        //第一种方式：使用Class.forName的方式
        Class class1 = Class.forName("Employee");

        //第二种方式：java中每个类型都有class 属性.
        Class class2 = Employee.class;

        //第三种方式：java语言中任何一个java对象都有getClass 方法
        Employee e = new Employee();
        Class class3 = e.getClass(); //c3是运行时类 (e的运行时类是Employee)
    }

    public void getInstance() throws ClassNotFoundException, IllegalAccessException,
                                    InstantiationException, NoSuchMethodException,
                                    InvocationTargetException {

       // 方式一：创建此Class 对象所表示的类的一个新实例 调用了User的无参数构造方法.
       Class<?> forName = Class.forName("com.ylw.reflect.Employee");
       Object newInstance = forName.newInstance();

       // 方式二：实例化有参构造函数
       Class<?> forName1 = Class.forName("com.ylw.reflect.Employee");
       Constructor<?> constructor = forName1.getConstructor(String.class, String.class);
       Employee newInstance1 = (Employee) constructor.newInstance("123", "123");

   }

   public static void setValue() throws ClassNotFoundException,
                                 IllegalAccessException, InstantiationException,
                                 NoSuchFieldException {
       Class<?> classUser = Class.forName("com.ylw.reflect.Employee");

       //Test1: 获取到当前的所有属性
       Field[] fields = classUser.getDeclaredFields();
       for (Field field : fields) {
           System.out.println(field.getName());
       }

       //Test2: 获取当前所有的方法
       Method[] declaredMethods = classUser.getDeclaredMethods();
       for (Method method : declaredMethods) {
           System.out.println(method.getName());
       }

       //1.  为Employee对象私有属性赋值
       Employee employee = (Employee) classUser.newInstance();
       Field nameField = classUser.getDeclaredField("name");
       // 标记为true 允许反射赋值
       nameField.setAccessible(true);
       nameField.set(employee, "张三");

       Field sexField = classUser.getDeclaredField("sex");
       // 标记为true 允许反射赋值
       sexField.setAccessible(true);
       sexField.set(employee, "男");
       System.out.println("使用反射机制给Employee赋值为:"+ employee.toString());

   }

    private static void testPrivateClazz() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<?> classUser = Class.forName("com.ylw.reflect.PrivateEmployee");

        //Test1: 获取到当前的所有属性
        Field[] fields = classUser.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        //Test2: 获取当前所有的方法
        Method[] declaredMethods = classUser.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }

        //1.  为Employee对象私有属性赋值
        PrivateEmployee employee = (PrivateEmployee) classUser.newInstance();
        Field nameField = classUser.getDeclaredField("name");
        // 标记为true 允许反射赋值
        nameField.setAccessible(true);
        nameField.set(employee, "张三");

        Field sexField = classUser.getDeclaredField("sex");
        // 标记为true 允许反射赋值
        sexField.setAccessible(true);
        sexField.set(employee, "男");
        System.out.println("使用反射机制给Employee赋值为:"+ employee.toString());

    }



}
