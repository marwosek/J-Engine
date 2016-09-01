package core.math;

public class Mat4f
{

    /* Variables */

    public float[] elements = new float[4 * 4];

    /* Constructors */

    public Mat4f()
    {
        for (int i = 0; i < this.elements.length; i++) {
            this.elements[i] = 0.0f;
        }
    }

    public Mat4f(float diagonal)
    {
        for (int i = 0; i < this.elements.length; i++) {
            this.elements[i] = 0.0f;
        }

        this.elements[0 + 0 * 4] = diagonal;
        this.elements[1 + 1 * 4] = diagonal;
        this.elements[2 + 2 * 4] = diagonal;
        this.elements[3 + 3 * 4] = diagonal;
    }

    public Mat4f(float[] elements)
    {
        System.arraycopy(elements, 0, this.elements, 0, 16);
    }

    public Mat4f(Mat4f other)
    {
        System.arraycopy(other.elements, 0, this.elements, 0, 16);
    }

    public Mat4f(Vec4f row1, Vec4f row2, Vec4f row3, Vec4f row4)
    {
        this.setRow(row1, 0);
        this.setRow(row2, 1);
        this.setRow(row3, 2);
        this.setRow(row4, 3);
    }

    /* Static methods */

    public static Mat4f Orthographic(float left, float right, float bottom, float top, float near, float far)
    {
        Mat4f result = new Mat4f(1.0f);

        result.elements[0 + 0 * 4] = 2.0f / (right - left);
        result.elements[1 + 1 * 4] = 2.0f / (top - bottom);
        result.elements[2 + 2 * 4] = -2.0f / (far - near);
        result.elements[3 + 0 * 4] = -((right + left) / (right - left));
        result.elements[3 + 1 * 4] = -((top + bottom) / (top - bottom));
        result.elements[3 + 2 * 4] = -((far + near) / (far - near));

        return result;
    }

    public static Mat4f Perspective(float fov, float aspect, float near, float far)
    {
        Mat4f result = new Mat4f();

        float cot = 1.0f / (float)Math.tan(Math.toRadians((double)(fov / 2.0f)));

        result.elements[0 + 0 * 4] = cot / aspect;
        result.elements[1 + 1 * 4] = cot;
        result.elements[2 + 2 * 4] = (near + far) / (near - far);
        result.elements[2 + 3 * 4] = -1.0f;
        result.elements[3 + 2 * 4] = (2.0f * near * far) / (near - far);

        return result;
    }

    public static Mat4f Translate(Vec3f translation)
    {
        Mat4f result = new Mat4f(1.0f);

        result.elements[3 + 0 * 4] = translation.x;
        result.elements[3 + 1 * 4] = translation.y;
        result.elements[3 + 2 * 4] = translation.z;

        return result;
    }

    public static Mat4f Rotate(float angle, Vec3f axis)
    {
        Mat4f result = new Mat4f(1.0f);

        float sin = (float)Math.sin(Math.toRadians((double)angle));
        float cos = (float)Math.cos(Math.toRadians((double)angle));
        float x = axis.x;
        float y = axis.y;
        float z = axis.z;

        result.elements[0 + 0 * 4] = (x * x * (1 - cos)) + cos;
        result.elements[0 + 1 * 4] = (x * y * (1 - cos)) - (z * sin);
        result.elements[0 + 2 * 4] = (x * z * (1 - cos)) + (y * sin);

        result.elements[1 + 0 * 4] = (y * x * (1 - cos)) + (z * sin);
        result.elements[1 + 1 * 4] = (y * y * (1 - cos)) + cos;
        result.elements[1 + 2 * 4] = (y * z * (1 - cos)) - (x * sin);

        result.elements[2 + 0 * 4] = (z * x * (1 - cos)) - (y * sin);
        result.elements[2 + 1 * 4] = (z * y * (1 - cos)) + (x * sin);
        result.elements[2 + 2 * 4] = (z * z * (1 - cos)) + cos;

        return result;
    }

