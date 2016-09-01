package math;

public class Vec3f
{

    /* Variables */

    public float x;
    public float y;
    public float z;

    /* Constructors */

    public Vec3f()
    {
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
    }

    public Vec3f(float scalar)
    {
        this.x = scalar;
        this.y = scalar;
        this.z = scalar;
    }

    public Vec3f(float x, float y, float z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3f(Vec3f other)
    {
        this.x = other.x;
        this.y = other.y;
        this.z = other.z;
    }

    /* Static methods */

    public static Vec3f Add(Vec3f vec, float value)
    {
        Vec3f result = new Vec3f();

        result.x = vec.x + value;
        result.y = vec.y + value;
        result.z = vec.z + value;

        return result;
    }

    public static Vec3f Subtract(Vec3f vec, float value)
    {
        Vec3f result = new Vec3f();

        result.x = vec.x - value;
        result.y = vec.y - value;
        result.z = vec.z - value;

        return result;
    }

    public static Vec3f Multiply(Vec3f vec, float value)
    {
        Vec3f result = new Vec3f();

        result.x = vec.x * value;
        result.y = vec.y * value;
        result.z = vec.z * value;

        return result;
    }

    public static Vec3f Divide(Vec3f vec, float value)
    {
        Vec3f result = new Vec3f();

        result.x = vec.x / value;
        result.y = vec.y / value;
        result.z = vec.z / value;

        return result;
    }

    public static Vec3f Add(Vec3f first, Vec3f second)
    {
        Vec3f result = new Vec3f();

        result.x = first.x + second.x;
        result.y = first.y + second.y;
        result.z = first.z + second.z;

        return result;
    }

    public static Vec3f Subtract(Vec3f first, Vec3f second)
    {
        Vec3f result = new Vec3f();

        result.x = first.x - second.x;
        result.y = first.y - second.y;
        result.z = first.z - second.z;

        return result;
    }

    public static Vec3f Multiply(Vec3f first, Vec3f second)
    {
        Vec3f result = new Vec3f();

        result.x = first.x * second.x;
        result.y = first.y * second.y;
        result.z = first.z * second.z;

        return result;
    }

    public static Vec3f Divide(Vec3f first, Vec3f second)
    {
        Vec3f result = new Vec3f();

        result.x = first.x / second.x;
        result.y = first.y / second.y;
        result.z = first.z / second.z;

        return result;
    }

    /* Methods */

    public Vec3f add(float value)
    {
        this.x += value;
        this.y += value;
        this.z += value;

        return this;
    }

    public Vec3f subtract(float value)
    {
        this.x -= value;
        this.y -= value;
        this.z -= value;

        return this;
    }

    public Vec3f multiply(float value)
    {
        this.x *= value;
        this.y *= value;
        this.z *= value;

        return this;
    }

    public Vec3f divide(float value)
    {
        this.x /= value;
        this.y /= value;
        this.z /= value;

        return this;
    }

    public Vec3f add(Vec3f other)
    {
        this.x += other.x;
        this.y += other.y;
        this.z += other.z;

        return this;
    }

    public Vec3f subtract(Vec3f other)
    {
        this.x -= other.x;
        this.y -= other.y;
        this.z -= other.z;

        return this;
    }

    public Vec3f multiply(Vec3f other)
    {
        this.x *= other.x;
        this.y *= other.y;
        this.z *= other.z;

        return this;
    }

    public Vec3f divide(Vec3f other)
    {
        this.x /= other.x;
        this.y /= other.y;
        this.z /= other.z;

        return this;
    }

    public boolean equals(Vec3f other)
    {
        return (this.x == other.x) && (this.y == other.y) && (this.z == other.z);
    }

    public String toString()
    {
        return "x = " + this.x + ", y = " + this.y + ", z = " + this.z;
    }
}