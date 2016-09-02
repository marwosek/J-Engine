package core.serialization;

public class SerializationWriter {

    /* Static methods */

    public static int WriteBytes(byte[] destination, int pointer, byte data)
    {
        destination[pointer++] = data;

        return pointer;
    }

    public static int WriteBytes(byte[] destination, int pointer, byte[] data)
    {
        for (int i = 0; i < data.length; i++)
        {
            destination[pointer++] = data[i];
        }

        return pointer;
    }

    public static int WriteBytes(byte[] destination, int pointer, short data)
    {
        destination[pointer++] = (byte)((data >> 8) & 0xFF);
        destination[pointer++] = (byte)((data >> 0) & 0xFF);

        return pointer;
    }

    public static int WriteBytes(byte[] destination, int pointer, int data)
    {
        destination[pointer++] = (byte)((data >> 24) & 0xFF);
        destination[pointer++] = (byte)((data >> 16) & 0xFF);
        destination[pointer++] = (byte)((data >> 8) & 0xFF);
        destination[pointer++] = (byte)((data >> 0) & 0xFF);

        return pointer;
    }

    public static int WriteBytes(byte[] destination, int pointer, long data)
    {
        destination[pointer++] = (byte)((data >> 56) & 0xFF);
        destination[pointer++] = (byte)((data >> 48) & 0xFF);
        destination[pointer++] = (byte)((data >> 40) & 0xFF);
        destination[pointer++] = (byte)((data >> 32) & 0xFF);
        destination[pointer++] = (byte)((data >> 24) & 0xFF);
        destination[pointer++] = (byte)((data >> 16) & 0xFF);
        destination[pointer++] = (byte)((data >> 8) & 0xFF);
        destination[pointer++] = (byte)((data >> 0) & 0xFF);

        return pointer;
    }

    public static int WriteBytes(byte[] destination, int pointer, float data)
    {
        int bits = Float.floatToIntBits(data);

        return WriteBytes(destination, pointer, bits);
    }

    public static int WriteBytes(byte[] destination, int pointer, double data)
    {
        long bits = Double.doubleToLongBits(data);

        return WriteBytes(destination, pointer, bits);
    }

    public static int WriteBytes(byte[] destination, int pointer, boolean data)
    {
        destination[pointer++] = (byte)(data ? 1 : 0);

        return pointer;
    }

    public static int WriteBytes(byte[] destination, int pointer, String data)
    {
        pointer = WriteBytes(destination, pointer, (short)data.length());

        return WriteBytes(destination, pointer, data.getBytes());
    }

    public static byte ReadByte(byte[] source, int pointer)
    {
        return source[pointer];
    }

    public static short ReadShort(byte[] source, int pointer)
    {
        return (short)(((source[pointer] & 0xFF) << 8) | ((source[pointer + 1] & 0xFF) << 0));
    }

    public static int ReadInt(byte[] source, int pointer)
    {
        return (int)(((source[pointer] & 0xFF) << 24) | ((source[pointer + 1] & 0xFF) << 16) | ((source[pointer + 2] & 0xFF) << 8) | ((source[pointer + 3] & 0xFF) << 0));
    }

    public static long ReadLong(byte[] source, int pointer)
    {
        return (((long)source[pointer] & 0xFF) << 56) | (((long)source[pointer + 1] & 0xFF) << 48) | (((long)source[pointer + 2] & 0xFF) << 40) | (((long)source[pointer + 3] & 0xFF) << 32) |
                (((long)source[pointer + 4] & 0xFF) << 24) | (((long)source[pointer + 5] & 0xFF) << 16) | (((long)source[pointer + 6] & 0xFF) << 8) | (((long)source[pointer + 7] & 0xFF) << 0);
    }

    public static float ReadFloat(byte[] source, int pointer)
    {
        return Float.intBitsToFloat(ReadInt(source,pointer));
    }

    public static double ReadDouble(byte[] source, int pointer)
    {
        return Double.longBitsToDouble(ReadLong(source, pointer));
    }

    public static boolean ReadBoolean(byte[] source, int pointer)
    {
        return ReadByte(source, pointer) == 1 ? true : false;
    }
}
