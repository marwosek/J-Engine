package test;

import math.Mat4f;
import math.Vec2f;

public class TestMain
{

    public static void main(String[] args)
    {
        Vec2f a = new Vec2f();
        Vec2f b = new Vec2f(1.0f);
        Vec2f c = new Vec2f(2.0f, 5.0f);



        System.out.println("a: " + a.toString());
        System.out.println("b: " + b.toString());
        System.out.println("c: " + c.toString());

        System.out.println(a.equals(b));

        float[] elem = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        Mat4f mat_a = new Mat4f(elem);

        System.out.println(mat_a);
    }
}
