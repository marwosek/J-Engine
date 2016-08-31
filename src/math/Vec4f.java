package math;

public class Vec4f
{

    /* Variables */

    public float x;
    public float y;
    public float z;
    public float w;

    /* Constructors */

    public Vec4f()
    {
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
        this.w = 0.0f;
    }

    public Vec4f(float scalar)
    {
        this.x = scalar;
        this.y = scalar;
        this.z = scalar;
        this.w = scalar;
    }

    public Vec4f(float x, float y, float z, float w)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public Vec4f(Vec4f other)
    {
        this.x = other.x;
        this.y = other.y;
        this.z = other.z;
        this.w = other.w;
    }

    /* Methods */

    public Vec4f add(float value)
    {
        this.x += value;
        this.y += value;
        this.z += value;
        this.w += value;

        return this;
    }

    public Vec4f subtract(float value)
    {
        this.x -= value;
        this.y -= value;
        this.z -= value;
        this.w -= value;

        return this;
    }

    public Vec4f multiply(float value)
    {
        this.x *= value;
        this.y *= value;
        this.z *= value;
        this.w *= value;

        return this;
    }

    public Vec4f divide(float value)
    {
        this.x /= value;
        this.y /= value;
        this.z /= value;
        this.w /= value;

        return this;
    }

    public Vec4f add(Vec4f other)
    {
        this.x += other.x;
        this.y += other.y;
        this.z += other.z;
        this.w += other.w;

        return this;
    }

    public Vec4f subtract(Vec4f other)
    {
        this.x -= other.x;
        this.y -= other.y;
        this.z -= other.z;
        this.w -= other.w;

        return this;
    }

    public Vec4f multiply(Vec4f other)
    {
        this.x *= other.x;
        this.y *= other.y;
        this.z *= other.z;
        this.w *= other.w;

        return this;
    }

    public Vec4f divide(Vec4f other)
    {
        this.x /= other.x;
        this.y /= other.y;
        this.z /= other.z;
        this.w /= other.w;

        return this;
    }

    public boolean equals(Vec4f other)
    {
        return (this.x == other.x) && (this.y == other.y) && (this.z == other.z) && (this.w == other.w);
    }

    public String toString()
    {
        return "x = " + this.x + ", y = " + this.y + ", z = " + this.z + ", w = " + this.w;
    }
}
