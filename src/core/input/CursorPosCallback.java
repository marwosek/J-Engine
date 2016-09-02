package core.input;

import org.lwjgl.glfw.*;

public class CursorPosCallback implements GLFWCursorPosCallbackI
{
    @Override
    public void invoke(long window, double xpos, double ypos)
    {
        System.out.println("x - " + xpos + ", y - " + ypos);
    }
}
