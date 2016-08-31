package math;

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
