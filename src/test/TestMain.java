package test;

import core.math.Mat4f;
import core.math.Vec2f;
import static core.serialization.SerializationWriter.*;

public class TestMain
{

    public static void main(String[] args)
    {
        /*
        Vec2f a = new Vec2f();
        Vec2f b = new Vec2f(1.0f);
        Vec2f c = new Vec2f(2.0f, 5.0f);



        System.out.println("a: " + a.toString());
        System.out.println("b: " + b.toString());
        System.out.println("c: " + c.toString());

        System.out.println(a.equals(b));

        float[] elem_a = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        float[] elem_b = {3,1,11,4,5,2,10,5,8,7,2,6,9,8,1,7};

        Mat4f mat_a = new Mat4f(elem_a);
        Mat4f mat_b = new Mat4f(elem_b);
        Mat4f mat_c = Mat4f.Transpose(mat_a);

        System.out.println(mat_a);

        //mat_a.transpose();

        System.out.println();
        System.out.println(mat_a);
        System.out.println();
        System.out.println(mat_c);
        */

        byte[] store = new byte[16];

        int data_int = -2147483648;
        short data_short = -32768;
        long data_long = -9223372036854775808L;
        float data_float = Float.MIN_VALUE;
        boolean data_boolean = true;

        int pointer = WriteBytes(store, 0, data_boolean);
        printHex(store);

        //int reassembled_int = ReadInt(store, 0);
        //short reassembled_short = ReadShort(store, 0);
        //long reassembled_long = ReadLong(store, 0);
        //float reassembled_float = ReadFloat(store, 0);
        boolean reassembled_boolean = ReadBoolean(store, 0);
        System.out.println(reassembled_boolean);
    }

    static void printHex(byte[] data)
    {
        for (int i = 0; i < data.length; i++)
        {
            System.out.printf("0x%x ", data[i]);
        }
        System.out.println();
    }
}