    public static Mat4f Scale(Vec3f scale)
    {
        Mat4f result = new Mat4f(1.0f);

        result.elements[0 + 0 * 4] = scale.x;
        result.elements[1 + 1 * 4] = scale.y;
        result.elements[2 + 2 * 4] = scale.z;

        return result;
    }

    public static Mat4f Multiply(Mat4f first, Mat4f second)
    {
        Mat4f output = new Mat4f();

        for (int row = 0; row < 4; row++)
        {
            for (int column = 0; column < 4; column++)
            {
                float tmp = 0.0f;
                for (int i = 0; i < 4; i++)
                {
                    tmp += first.elements[row + i * 4] * second.elements[i + column * 4];
                }
                output.elements[row + column * 4] = tmp;
            }
        }

        return output;
    }

    public static Mat4f Transpose(Mat4f mat)
    {
        Mat4f result = new Mat4f();

        result.setColumn(mat.getRow(0), 0);
        result.setColumn(mat.getRow(1), 1);
        result.setColumn(mat.getRow(2), 2);
        result.setColumn(mat.getRow(3), 3);

        return result;
    }

    /* Methods */

    public Mat4f multiply(Mat4f other)
    {
        float[] data = new float[16];

        for (int row = 0; row < 4; row++)
        {
            for (int column = 0; column < 4; column++)
            {
                float tmp = 0.0f;
                for (int i = 0; i < 4; i++)
                {
                    tmp += this.elements[row + i * 4] * other.elements[i + column * 4];
                }
                data[row + column * 4] = tmp;
            }
        }

        System.arraycopy(data, 0, this.elements, 0, 16);

        return this;
    }

    public Mat4f transpose()
    {
        Vec4f row1 = this.getRow(0);
        Vec4f row2 = this.getRow(1);
        Vec4f row3 = this.getRow(2);
        Vec4f row4 = this.getRow(3);

        this.setColumn(row1, 0);
        this.setColumn(row2, 1);
        this.setColumn(row3, 2);
        this.setColumn(row4, 3);

        return this;
    }

    private void setRow(Vec4f row, int id)
    {
        this.elements[id + 0 * 4] = row.x;
        this.elements[id + 1 * 4] = row.y;
        this.elements[id + 2 * 4] = row.z;
        this.elements[id + 3 * 4] = row.w;
    }

    private void setColumn(Vec4f column, int id)
    {
        this.elements[0 + id * 4] = column.x;
        this.elements[1 + id * 4] = column.y;
        this.elements[2 + id * 4] = column.z;
        this.elements[3 + id * 4] = column.w;
    }

    public Vec4f getRow(int id)
    {
        return new Vec4f(this.elements[id + 0 * 4], this.elements[id + 1 * 4], this.elements[id + 2 * 4], this.elements[id + 3 * 4]);
    }

    public Vec4f getColumn(int id)
    {
        return new Vec4f(this.elements[0 + id * 4], this.elements[1 + id * 4], this.elements[2 + id * 4], this.elements[3 + id * 4]);
    }

    @Override
    public String toString()
    {
        return    this.elements[0 + 0 * 4] + ",\t" + this.elements[0 + 1 * 4] + ",\t" + this.elements[0 + 2 * 4] + ",\t" + this.elements[0 + 3 * 4] + "\n" +
                + this.elements[1 + 0 * 4] + ",\t" + this.elements[1 + 1 * 4] + ",\t" + this.elements[1 + 2 * 4] + ",\t" + this.elements[1 + 3 * 4] + "\n" +
                + this.elements[2 + 0 * 4] + ",\t" + this.elements[2 + 1 * 4] + ",\t" + this.elements[2 + 2 * 4] + ",\t" + this.elements[2 + 3 * 4] + "\n" +
                + this.elements[3 + 0 * 4] + ",\t" + this.elements[3 + 1 * 4] + ",\t" + this.elements[3 + 2 * 4] + ",\t" + this.elements[3 + 3 * 4];
    }

}