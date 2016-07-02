package com.gribkov.spb.projects.conversetionsTypes;

/**
 * Created by alexandrgribkov on 01.07.16.
 */
public class ConversetionTypes
{
    public static void main(String []args)
    {
        System.out.println("Восходящее преобразование типов");
        byte b1 = 25;
        System.out.println("byte to short - " + (short)b1);
        short s1 = 35;
        System.out.println("short to int - " + (int)s1);
        int i1 = 155;
        System.out.println("int to long - " + (long)i1);
        int i2 = 12312312;
        System.out.println("int to float - " + (float)i2);
        int i3 = 312213521;
        System.out.println("int to double - " + (double)i3);
        char c1 = 'c';
        System.out.println("char to int - " + (int)c1);
        long l1 = 12312312L;
        System.out.println("long to float - " + (float)l1);
        long l2 = 12312234234L;
        System.out.println("long to double - " + (double)l2);

        System.out.println();
        System.out.println("Нисходящее преобразование типов");
        long l3 = Long.MAX_VALUE;
        System.out.println("long to int - " + (int)l3);
        int i4 = Integer.MAX_VALUE;
        System.out.println("int to byte - " + (byte)i4);
        int i5 = 1231231;
        System.out.println("int to char - " + (char)b1);
        float f1 = Float.MAX_VALUE;
        System.out.println("float to int - " + (int)f1);
        double d1 = Double.MAX_VALUE;
        System.out.println("double to int - " + (int)d1);
        float f2 = Float.MAX_VALUE;
        System.out.println("float to long - " + (long)f2);
        double d2 = 1.1232141241E7D;
        System.out.println("double to long - " + (long)d2);
        float f3 = 1.1231231E10F;
        System.out.println("float to byte - " + (byte)f3);
        double d3 = 1.12332E5D;
        System.out.println("double to byte - " + (byte)d3);

    }
}
