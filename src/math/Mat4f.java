package math;

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

    public Mat4f(Vec4f row1, Vec4f row2, Vec4f row3, Vec4f row4)
    {
        this.setRow(row1, 0);
        this.setRow(row2, 1);
        this.setRow(row3, 2);
        this.setRow(row4, 3);
    }

    /* Methods */

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

    public String toString()
    {
        return    this.elements[0 + 0 * 4] + ",\t" + this.elements[0 + 1 * 4] + ",\t" + this.elements[0 + 2 * 4] + ",\t" + this.elements[0 + 3 * 4] + "\n" +
                + this.elements[1 + 0 * 4] + ",\t" + this.elements[1 + 1 * 4] + ",\t" + this.elements[1 + 2 * 4] + ",\t" + this.elements[1 + 3 * 4] + "\n" +
                + this.elements[2 + 0 * 4] + ",\t" + this.elements[2 + 1 * 4] + ",\t" + this.elements[2 + 2 * 4] + ",\t" + this.elements[2 + 3 * 4] + "\n" +
                + this.elements[3 + 0 * 4] + ",\t" + this.elements[3 + 1 * 4] + ",\t" + this.elements[3 + 2 * 4] + ",\t" + this.elements[3 + 3 * 4];
    }

}
