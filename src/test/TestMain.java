package test;

import core.math.Mat4f;
import core.math.Vec2f;

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
    }
}
