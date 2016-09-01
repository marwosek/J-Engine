package core.math;

public class Vec2f
{

    /* Variables */

    public float x;
    public float y;

    /* Constructors */

    public Vec2f()
    {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Vec2f(float scalar)
    {
        this.x = scalar;
        this.y = scalar;
    }

    public Vec2f(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public Vec2f(Vec2f other)
    {
        this.x = other.x;
        this.y = other.y;
    }

    /* Static methods */

    public static Vec2f Add(Vec2f vec, float value)
    {
        Vec2f result = new Vec2f();

        result.x = vec.x + value;
        result.y = vec.y + value;

        return result;
    }

    public static Vec2f Subtract(Vec2f vec, float value)
    {
        Vec2f result = new Vec2f();

        result.x = vec.x - value;
        result.y = vec.y - value;

        return result;
    }

    public static Vec2f Multiply(Vec2f vec, float value)
    {
        Vec2f result = new Vec2f();

        result.x = vec.x * value;
        result.y = vec.y * value;

        return result;
    }

    public static Vec2f Divide(Vec2f vec, float value)
    {
        Vec2f result = new Vec2f();

        result.x = vec.x / value;
        result.y = vec.y / value;

        return result;
    }

    public static Vec2f Add(Vec2f first, Vec2f second)
    {
        Vec2f result = new Vec2f();

        result.x = first.x + second.x;
        result.y = first.y + second.y;

        return result;
    }

    public static Vec2f Subtract(Vec2f first, Vec2f second)
    {
        Vec2f result = new Vec2f();

        result.x = first.x - second.x;
        result.y = first.y - second.y;

        return result;
    }

    public static Vec2f Multiply(Vec2f first, Vec2f second)
    {
        Vec2f result = new Vec2f();

        result.x = first.x * second.x;
        result.y = first.y * second.y;

        return result;
    }

    public static Vec2f Divide(Vec2f first, Vec2f second)
    {
        Vec2f result = new Vec2f();

        result.x = first.x / second.x;
        result.y = first.y / second.y;

        return result;
    }

    /* Methods */

    public Vec2f add(float value)
    {
        this.x += value;
        this.y += value;

        return this;
    }

    public Vec2f subtract(float value)
    {
        this.x -= value;
        this.y -= value;

        return this;
    }

    public Vec2f multiply(float value)
    {
        this.x *= value;
        this.y *= value;

        return this;
    }

    public Vec2f divide(float value)
    {
        this.x /= value;
        this.y /= value;

        return this;
    }

    public Vec2f add(Vec2f other)
    {
        this.x += other.x;
        this.y += other.y;

        return this;
    }

    public Vec2f subtract(Vec2f other)
    {
        this.x -= other.x;
        this.y -= other.y;

        return this;
    }

    public Vec2f multiply(Vec2f other)
    {
        this.x *= other.x;
        this.y *= other.y;

        return this;
    }

    public Vec2f divide(Vec2f other)
    {
        this.x /= other.x;
        this.y /= other.y;

        return this;
    }

    public boolean equals(Vec2f other)
    {
        return (this.x == other.x) && (this.y == other.y);
    }

    public String toString()
    {
        return "x = " + this.x + ", y = " + this.y;
    }
}